package Array;

import java.util.Scanner;

public class 피보나치_수열_4 {

    public int[] Solution(int n) {
        int[] ar = new int[n];

        ar[0] = 1;
        ar[1] = 1;

        for(int i =2;i<n;i++) {
            ar[i] = ar[i-2] + ar[i-1];
        }
        return ar;
    }

    public static void main(String[] args) {
        피보나치_수열_4 T = new 피보나치_수열_4();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ar = T.Solution(n);

        for (int i : ar) {
            System.out.print(i + " ");
        }
    }
}
