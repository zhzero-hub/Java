import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by Z_HAO on 2020/1/27
 */
class Node {
    int l = 0;
    int r = 0;

    public Node(int a , int b) {
        l = a;
        r = b;
    }
}
public class KingGame {
    static Comparator<Node> cmp = new Comparator<>() {
        @Override
        public int compare(Node a , Node b) {
            return b.l - a.l;
        }
    };

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Node> ans = new PriorityQueue<>();
        int n = sc.nextInt();
        int sum = 0;
        Node king = new Node(sc.nextInt() , sc.nextInt());
        for(int i = 0;i < n;i ++) {
            int t = sc.nextInt();
            sum += t;
            Node temp = new Node(t , sc.nextInt());
            ans.add(temp);
        }
        int out = (int) 1e6;
        while(!ans.isEmpty()) {
            Node temp = ans.element();
            ans.remove();
            sum -= temp.l;

        }
    }
}
