package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 공통원소_구하기_2 {

    public ArrayList<Integer> Solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> ar = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);

        int p1 = 0, p2 = 0;

        while(p1 < n && p2 < m) {
            if(a[p1] == b[p2]) {
                ar.add(a[p1++]);
                p2++;
            }
            else if (a[p1] > b[p2]) p2++;
            else p1++;
        }

        return ar;
    }

    public static void main(String[] args) {
        공통원소_구하기_2 T = new 공통원소_구하기_2();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        for (int x : T.Solution(n,m,a,b)) {
            System.out.print(x + " ");
        }

    }
}
