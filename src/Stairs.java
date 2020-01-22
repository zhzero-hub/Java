import java.util.Scanner;

public class Stairs {
    public static void main(String []args) {
        int []ans = new int[10010];
        ans[0] = 0;
        ans[1] = 1;
        ans[2] = 2;
        for(int i = 3;i < 10010;i ++) {
            ans[i] = ans[i - 1] + ans[i - 2];
        }
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int i = sc.nextInt();
            System.out.println(ans[i]);
        }
    }
}
