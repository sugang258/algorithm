package DFS_BFS;

import java.util.Scanner;

public class 순열_구하기_6 {
    static int n, m;
    static int[] ar, check, pm;

    public void DFS(int l) {

        if (l == m) {
            for (int i : pm) System.out.print(i + " ");
            System.out.println();
        }
        else{
            for (int i = 0; i < n; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    pm[l] = ar[i];
                    DFS(l+1);
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        순열_구하기_6 T = new 순열_구하기_6();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        ar = new int[n];
        check = new int[n];
        pm = new int[m];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        T.DFS(0);
    }
}
