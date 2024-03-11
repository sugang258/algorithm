package Sorting_Searching;

import java.util.Scanner;

public class 선택_정렬_1 {

    public int[] Solution(int[] ar, int n) {

        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if(ar[j] < ar[min]) {
                    min = j;
                }
            }
            int tmp = ar[i];
            ar[i] = ar[min];
            ar[min] = tmp;
        }
        return ar;
    }

    public static void main(String[] args) {
        선택_정렬_1 T = new 선택_정렬_1();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        for (int i : T.Solution(ar,n)) {
            System.out.print(i + " ");
        }
    }
}
