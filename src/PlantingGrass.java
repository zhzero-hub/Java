import javafx.util.Pair;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Z_HAO 2020/3/14
 */
public class PlantingGrass {
    static void bfs(Queue<Pair<Integer, Integer>> queue , char [][]grass , int k , int n , int m) {
        while(k-- > 0) {
            if(queue.isEmpty()) {
                return;
            }
            int range = queue.size();
            while(range-- > 0) {
                Pair<Integer, Integer> pair = queue.element();
                queue.remove();
                int x = pair.getKey();
                int y = pair.getValue();
                if(x - 1 >= 0) {
                    grass[x - 1][y] = 'g';
                    queue.add(new Pair<>(x - 1 , y));
                }
                if(y - 1 >= 0) {
                    grass[x][y - 1] = 'g';
                    queue.add(new Pair<>(x , y - 1));
                }
                if(x + 1 < n) {
                    grass[x + 1][y] = 'g';
                    queue.add(new Pair<>(x + 1 , y));
                }
                if(y + 1 < m) {
                    grass[x][y + 1] ='g';
                    queue.add(new Pair<>(x , y + 1));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Queue<Pair<Integer, Integer>> queue = new ArrayDeque<>();
        char [][]grass = new char[1010][1010];
        String bf = sc.nextLine();
        for(int i = 0;i < n;i ++) {
            String temp = sc.nextLine();
            for(int j = 0;j < temp.length();j ++) {
                char ch = temp.charAt(j);
                grass[i][j] = ch;
                if(ch == 'g') {
                    queue.add(new Pair<>(i , j));
                }
            }
        }
        int k = sc.nextInt();
        bfs(queue , grass , k , n , m);
        for(int i = 0;i < n;i ++) {
            for(int j = 0;j < m;j ++) {
                System.out.print(grass[i][j]);
            }
            System.out.println();
        }
    }
}
