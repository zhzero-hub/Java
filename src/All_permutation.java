import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Z_HAO on 2020/1/22
 */
public class All_permutation {
    static void dfs(int []visit , int i , int n , int count , String name , ArrayList<Character> out) {
        if(count >= n) {
            for(char x: out) {
                System.out.print(x);
            }
            System.out.println();
            return;
        }
        for(int j = 0;j < n;j ++) {
            if(visit[j] == 0) {
                visit[j] = 1;
                out.add(name.charAt(j));
                dfs(visit , j , n , count + 1 , name , out);
                out.remove(out.size() - 1);
                visit[j] = 0;
            }
        }
    }
    public static void main(String []args) {
        String name = new Scanner(System.in).nextLine();
        int size = name.length();
        int []visit = new int[size + 1];
        dfs(visit , 0 , size , 0 , name , new ArrayList<>());
    }
}
