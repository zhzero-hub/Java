import java.util.Arrays;
import java.util.Random;

/**
 * @author Z_HAO 2020/3/20
 */
public class BubbleSort {

    public static boolean judge(int []a , int x , int l , int r) {
        if(r <= l) {
            return false;
        }
        int temp = a[l] + a[r];
        if(temp == x) {
            System.out.println(a[l] + " " + a[r]);
            return true;
        }
        boolean ret = false;
        if(temp > x) {
            ret = judge(a , x , l , r - 1);
        }
        else {
            ret = judge(a , x , l + 1 , r);
        }
        return ret;
    }

    public static int expRec(int x , int n) {
        if(n == 0) {
            return 1;
        }
        else if(n == 1) {
            return x;
        }
        int ret = expRec(x , n / 2);
        if(n % 2 == 1) {
            return ret * ret * x;
        }
        else {
            return ret * ret;
        }
    }

    public static void bubble(int []a , int i , int n) {
        if(i == n) {
            return;
        }
        int range = n - i;
        for(int j = 1;j <= range;j ++) {
            if(a[j + 1] < a[j]) {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
        bubble(a , i + 1 , n);
    }

    public static void main(String[] args) {
        int n = 10;
        int[] a = new int[n + 1];
        Random random = new Random();
        for (int i = 1; i <= n; i++) {
            a[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(a));
        bubble(a, 1, n);
        System.out.println(Arrays.toString(a));
        if (!judge(a, 50, 1, n)) {
            System.out.println("No");
        }
    }
}
