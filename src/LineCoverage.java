import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Z_HAO on 2020/1/31
 */
class Node {
    int start;
    int end;
    public Node(int a , int b) {
        start = a;
        end = b;
    }
}
public class LineCoverage {
    static Comparator<Node> cmp = new Comparator<Node>() {
        @Override
        public int compare(Node node, Node t1) {
            return node.end - t1.end;
        }
    };
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Node> ans = new ArrayList<>();
        for(int i = 0;i < n;i ++) {
            ans.add(new Node(sc.nextInt() , sc.nextInt()));
        }
        ans.sort(cmp);
        int now = 0;
        int out = 0;
        for(Node x: ans) {
            if(now <= x.start) {
                now = x.end;
                out ++;
            }
        }
        System.out.print(out);
    }
}
