package Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class 중복_확인_5 {

    public String Solution(int n, int[] ar) {
        Arrays.sort(ar);
        int rt=0,lt=rt+1;

        while(rt < n && lt < n) {
            if (ar[rt++] == ar[lt++]) return "D";
        }
        return "U";
    }

    public static void main(String[] args) {
        중복_확인_5 T = new 중복_확인_5();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println(T.Solution(n,ar));
    }
}
