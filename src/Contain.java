/**
 * @author Z_HAO 2020/3/14
 */
public class Contain {
    public static void main(String[] args) {
        int n = 2019;
        int time = 0;
        for(int i = 1;i <= n;i ++) {
            String str = Integer.toString(i);
            if(str.contains("9")) {
                time ++;
            }
        }
        System.out.println(time);
    }
}
