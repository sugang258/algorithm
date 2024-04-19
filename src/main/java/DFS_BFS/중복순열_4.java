package DFS_BFS;

import java.util.Scanner;

public class 중복순열_4 {
    static int[] pm;
    static int n,m;

    public void DFS(int L) {

        if(L == m) {
            for (int i : pm) System.out.print(i + " ");
            System.out.println();

        }else{
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args) {
        중복순열_4 T = new 중복순열_4();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        pm = new int[m];
        T.DFS(0);
    }
}
