package DFS_BFS;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 동전교환_5 {
    static int n,m;
    static Integer[] ar;
    static int count = Integer.MAX_VALUE;

    public void DFS(int l, int sum) {
        if(l >= count) return;
        if(sum > m) return;

        if (sum == m) {
            count = Math.min(count, l);
        }
        else {
            for (int i = 0; i < n; i++) {
                DFS(l+1,sum+ar[i]);
            }
        }
    }

    public static void main(String[] args) {
        동전교환_5 T = new 동전교환_5();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ar = new Integer[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar, Collections.reverseOrder());
        m = sc.nextInt();
        T.DFS(0,0);
        System.out.println(count);
    }
}
