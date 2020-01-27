import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by Z_HAO on 2020/1/27
 */
class PriceAndNumber {
    int price = 0;
    int num = 0;

    public PriceAndNumber(int a , int b) {
        price = a;
        num = b;
    }
};

public class MixingMilk {
    static Comparator<PriceAndNumber> cmp = new Comparator<PriceAndNumber>() {
        @Override
        public int compare(PriceAndNumber node, PriceAndNumber t1) {
            return node.price - t1.price;
        }
    };
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(m == 0) {
            System.out.print("0");
            return;
        }
        PriorityQueue<PriceAndNumber> ans = new PriorityQueue<>(cmp);
        for(int i = 0;i < m;i ++) {
            PriceAndNumber temp = new PriceAndNumber(sc.nextInt() , sc.nextInt());
            ans.add(temp);
        }
        int out = 0;
        while(n > 0) {
            PriceAndNumber temp = ans.element();
            ans.remove();
            if(n - temp.num < 0) {
                out += n * temp.price;
                break;
            }
            n -= temp.num;
            out += temp.num * temp.price;
        }
        System.out.print(out);
    }
}
