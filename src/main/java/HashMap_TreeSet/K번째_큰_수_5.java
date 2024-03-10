package HashMap_TreeSet;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째_큰_수_5 {

    public int Solution(int n, int k, int[] ar) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int l = j+1; l < n; l++) {
                    set.add(ar[i]+ar[j]+ar[l]);
                }
            }
        }
        int cnt = 0;
        for (int i : set) {
            cnt++;
            if(cnt==k) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        K번째_큰_수_5 T = new K번째_큰_수_5();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println(T.Solution(n,k,ar));
    }
}
