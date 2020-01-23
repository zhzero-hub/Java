import java.util.*;

/**
 * Created by Z_HAO on 2020/1/23
 */
public class Merging {
    public static void main(String []args) throws Exception {
        int n = new Scanner(System.in).nextInt();
        int ch = System.in.read();
        PriorityQueue<Integer> ans = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        int out = 0;
        while(sc.hasNextInt()) {
            ans.add(sc.nextInt());
        }
        while(ans.size() > 1) {
            int l = ans.element();
            ans.remove();
            int r = 0;
            r = ans.element();
            ans.remove();
            out += l + r;
            ans.add(l + r);
        }
        System.out.print(out);
    }
}
