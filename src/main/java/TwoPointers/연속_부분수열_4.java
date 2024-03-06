package TwoPointers;

import java.util.Scanner;

public class 연속_부분수열_4 {

    public int Solution(int n, int m, int[] ar) {

       int count = 0;
       int p1 = 0;
       int sum = 0;

       for(int p2 = 0; p2 < n; p2++) {
           sum += ar[p2];
           if(sum == m) count++;
           while(sum >= m) {
               sum -= ar[p1++];
               if(sum == m) count++;
           }
       }
        return count;
    }

    public static void main(String[] args) {
        연속_부분수열_4 T = new 연속_부분수열_4();
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
