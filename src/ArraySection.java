import java.util.Scanner;

/**
 * Created by Z_HAO on 2020/1/25
 */
public class ArraySection {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int []ans = new int[n + 1];
        for(int i = 1;i <= n;i ++) {
            ans[i] = sc.nextInt();
        }
        int out = 0;
        int pos = 0;
        int sum = 0;
        for(int i = 1;i <= n;i ++) {
            sum += ans[i];
            if(sum > m) {
                out ++;
                sum = ans[i];
            }
        }
        System.out.print(out + 1);
    }
}
