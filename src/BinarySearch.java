/**
 * @author Z_HAO 2020/3/7
 */
public class BinarySearch {
    private static int binarySearch(int []num , int l , int r , int data , int time) {
        if(r < l) {
            System.out.println(time + 1 + " comparisons");
            return -1;
        }
        int pos = -1;
        int mid = (l + r) / 2;
        System.out.println(num[mid]);
        if(data < num[mid]) {
            pos = binarySearch(num , l , mid - 1 , data , time + 1);
        }
        else if(data > num[mid]) {
            pos = binarySearch(num , mid + 1 , r , data , time + 1);
        }
        else {
            pos = mid;
            System.out.println(time + 1 + " comparisons");
        }
        return pos;
    }

    public static void main(String[] args) {
        final int n = 60;
        int []a = new int [n + 1];
        for(int i = 0;i <= n;i ++) {
            a[i] = i + 11;
        }
        int data = 70;
        binarySearch(a , 0 , n - 1 , data , 0);
    }
}
