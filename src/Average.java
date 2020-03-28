/**
 * @author Z_HAO 2020/3/20
 */
public class Average {
    public static int f(int []a , int i , int n) {
        if(i == n) {
            return a[n];
        }
        if(i == 1) {
            return (f(a , i + 1 , n) + a[i]) / n;
        }
        return f(a , i + 1 , n) + a[i];
    }

    public static void main(String[] args) {
        int n = 100;
        int []a = new int[n + 1];
        for(int i = 1;i <= n;i ++) {
            a[i] = i;
        }
        System.out.println(f(a , 1 , n));
    }
}
