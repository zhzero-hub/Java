import java.util.Scanner;

public class Minecraft {
    public static void main(String[] args) {
        int min = (int)1e6;
        int n = new Scanner(System.in).nextInt();
        int ansX = 1 , ansY = 1;
        for(int x = 1;x <= n;x ++) {
            for(int y = 1;y <= n;y ++) {
                if(new Minecraft().isDivide(x , y , n)) {
                    int temp = 2 * x * y + 2 * n * (x + y) / (x * y);
                    if(temp  < min) {
                        min = temp;
                    }
                }
            }
        }
        System.out.println(min);
    }

    boolean isDivide(int x, int y, int n) {
        int t = x * y;
        int z = n / t;
        return n == t * z;
    }
}
