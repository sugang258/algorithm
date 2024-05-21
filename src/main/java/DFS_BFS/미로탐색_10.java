package DFS_BFS;

import java.util.Scanner;

public class 미로탐색_10 {

    static int[][] board = new int[8][8];
    static boolean[][] check = new boolean[8][8];
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static int count;

    public void DFS(int x, int y) {
        if(x == 7 && y == 7) {
            count++;
            return;
        }
        check[x][y] = true;

        for (int i = 0; i < 4; i++) {

            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 1 || nx > 7 || ny < 1 || ny > 7 || board[nx][ny] == 1 || check[nx][ny]) continue;
            DFS(nx,ny);

        }
        check[x][y] = false;
    }

    public static void main(String[] args) {
        미로탐색_10 T = new 미로탐색_10();
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        T.DFS(1,1);
        System.out.println(count);
    }
}
