package Recursive_Tree_Graph;

import java.util.Scanner;

public class 재귀함수를_이용한_이진수_출력_2 {
    public void DFS(int n ) {
        if(n == 0) return;
        else{
            DFS(n/2);
            System.out.print(n%2 + " ");
        }
    }

    public static void main(String[] args) {
        재귀함수를_이용한_이진수_출력_2 T = new 재귀함수를_이용한_이진수_출력_2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        T.DFS(n);
    }
}
