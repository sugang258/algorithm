package Array;

import java.util.Scanner;

public class 격자판_최대합_9 {

    public static int[][] ar;

    public int Solution(int n, int[][] ar) {

        int max = Integer.MIN_VALUE;

        //행의 합
        for(int i =0;i<n;i++) {
            int sum = 0;
            for(int j = 0;j<n;j++) {
                sum += ar[i][j];
            }
            max = Math.max(sum,max);
        }

        //열의 합
        for(int i =0;i<n;i++) {
            int sum = 0;
            for(int j=0;j<n;j++) {
                sum += ar[j][i];
            }
            max = Math.max(sum,max);

        }


        //대각선의 합
        //왼-오
        for(int i = 0;i<n;i++) {
            int sum = 0;
            sum += ar[i][i];
            max = Math.max(sum,max);
        }

        //오-왼
        for(int i=0;i<n;i++) {
            int sum = 0;
            sum += ar[i][n-i-1];
            max = Math.max(sum,max);
        }
        return max;
    }

    public static void main(String[] args) {
        격자판_최대합_9 T = new 격자판_최대합_9();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ar = new int[n][n];

        for (int i = 0; i < n; i++) {
            for(int j =0;j<n;j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.Solution(n,ar));
    }
}
