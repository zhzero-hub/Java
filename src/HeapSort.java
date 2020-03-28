import java.util.Arrays;
import java.util.Random;

/**
 * @author Z_HAO 2020/3/18
 */
public class HeapSort {
    static void siftDown(int []a , int n , int i , int []count) {
        boolean done = false;
        if (2 * i > n) {
            return;
        }
        do {
            i *= 2;
            count[0] += 2;
            if (i + 1 <= n && a[i + 1] > a[i]) {
                i ++;
            }
            if (a[i / 2] < a[i]) {
                int t = a[i / 2];
                a[i / 2] = a[i];
                a[i] = t;
            }
            else {
                done = true;
            }
        } while (!done && 2 * i <= n);
    }

    static void makeHeap(int []a , int n , int []count) {
        for(int i = n / 2;i >= 1;i --) {
            siftDown(a , n , i , count);
        }
    }

    static void heapSort(int []a , int n , int []count) {
        makeHeap(a , n , count);
        for (int j = n; j >= 2; j --) {
            siftDown(a, j, 1 , count);
        }
    }

    public static void main(String[] args) {
        for(int num = 2;num <= 64;num *= 2) {
            int n = num - 1;
            int []a = new int[n + 1];
            for(int i = 1;i <= n;i ++) {
                a[i] = i;
            }
            int []count = new int[1];
            heapSort(a , n , count);
            System.out.println(n + ": " + count[0]);
        }
    }
}
