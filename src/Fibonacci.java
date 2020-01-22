import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int l = 0;
        int r = 1;
        int n = 21;
        ans.add(l);
        ans.add(r);
        while(n -- > 0) {
            int temp = l + r;
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
