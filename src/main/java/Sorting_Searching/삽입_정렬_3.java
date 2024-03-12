package Sorting_Searching;

import java.util.Scanner;

public class 삽입_정렬_3 {

    public int[] Solution(int n, int[] ar) {

        for (int i = 1; i < n; i++) {
            int num = ar[i];
            for (int j = i-1; j >= 0; j--) {
                if(num < ar[j]) {
                    ar[j+1] = ar[j];
                    ar[j] = num;
                }
            }
        }
        return ar;
    }

    public static void main(String[] args) {
        삽입_정렬_3 T = new 삽입_정렬_3();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        for (int i : T.Solution(n,ar)) {
            System.out.print(i + " ");
        }
    }
}
