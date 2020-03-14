import java.util.Scanner;

/**
 * @author Z_HAO 2020/3/14
 */
public class DigitIncreasing {
    static boolean isIncreasing(String str) {
        for(int i = 1;i < str.length();i ++) {
            if(str.charAt(i - 1) > str.charAt(i)) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int range = n / 10;
        int ans = 0;
        for(int i = 0;i < range;i ++) {
            for(int j = 1;j <= 9;j ++) {
                if(isIncreasing(Integer.toString(10 * i + j))) {
                    ans += 10 - j;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
