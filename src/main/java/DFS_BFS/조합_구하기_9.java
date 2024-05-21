package DFS_BFS;

import java.util.Scanner;

public class 조합_구하기_9 {

    static int n,m;
    static int[] ar;

    public void DFS(int L, int start) {
        if(L == m) {
            for (int i : ar) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }else{
            for (int i = start; i <= n; i++) {
                ar[L] = i;
                DFS(L+1,i+1);
            }
        }
    }

    public static void main(String[] args) {
        조합_구하기_9 T = new 조합_구하기_9();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        ar = new int[m];

        T.DFS(0,1);
    }
}
