import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Z_HAO 2020/3/14
 */
public class PositiveIntegerSequence {
    static void dfs(ArrayList<Integer> line , int []ans , int l , int r) {
        int range = Math.abs(l - r);
        if(range <= 1) {
            return;
        }
        for(int i = 1;i < range;i ++) {
            line.add(i);
            ans[0] ++;
            dfs(line , ans , r , i);
            line.remove(line.size() - 1);
        }
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int []ans = new int[1];
        ArrayList<Integer> line = new ArrayList<>();
        line.add(n);
        for(int i = 1;i < n;i ++) {
            line.add(i);
            dfs(line , ans , n , i);
            line.remove(line.size() - 1);
        }
        System.out.println((ans[0] + n) % 10000);
    }
}








