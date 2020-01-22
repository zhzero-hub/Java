import java.util.Scanner;

/**
 * Created by Z_HAO on 2020/1/22
 */
public class Stairs2 {
    public static void main(String []args) {
        int []ans = new int[110];
        ans[0] = 0;
        ans[1] = 1;
        ans[2] = 2;
        ans[3] = 4;
        for(int i = 4;i < 110;i ++) {
            ans[i] = ans[i - 1] + ans[i - 2] + ans[i - 3];
        }
        int i = new Scanner(System.in).nextInt();
        while(i != 0) {
            System.out.println(ans[i]);
            i = new Scanner(System.in).nextInt();
        }
    }
}
