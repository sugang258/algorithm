package DFS_BFS;

import java.util.Scanner;

public class 바둑이_승차_2 {
    static int answer=Integer.MIN_VALUE, c,n;
    static int[] ar;

    public void DFS(int L, int sum) {
        if(sum > c) return;
        if(L == n) {
            answer = Math.max(answer, sum);
        }
        else{
            DFS(L+1, sum+ar[L]);
            DFS(L+1, sum);
        }
    }

    public static void main(String[] args) {
        바둑이_승차_2 T = new 바둑이_승차_2();
        Scanner sc = new Scanner(System.in);

        c = sc.nextInt();
        n = sc.nextInt();
        ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        T.DFS(0,0);
        System.out.println(answer);
    }
}
