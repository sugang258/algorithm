package Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class 장난꾸러기_6 {

    public String Solution(int n, int[] ar) {

        StringBuilder sb = new StringBuilder();
        int[] tmp = ar.clone();
        Arrays.sort(tmp);

        for (int i = 0; i < n; i++) {
            if(ar[i] != tmp[i]) sb.append(i+1 + " ");
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        장난꾸러기_6 T = new 장난꾸러기_6();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println(T.Solution(n,ar));
    }
}
