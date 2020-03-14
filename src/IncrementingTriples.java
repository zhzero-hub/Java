import javafx.util.Pair;

import java.util.Scanner;

/**
 * @author Z_HAO 2020/3/14
 */
public class IncrementingTriples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int [n + 1];
        for(int i = 1;i <= n;i ++) {
            a[i] = sc.nextInt();
        }
        int l = 1;
        int mid = 2;
        int pos = 2;
        int ans = 0;
        while(mid + 1 < n) {
            while(a[l] >= a[mid]) {
                mid ++;
                if(mid == n) {
                    l ++;
                    mid = l + 1;
                    if(mid == n) {
                        System.out.println(ans);
                        return;
                    }
                }
            }
            for(int j = mid + 1;j <= n;j ++) {
                if(a[j] > a[mid]) {
                    ans ++;
                }
            }
            mid ++;
        }
        System.out.println(ans);
    }
}
