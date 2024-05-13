package DFS_BFS;

import java.util.Scanner;

public class 조합의_경우수_7 {
    static int n,r;
    static int[][] dy;

    public int DFS(int n1, int r1) {
        if(dy[n1][r1] > 0) return dy[n1][r1];
        if (n1 == r1 || r1 == 0) {
            return 1;
        }else{
            return dy[n1][r1] = DFS(n1-1,r1-1) + DFS(n1-1,r1);
        }
    }

    public static void main(String[] args) {
        조합의_경우수_7 T = new 조합의_경우수_7();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        r = sc.nextInt();
        dy = new int[n+1][r+1];
        System.out.println(T.DFS(n,r));
    }
}
