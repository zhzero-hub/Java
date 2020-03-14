import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Z_HAO 2020/3/14
 */
public class ContainString {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        HashSet<Character> set = new HashSet<>();
        int flag = 1;
        set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');
        for(int i = 0;i < str.length();i ++) {
            char ch = str.charAt(i);
            boolean isVowel = set.contains(ch);
            if(flag % 2 == 0) {
                //目前是元音
                if(isVowel) {
                    //是元音，且当前字母为元音
                    continue;
                }
                else {
                    flag ++;
                }
            }
            else {
                //目前是辅音
                if(isVowel) {
                    flag ++;
                }
                else {
                    continue;
                }
            }
            if(flag > 4) {
                System.out.println("no");
                return;
            }
        }
        if(flag == 4) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}





