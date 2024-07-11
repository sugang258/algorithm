package Dynamic_Programming;

import java.util.Scanner;

// 복잡한 문제 -> dynamic programming 알고리즘
// 작은 단위의 문제에서 큰 문제로 점점 확장 => 최종 답
// 앞에 단위들을 memorization -> 큰 문제에 사용
// dy 배열 => memorization 기록
public class 계단오르기_1 {
    public int Solution(int n) {
        int[] dy = new int[n+1];
        dy[1] = 1;
        dy[2] = 2;

        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i-2] + dy[i-1];
        }
        return dy[n];
    }

    public static void main(String[] args) {
        계단오르기_1 T = new 계단오르기_1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(T.Solution(n));
    }
}
