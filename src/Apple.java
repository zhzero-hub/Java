import java.util.*;

/**
 * Created by Z_HAO on 2020/1/22
 */
public class Apple {
    static void f(int []group , int m , int n , HashSet<String> ans) {
        int []visit = new int[110];
        for(int i = 1;i < n;i ++) {
            if(visit[group[i]] == 0 && group[i] + 1 != group[0]) {
                visit[group[i]] = 1;
                group[0] --;
                group[i] ++;
                ans.add(Arrays.toString(group));
                if(group[0] > m / 2) {
                    f(group , m , n , ans);
                }
                group[0] ++;
                group[i] --;
            }
        }
    }

    public static void main(String []args) {
        int t = new Scanner(System.in).nextInt();
        HashSet<String> ans = new HashSet<>();
        while(t -- > 0) {
            int m , n;
            Scanner sc = new Scanner(System.in);
            m = sc.nextInt();
            n = sc.nextInt();
            if(m <= n) {
                System.out.println("1");
                continue;
            }
            int []group = new int[n + 1];
            group[0] = m;
            f(group , m , n , ans);
            System.out.println(ans.size() + 1);
        }
    }
}
