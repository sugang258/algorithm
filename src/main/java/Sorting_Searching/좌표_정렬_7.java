package Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class 좌표_정렬_7 {

    public void Solution(int n, int[][] ar) {
        Arrays.sort(ar, (o1,o2) -> {
            if(o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }else{
                return o1[0] - o2[0];
            }
        });
    }

    public static void main(String[] args) {
        좌표_정렬_7 T = new 좌표_정렬_7();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] ar = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                ar[i][j] = sc.nextInt();
            }
        }

        T.Solution(n,ar);
        for (int i = 0; i < n; i++) {
            System.out.println(ar[i][0] + " " + ar[i][1]);
        }
    }
}
