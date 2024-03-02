package Array;

import java.util.Scanner;

public class 멘토링_12 {

    public static int[][] ar;

    public int Solution(int[][] ar, int n, int m) {


        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int count = 0;

                for(int k  = 0; k < m; k++) {
                   int mentor = 0;
                   int mentee = 0;

                   for(int s = 0; s < n; s++) {
                       if(ar[k][s] == i) {
                           mentor = s;
                       }
                       if(ar[k][s] == j) {
                           mentee = s;
                       }
                   }
                   if(mentor < mentee) {
                       count++;
                   }
                }
                if(count == m) {
                    answer++;
                }

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        멘토링_12 T = new 멘토링_12();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ar = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.Solution(ar, n, m));
    }
}
