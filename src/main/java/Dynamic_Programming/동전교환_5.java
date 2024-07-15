package Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;

//DP - 냅색 알고리즘
public class 동전교환_5 {

    static int[] dy;
    //dy[i] = i 금액을 만드는데 드는 최소 동전 개수
    //dy[j - coin[i]] + 1

    public static int Solution(Integer[] ar, int m) {
        dy[0] = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = ar[i]; j <= m; j++) {
                int tmp = dy[j - ar[i]] + 1;
                dy[j] = Math.min(dy[j], tmp);
            }
        }
        return dy[m];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] ar = new Integer[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        dy = new int[m+1];
        Arrays.fill(dy, Integer.MAX_VALUE);
        System.out.println(Solution(ar,m));
    }
}
