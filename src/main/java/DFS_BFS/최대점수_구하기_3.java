package DFS_BFS;

import java.util.Scanner;

public class 최대점수_구하기_3 {
    static int score=Integer.MIN_VALUE, n, m;
    static int[][] ar;

    public void DFS(int L, int sum, int time) {
        if (time > m) return;
        if (L == n) {
            score = Math.max(score, sum);
        }else{
            DFS(L+1,sum+ar[L][0],time+ar[L][1]);
            DFS(L+1,sum,time);
        }
    }

    public static void main(String[] args) {
        최대점수_구하기_3 T = new 최대점수_구하기_3();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        ar = new int[n][n];

        for (int i = 0; i < n; i++) {
            ar[i][0] = sc.nextInt();
            ar[i][1] = sc.nextInt();
        }

        T.DFS(0,0,0);
        System.out.println(score);
    }
}
