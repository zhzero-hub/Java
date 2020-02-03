import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Z_HAO on 2020/2/1
 */
class Node {
    int num;
    double x;
    double y;

    Node(int n , double a , double b) {
        num = n;
        x = a;
        y = b;
    }
}

public class Cheese {
    static int n;
    static double out = Integer.MAX_VALUE;
    static void dfs(double dis , int pos , double [][]distance , int []visit , int sum) {
        if(sum == n) {
            if(dis < out) {
                out = dis;
            }
            return;
        }
        for(int i = 1;i <= n;i ++) {
            if(visit[i] == 0) {
                double d = dis + distance[i][pos];
                if(d > out) {
                    return;
                }
                visit[i] = 1;
                dfs(d , i , distance , visit , sum + 1);
                visit[i] = 0;
            }
        }
    }

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<Node> g = new ArrayList<>();
        for(int i = 1;i <= n;i ++) {
            g.add(new Node(i , sc.nextDouble() , sc.nextDouble()));
        }
        double [][]distance = new double [n + 1][n + 1];
        for(int i = 1;i <= n;i ++) {
            for(int j = i + 1;j <= n;j ++) {
                double dx = g.get(i - 1).x - g.get(j - 1).x;
                double dy = g.get(i - 1).y - g.get(j - 1).y;
                distance[i][j] = distance[j][i] = Math.sqrt(dx * dx + dy * dy);
            }
        }
        for(Node i: g) {
            double dis = Math.sqrt(i.x * i.x + i.y * i.y);
            int []visit = new int [n + 1];
            visit[i.num] = 1;
            dfs(dis , i.num , distance , visit , 1);
            visit[i.num] = 0;
        }
        System.out.println(String.format("%.2f" , out));
    }
}
