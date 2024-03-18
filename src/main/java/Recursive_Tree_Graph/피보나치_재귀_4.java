package Recursive_Tree_Graph;

import java.util.Scanner;

public class 피보나치_재귀_4 {
    static int[] fibo;
    public int DFS(int n) {
        if(fibo[n] > 0) return fibo[n];
        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = DFS(n-2) + DFS(n-1);
    }

    public static void main(String[] args) {
        피보나치_재귀_4 T = new 피보나치_재귀_4();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        fibo = new int[n+1];
        T.DFS(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}
