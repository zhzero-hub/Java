import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Z_HAO on 2020/1/31
 */
public class NumberTriangle {
    static int n;
    static int sum;

    static void dfs(ArrayList<Integer> line , int n , int []visit , int [][]mul , int s , int []flag) {
        if(line.size() == n) {
            if(s == sum) {
                for(int l: line) {
                    System.out.print(l + " ");
                }
                flag[0] = 1;
            }
            return;
        }
        for(int i = 1;i <= n;i ++) {
            if(visit[i] == 0) {
                visit[i] = 1;
                line.add(i);
                s += mul[n - 1][line.size() - 1] * i;
                if(s > sum) {
                    visit[i] = 0;
                    line.remove(line.remove(line.size() - 1));
                    return;
                }
                dfs(line , n , visit , mul , s , flag);
                if(flag[0] == 1) {
                    return;
                }
                s -= mul[n - 1][line.size() - 1] * i;
                visit[i] = 0;
                line.remove(line.size() - 1);
            }
        }
    }

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int [][] mul = new int [13][13];
        for(int i = 0;i <= 12;i ++) {
            mul[i][0] = 1;
        }
        for(int i = 1;i <= 12;i ++) {
            for(int j = 1;j <= i;j ++) {
                mul[i][j] = mul[i][j - 1] * (i - j + 1) / j;
            }
        }
        n = sc.nextInt();
        sum = sc.nextInt();
        ArrayList<Integer> line = new ArrayList<>();
        int []visit = new int [n + 1];
        int []flag = new int [1];
        dfs(line , n , visit , mul , 0 , flag);
    }
}