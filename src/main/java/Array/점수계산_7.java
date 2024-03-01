package Array;

import java.util.Scanner;

public class 점수계산_7 {

    public static int[] ar;
    public static int[] score;

    public void Solution(int[] ar) {

        if(ar[0] == 1) {
            score[0] = 1;
        }

        for(int i = 1;i<ar.length;i++) {

            if(ar[i] == 0) {
                score[i] = 0;
            }
            else if(ar[i-1] == 0 && ar[i] == 1) {
                score[i] = 1;
            }
            else score[i] = score[i-1]+1;
        }
    }

    public static void main(String[] args) {
        점수계산_7 T = new 점수계산_7();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ar = score = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        T.Solution(ar);
        int sum =0;

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println(sum);
    }
}
