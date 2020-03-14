import java.util.Arrays;

/**
 * @author Z_HAO 2020/3/7
 */
public class SelectionSort {
    public static void main(String[] args) {
        int n = 8;
        int []a = new int [n];
        a[0] = 45;a[1] = 33;a[2] = 24;a[3] = 45;
        a[4] = 12;a[5] = 12;a[6] = 24;a[7] = 12;
        int time = 0;
        for(int pos = 0;pos < n;pos ++) {
            int min = Integer.MAX_VALUE;
            int p = pos;
            for(int i = pos + 1;i < n;i ++) {
                time ++;
                if(a[i] < min) {
                    min = a[i];
                    p = i;
                }
            }
            if(p != pos) {
                int t = a[pos];
                a[pos] = a[p];
                a[p] = t;
            }
            System.out.println(Arrays.toString(a));
        }
        System.out.println(time + " comparisons");
    }
}
