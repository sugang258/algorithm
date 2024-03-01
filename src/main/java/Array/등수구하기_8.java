package Array;

import java.util.Scanner;

public class 등수구하기_8 {

    public static int[] ar;
    public static int[] rank;

    public void Solution(int[] ar) {

        for(int i=0;i<ar.length;i++) {
            int cnt = 1;

            for(int j=0;j<ar.length;j++) {
                if(ar[j] > ar[i]) {
                    cnt++;
                }
            }
            rank[i] = cnt;
        }
    }

    public static void main(String[] args) {
        등수구하기_8 T = new 등수구하기_8();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ar = new int[n];
        rank = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        T.Solution(ar);

        for (int i : rank) {
            System.out.print(i + " ");
        }
    }
}
