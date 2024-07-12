package Dynamic_Programming;

import java.util.Scanner;

public class 최대_부분_증가수열_3 {
    static int[] dy;
    public static int Solution(int n, int[] ar) {
        dy[0] = 0;
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int tmp = 0;
            for (int j = 0; j < i; j++) {
                if(ar[i] > ar[j]) {
                    tmp = Math.max(tmp, dy[j]);
                }
            }
            dy[i] = tmp + 1;
            max = Math.max(max, dy[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n+1];
        dy = new int[n+1];
        for (int i = 1; i <= n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println(Solution(n,ar));
    }
}
