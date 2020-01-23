import java.util.Scanner;

/**
 * Created by Z_HAO on 2020/1/23
 */
public class Stationery {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() , b = sc.nextInt();
        int sum = a * 10 + b;
        System.out.print(sum / 19);
    }
}
