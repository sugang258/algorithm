package Sorting_Searching;

import java.util.Scanner;

public class 버블_정렬_2 {

    public int[] Solution(int n, int[] ar) {

        for (int i = n-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(ar[j] > ar[j+1]) {
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
        return ar;
    }

    public static void main(String[] args) {
        버블_정렬_2 T = new 버블_정렬_2();
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
