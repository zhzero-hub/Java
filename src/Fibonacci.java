/**
 * @author Z_HAO
 */
public class Fibonacci {
    public static int f(int[] array , int i) {
        if(array[i] != 0) {
            return array[i];
        }
        array[i] = f(array, i - 1) + f(array, i - 2);
        return array[i];
    }

    public static void main(String[] args) {
        int n = 10010;
        int []array = new int[n + 1];
        array[1] = array[2] = 1;
        System.out.println(f(array , 6));
    }
}