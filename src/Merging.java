import java.util.*;

/**
 * Created by Z_HAO on 2020/1/23
 */
public class Merging {
    public static void main(String []args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> ans = new PriorityQueue<>();
        int out = 0;
        for(int i = 0;i < n;i ++) {
            int temp = sc.nextInt();
            ans.add(temp);
        }
        while(ans.size() > 1) {
            int l = 0 , r = 0;
            l = ans.element();
            ans.remove();
            r = ans.element();
            ans.remove();
            out += l + r;
            ans.add(l + r);
        }
        System.out.println(out);
    }
}
