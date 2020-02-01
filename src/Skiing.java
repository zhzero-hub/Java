import java.util.*;

/**
 * Created by Z_HAO on 2020/2/1
 * 一个样例 MLE，想不到怎么优化
 */
class CoordinatesAndHeight {
    int x;
    int y;
    int height;

    public CoordinatesAndHeight(int a , int b , int c) {
        x = a;
        y = b;
        height = c;
    }
}

public class Skiing {
    static int row;
    static int line;

    static int bfs(int i , int j , int [][]g , int [][]ans) {
        int ret = 0;
        Queue<CoordinatesAndHeight>que = new ArrayDeque<>();
        que.add(new CoordinatesAndHeight(i , j , g[i][j]));
        while(!que.isEmpty()) {
            CoordinatesAndHeight pair = que.element();
            que.remove();
            int x = pair.x , y = pair.y;
            if(g[x + 1][y] < g[x][y]) {
                que.add(new CoordinatesAndHeight(x + 1 , y , g[x + 1][y]));
                if(ans[x][y] + 1 < ans[x + 1][y]) {
                    continue;
                }
                ans[x + 1][y] = ans[x][y] + 1;
                if(ans[x + 1][y] > ret) {
                    ret = ans[x + 1][y];
                }
            }
            if(g[x - 1][y] < g[x][y]) {
                que.add(new CoordinatesAndHeight(x - 1 , y , g[x - 1][y]));
                if(ans[x][y] + 1 < ans[x - 1][y]) {
                    continue;
                }
                ans[x - 1][y] = ans[x][y] + 1;
                if(ans[x - 1][y] > ret) {
                    ret = ans[x - 1][y];
                }
            }
            if(g[x][y + 1] < g[x][y]) {
                que.add(new CoordinatesAndHeight(x , y + 1 , g[x][y + 1]));
                if(ans[x][y] + 1 < ans[x][y + 1]) {
                    continue;
                }
                ans[x][y + 1] = ans[x][y] + 1;
                if(ans[x][y + 1] > ret) {
                    ret = ans[x][y + 1];
                }
            }
            if(g[x][y - 1] < g[x][y]) {
                que.add(new CoordinatesAndHeight(x , y - 1 , g[x][y - 1]));
                if(ans[x][y] + 1 < ans[x][y - 1]) {
                    continue;
                }
                ans[x][y - 1] = ans[x][y] + 1;
                if(ans[x][y - 1] > ret) {
                    ret = ans[x][y - 1];
                }
            }
        }
        return ret + 1;
    }

    static Comparator<CoordinatesAndHeight> cmp = new Comparator<CoordinatesAndHeight>() {
        @Override
        public int compare(CoordinatesAndHeight node, CoordinatesAndHeight t1) {
            return t1.height - node.height;
        }
    };

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CoordinatesAndHeight> arr = new ArrayList<>();
        row = sc.nextInt();
        line = sc.nextInt();
        int [][]g = new int [row + 2][line + 2];
        for(int i = 1;i <= line;i ++) {
            g[0][i] = g[row + 1][i] = Integer.MAX_VALUE;
        }
        for(int i = 1;i <= row;i ++) {
            g[i][0] = g[i][line + 1] = Integer.MAX_VALUE;
        }
        for(int i = 1;i <= row;i ++) {
            for(int j = 1;j <= line;j ++) {
                g[i][j] = sc.nextInt();
                CoordinatesAndHeight temp = new CoordinatesAndHeight(i , j , g[i][j]);
                arr.add(temp);
            }
        }
        int [][]ans = new int [row + 1][line + 1];
        int ret = 0;
        arr.sort(cmp);
        for(CoordinatesAndHeight k: arr) {
            ret = Math.max(ret , bfs(k.x ,k.y , g , ans));
        }
        System.out.println(ret);
    }
}
