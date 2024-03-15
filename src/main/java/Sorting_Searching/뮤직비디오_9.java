package Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class 뮤직비디오_9 {

    public int Solution(int n, int m, int[] ar) {

        //DVD 최소 용량이 될 수 있는 범위 : 9 ~ 45
        int start = Arrays.stream(ar).max().getAsInt();
        int end = Arrays.stream(ar).sum();
        int min = Integer.MAX_VALUE;

        while(start <= end) {
            int mid = (end+start) / 2;
            if (check(n,m,ar,mid) == true) {
                min = Math.min(min,mid);
                end = mid - 1;
            } else start = mid + 1;
        }
        return min;
    }

    //해당 숫자가 적합한지 확인
    public boolean check(int n, int m, int[]ar, int num) {
        int sum = 0;
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            sum+= ar[i];
            if (sum > num) {
                sum = 0;
                i--;
                cnt++;
            }
        }
        if(cnt <= m) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        뮤직비디오_9 T = new 뮤직비디오_9();
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
