import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
/**
 * @author Z_HAO 2020/4/6
 */
public class DynamicPlanning {

    public static int lCS(String a , String b , int i , int j) {
        if(i < 0 || j < 0) {
            return 0;
        }
        if(a.charAt(i) == b.charAt(j)) {
            return lCS(a , b , i - 1 , j - 1) + 1;
        }
        else {
            return Math.max(lCS(a , b , i - 1 , j) , lCS(a , b , i , j - 1));
        }
    }

    public static int matChain(int []r , int [][]c , int n) {
        for(int i = 1;i <= n;i ++) {
            c[i][i] = 0;
        }
        for(int d = 1;d < n;d ++) {
            for(int i = 1;i <= n - d;i ++) {
                int j = i + d;
                c[i][j] = Integer.MAX_VALUE;
                for(int k = i + 1;k <= j;k ++) {
                    c[i][j] = Math.min(c[i][j] , c[i][k - 1] + c[k][j] + r[i] * r[k] * r[j + 1]);
                }
            }
        }
        return c[1][n];
    }

    public static int knapsack(int []volume , int []value , int i , int j , int n , int C , int []ans , int temp) {
        if(i == n) {
            ans[i] = temp;
            return temp;
        }
        if(volume[i] + j > C) {
            ans[i] = temp;
            knapsack(volume , value , i + 1 , j , n, C , ans , temp);
            return temp;
        }
        ans[i] = Math.min(knapsack(volume, value, i + 1, j + volume[i], n, C, ans, temp + value[i]) , temp);
        return ans[i];
    }

    static Comparator<Pair<Integer, Double>> cmp = new Comparator<Pair<Integer , Double>>() {
        @Override
        public int compare(Pair<Integer, Double> integerIntegerPair, Pair<Integer, Double> t1) {
            return (int)(integerIntegerPair.getValue() - t1.getValue());
        }
    };

    public static int multiBag(int []volume , int []value , int n , int C) {
        ArrayList<Pair<Integer, Double>> vn = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double temp = (double)value[i] / volume[i];
            vn.add(new Pair<>(i , temp));
        }
        vn.sort(cmp);
        System.out.println(vn);
        int ans = 0;
        int bag = 0;
        for(Pair<Integer, Double> x: vn) {
            int num = (C - bag) / volume[x.getKey()];
            bag += num * volume[x.getKey()];
            ans += num * value[x.getKey()];
            if(bag == C) {
                break;
            }
        }
        return ans;
    }

    public static int coinChange(int []coin , int []ans , int i , int n) {
        if(i < 0) {
            return Integer.MAX_VALUE;
        }
        else if(i == 0) {
            return 0;
        }
        for(int j = 0;j < n;j ++) {
            if(i - coin[j] >= 0) {
                ans[i] = Math.min(coinChange(coin , ans , i - coin[j] , n) + 1 , ans[i]);
            }
        }
        return ans[i];
    }

    public static void main(String[] args) {
        /*int n = 4;
        int []volume = new int[n];
        int []value = new int[n];
        volume[0] = 2;value[0] = 3;
        volume[1] = 3;value[1] = 4;
        volume[2] = 5;value[2] = 5;
        volume[3] = 6;value[3] = 7;
        int []ans = new int[n + 1];
        int C = 11;
        System.out.println(multiBag(volume , value , n , C));*/
        int []ans = new int[16];
        for(int i = 0;i < 16;i ++) {
            ans[i] = Integer.MAX_VALUE;
        }
        int []coin = new int[3];
        coin[0] = 1;coin[1] = 5;coin[2] = 9;
        coinChange(coin , ans , 15 , 3);
        System.out.println(ans[15]);
    }
}
