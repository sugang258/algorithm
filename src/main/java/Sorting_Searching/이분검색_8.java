package Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class 이분검색_8 {

    public int Solution(int n, int m, int[] ar) {
        Arrays.sort(ar);
        int start = 0, end = n-1;
        int mid = (start+end)/2;

        while(end - start >= 0) {
            if (ar[mid] == m) return mid+1;
            else if(ar[mid] > m ) {
                end = mid-1;
            }else{
                start = mid+1;
            }
            mid = (start+end) /2;
        }
        return -1;
    }

    public static void main(String[] args) {
        이분검색_8 T = new 이분검색_8();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println(T.Solution(n,m,ar));
    }
}
