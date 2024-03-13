package Sorting_Searching;

import java.util.Scanner;

public class Least_Recently_Used_4 {

    public int[] Solution(int s, int n, int[] cache, int[] schedule) {

        cache[0] = schedule[0];
        for (int i = 1; i < n; i++) {
            int num = schedule[i];
            int l = s+1;
            for (int j = 0; j < s; j++) {
                if(cache[j] == num) {
                    l = j;
                    break;
                }
            }
            if (l != s+1) {
                for (int k = l-1; k >=0 ; k--) {
                    cache[k+1] = cache[k];
                }
            }
            else {
                for (int k = s-2; k >= 0; k--) {
                    cache[k+1] = cache[k];
                }
            }
        cache[0] = num;
        }
        return cache;
    }

    public static void main(String[] args) {
        Least_Recently_Used_4 T = new Least_Recently_Used_4();
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] cache = new int[s];
        int[] schedule = new int[n];

        for (int i = 0; i < n; i++) {
            schedule[i] = sc.nextInt();
        }
        for (int i : T.Solution(s,n,cache,schedule)) {
            System.out.print(i + " ");
        }
    }
}
