package TwoPointers;

import java.util.Scanner;

public class 최대_매출_3 {

    public int Solution(int n, int k ,int[] a) {

        int max = 0, sum = 0;
        for (int i = 0; i < k; i++) {
            sum += a[i];
        }
        max = sum;
        for(int i=k;i<n;i++) {
            sum = sum + a[i] - a[i-k];
            max = Math.max(sum,max);
        }
        return max;
    }

    public static void main(String[] args) {
        최대_매출_3 T = new 최대_매출_3();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(T.Solution(n,k,a));
    }
}
