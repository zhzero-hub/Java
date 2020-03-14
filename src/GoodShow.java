import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Z_HAO 2020/3/14
 */
public class GoodShow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashSet<Integer> hashSet = new HashSet<>();
        int []a = new int [n];
        int []score = new int [n];
        for(int i = 0;i < n;i ++) {
            a[i] = score[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int pos = n - m;
        int min = a[n - m];
        while(pos < n && a[pos] == min) {
            pos ++;
        }
        int minNum = m - n + pos;
        int time = 0;
        for(int i = 0;i < n;i ++) {
            if(score[i] > min) {
                System.out.print(score[i] + " ");
            }
            else if(score[i] == min && time < minNum) {
                System.out.print(score[i] + " ");
                time ++;
            }
        }
    }
}
