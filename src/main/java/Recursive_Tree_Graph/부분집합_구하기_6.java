package Recursive_Tree_Graph;

import java.util.Scanner;

public class 부분집합_구하기_6 {
    static int n;
    static int[] check;
    public void DFS(int L) {
        if(L == n+1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (check[i] == 1) tmp += (i + " ");
            }
            if(tmp.length() > 0) System.out.println(tmp);
        }
        else{
            check[L] = 1;
            DFS(L+1); //사용
            check[L] = 0;
            DFS(L+1); //사용X
        }
    }

    public static void main(String[] args) {
        부분집합_구하기_6 T = new 부분집합_구하기_6();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        check = new int[n+1];

        T.DFS(1);
    }
}
