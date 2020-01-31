import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Z_HAO on 2020/1/27
 */
class Node {
    int l;
    int r;

    public Node(int a , int b) {
        l = a;
        r = b;
    }
}

public class KingGame {
    static Comparator<Node> cmp = new Comparator<Node>() {
        @Override
        public int compare(Node a , Node b) {
            return a.l * a.r - b.l * b.r;
        }
    };

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Node> ans = new ArrayList<>();
        int l , r;
        l = sc.nextInt();
        r = sc.nextInt();
        Node king = new Node(l , r);
        BigDecimal sum = new BigDecimal(l);
        for(int i = 1;i <= n;i ++) {
            l = sc.nextInt();
            r = sc.nextInt();
            Node temp = new Node(l , r);
            ans.add(temp);
        }
        ans.sort(cmp);
        for(int i = 0;i < n - 1;i ++) {
            sum = sum.multiply(BigDecimal.valueOf(ans.get(i).l));
        }
        BigDecimal out = sum.divideToIntegralValue(BigDecimal.valueOf(ans.get(n - 1).r));
        if(out.compareTo(new BigDecimal(0)) > 0) {
            System.out.print(out);
        }
        else {
            System.out.print("1");
        }
    }
}