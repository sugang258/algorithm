package Recursive_Tree_Graph;

import java.util.Scanner;

public class 팩토리얼_3 {
    public int DFS(int n) {
        if(n == 1) return 1;
        else return n*DFS(n-1);
    }

    public static void main(String[] args) {
        팩토리얼_3 T = new 팩토리얼_3();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(T.DFS(n));
    }
}
