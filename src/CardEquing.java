import java.util.Scanner;

/**
 * Created by Z_HAO on 2020/1/31
 */
public class CardEquing {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int []ans = new int [n + 1];
        for(int i = 1;i <= n;i ++) {
            int t = sc.nextInt();
            sum += t;
            ans[i] = t;
        }
        int out = 0;
        int aver = sum / n;
        ans[0] = aver;
        for(int i = 0;i < n;i ++) {
            if(ans[i] != aver) {
                int temp = ans[i] - aver;
                ans[i] = aver;
                ans[i + 1] += temp;
                out ++;
            }
        }
        System.out.print(out);
    }
}
