package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로의_최단거리_통로_11 {
    static int[][] board = new int[8][8];
    static int[][] dis = new int[8][8];
    static boolean[][] check = new boolean[8][8];
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};

    class Node{
        private int x;
        private int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public void BFS(int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x,y));
        check[x][y] = true;
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if(nx < 1 || nx > 7 || ny < 1 || ny > 7 || board[nx][ny] == 1 || check[nx][ny]) continue;
                check[nx][ny] = true;
                queue.offer(new Node(nx,ny));
                dis[nx][ny] = dis[node.x][node.y] + 1;
            }
        }
    }

    public static void main(String[] args) {
        미로의_최단거리_통로_11 T = new 미로의_최단거리_통로_11();
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        dis[1][1] = 0;
        T.BFS(1,1);
        if (dis[7][7] == 0) System.out.println(-1);
        else System.out.println(dis[7][7]);
    }
}
