package Array;

import java.util.Scanner;

public class 봉우리_10 {

    public static int[][] ar;

    public int Solution(int n,int[][] ar) {
        int cnt = 0;
        for(int i=1;i<n+1;i++) {
            for(int j=1;j<n+1;j++) {
                int max = 0;
                //상
                int up = ar[i-1][j];
                //하
                int down = ar[i+1][j];
                //좌
                int left = ar[i][j-1];
                //우
                int right = ar[i][j+1];

                max = Math.max(up,Math.max(down,Math.max(left,right)));

                if(ar[i][j] > max) {
                    cnt ++;
                }
            }
        }
            return cnt;
    }

    public static void main(String[] args) {
        봉우리_10 T = new 봉우리_10();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ar = new int[n+2][n+2];

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                ar[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.Solution(n,ar));
    }
}
