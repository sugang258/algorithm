package Dynamic_Programming;

import java.util.Scanner;

public class 돌다리_건너기_2 {
    static int[] dy;
    public int Solution(int n) {
        dy[1] = 2;
        dy[2] = 3;

        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i-2] + dy[i-1];
        }
        return dy[n];
    }

    public static void main(String[] args) {
        돌다리_건너기_2 T = new 돌다리_건너기_2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        dy = new int[n+1];
        System.out.println(T.Solution(n));
    }
}
