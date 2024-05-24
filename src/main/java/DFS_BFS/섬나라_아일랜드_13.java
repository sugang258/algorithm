package DFS_BFS;

import java.util.Scanner;

public class 섬나라_아일랜드_13 {

    static int n;
    static int[][] board;
    static boolean[][] check;
    static int[] dx = {0,0,1,-1,1,1,-1,-1};
    static int[] dy = {1,-1,0,0,1,-1,1,-1};
    static int answer;

    public void DFS(int x, int y) {
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
            if (board[nx][ny] == 1 && !check[nx][ny]) {
                check[nx][ny] = true;
                DFS(nx,ny);
            }
        }
    }

    public static void main(String[] args) {
        섬나라_아일랜드_13 T = new 섬나라_아일랜드_13();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        board = new int[n][n];
        check = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();

                if (board[i][j] == 0) {
                    check[i][j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1 && !check[i][j]) {
                    answer++;
                    check[i][j] = true;
                    T.DFS(i,j);
                }
            }
        }
        System.out.println(answer);
    }
}
