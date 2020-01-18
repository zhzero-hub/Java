public class Fibonacci {
    static int f(int[] ans , int x) {
        if(x == 1 || x == 2) {
            return 1;
        }
        return f(ans , x - 1) + f(ans , x - 2);
    }
    public static void main(String[] args) {

    }
}
