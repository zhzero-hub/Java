import java.util.*;

/**
 * @author Z_HAO 2020/3/28
 */
public class DivideConquer {
    public static int countTime(int []a , int l , int r , int x) {
        if(l == r) {
            if(a[l] == x) {
                return 1;
            }
            return 0;
        }
        int mid = (l + r) / 2;
        return countTime(a , l , mid , x) + countTime(a , mid + 1 , r , x);
    }

    public static int trinarySearch(int []a , int l , int r , int x) {
        if(r - l <= 2) {
            for(int i = l;i <= r;i ++) {
                if(a[i] == x) {
                    return i;
                }
            }
            return 0;
        }
        int lMid = (l + r) / 3;
        if(x == a[lMid]) {
            return lMid;
        }
        else if(x < a[lMid]) {
            return trinarySearch(a , l , lMid - 1 , x);
        }
        else  {
            int rMid = lMid * 2;
            if(x == a[rMid]) {
                return rMid;
            }
            else if(x < a[rMid]) {
                return trinarySearch(a , lMid + 1 , rMid - 1 , x);
            }
            else {
                return trinarySearch(a , rMid + 1 , r , x);
            }
        }
    }

    public static void insertSort(int []a , int p , int q , int n) {
        int i = p , j = q;
        while(j <= n) {
            while(a[i] <= a[j]) {
                i ++;
                if(i > n) {
                    return;
                }
            }
            int t = a[j];
            System.arraycopy(a, i, a, i + 1, j - i);
            a[i] = t;
            i ++;
            j ++;
            if(i > n) {
                return;
            }
        }
    }

    public static void mergeSort(int []a , int l , int r) {
        if(l >= r) {
            return;
        }
        int mid = (l + r) / 2;
        int lMid = (l + mid) / 2;
        int rMid = (mid + r) / 2;
        mergeSort(a , l , lMid);
        mergeSort(a , lMid + 1 , mid);
        insertSort(a , l , lMid + 1 , mid);
        mergeSort(a , mid + 1 , rMid);
        mergeSort(a , rMid + 1 , r);
        insertSort(a , mid + 1 , rMid + 1 , r);
        insertSort(a , l , mid + 1 , r);
    }

    public static int select(int []a , int l , int r , int k) {
        System.out.println(Arrays.toString(a));
        int p = r - l + 1;
        if(p < 44) {
            Arrays.sort(a , l , r + 1);
            return a[l + k - 1];
        }
        int q = p / 5;
        int []mid = new int[q + 1];
        int pos = 1;
        for(int i = l;i + 4 <= r;i += 5) {
            Arrays.sort(a , i , i + 5);
            mid[pos ++] = a[i + 2];
        }
        int mm = select(mid , 1 , q , (q + 1) / 2);;
        int []a1 = new int[p + 1];
        int pos1 = 1;
        int []a2 = new int[p + 1];
        int pos2 = 1;
        int []a3 = new int[p + 1];
        int pos3 = 1;
        for(int i = l;i <= r;i ++) {
            if(a[i] < mm) {
                a1[pos1 ++] = a[i];
            }
            else if(a[i] == mm) {
                a2[pos2 ++] = a[i];
            }
            else {
                a3[pos3 ++] = a[i];
            }
        }
        if(a1.length >= k) {
            return select(a1 , 1 , pos1 - 1 , k);
        }
        else if(pos1 + pos2 - 2 >= k) {
            return mm;
        }
        else {
            return select(a3, 1, pos3 - 1 , k - pos1 - pos2 + 2);
        }
    }

    public static void main(String[] args) {
        int n = 105;
        int []a = new int [n + 1];
        Random random = new Random();
        for(int i = 1;i <= n;i ++) {
            a[i] = i;
        }
        ArrayList<Integer> b = new ArrayList<>();
        System.out.println(select(a , 1 , n , 17));
    }
}






