import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Z_HAO on 2020/1/22
 */
public class Pell {
    static final int MOD = 32767;
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int l = 0;
        int r = 1;
        int n = 1000010;
        ans.add(l);
        ans.add(r);
        while(n -- > 0) {
            int temp = l + 2 * r;
            if(temp >= MOD) {
                temp %= MOD;
            }
            ans.add(temp);
            l = r;
            r = temp;
        }
        n = new Scanner(System.in).nextInt();
        for(int j = 1;j <= n;j ++) {
            int i = new Scanner(System.in).nextInt();
            System.out.println(ans.get(i));
        }
    }
}
