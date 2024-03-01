package Array;

import java.util.Scanner;

public class 임시반장_정하기_11 {

    public static int[][] ar;

    public int Solution(int n,int[][] ar) {
        int max = 0;
        int num = 0;

        for (int i = 0; i < n; i++) {
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                for(int k = 0;k < 5; k++) {
                    if(ar[i][k] == ar[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max) {
                max = cnt;
                num = i + 1;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        임시반장_정하기_11 T = new 임시반장_정하기_11();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ar = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.Solution(n,ar));

    }


}
