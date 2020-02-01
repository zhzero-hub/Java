import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Z_HAO on 2020/1/31
 */
class StartAndEnd {
    int start;
    int end;
    public StartAndEnd(int a , int b) {
        start = a;
        end = b;
    }
}
public class LineCoverage {
    static Comparator<StartAndEnd> cmp = new Comparator<StartAndEnd>() {
        @Override
        public int compare(StartAndEnd startAndEnd, StartAndEnd t1) {
            return startAndEnd.end - t1.end;
        }
    };
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<StartAndEnd> ans = new ArrayList<>();
        for(int i = 0;i < n;i ++) {
            ans.add(new StartAndEnd(sc.nextInt() , sc.nextInt()));
        }
        ans.sort(cmp);
        int now = 0;
        int out = 0;
        for(StartAndEnd x: ans) {
            if(now <= x.start) {
                now = x.end;
                out ++;
            }
        }
        System.out.print(out);
    }
}
