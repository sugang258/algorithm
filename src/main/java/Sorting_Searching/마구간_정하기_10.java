package Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class 마구간_정하기_10 {

    public int Solution(int n, int c , int[] ar) {
        int start = 1;
        int end = ar[n-1];
        int max = Integer.MIN_VALUE;

        while(end>=start) {
            int mid = (end+start) / 2;
            if(check(c, ar, mid) == true) {
                max = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return max;
    }

    //가장 가까운 말의 거리가 유효한지 확인
    boolean check(int c, int[] ar, int mid) {
        int ep = ar[0];
        int cnt = 1;
        for (int i = 1; i < ar.length; i++) {
            if(ar[i]-ep >= mid) {
                ep = ar[i];
                cnt++;
            }
        }
        if(cnt >= c) return true;
        return false;
    }


    public static void main(String[] args) {
        마구간_정하기_10 T = new 마구간_정하기_10();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);

        System.out.println(T.Solution(n,c,ar));
    }
}
