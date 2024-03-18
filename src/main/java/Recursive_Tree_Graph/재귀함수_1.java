package Recursive_Tree_Graph;
import java.util.Scanner;

/*
    자연수 N이 입력되면 재귀함수를 이용하여 1부터 N 까지를 출력하는 프로그램을 작성하세요.

    -입력설명
    첫 번째 줄은 정수 N(3<=N<=10)이 입력된다.

    -출력설명
    첫째 줄에 출력한다.

    -입력예제1
    3

    -출력예제1
    1 2 3
 */

public class 재귀함수_1 {
    public void DFS(int n) {
        if(n == 0) return;
        else{
            DFS(n-1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        재귀함수_1 T = new 재귀함수_1();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        T.DFS(n);
    }
}
