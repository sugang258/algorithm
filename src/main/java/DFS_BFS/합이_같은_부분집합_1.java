package DFS_BFS;

import java.util.Scanner;

public class 합이_같은_부분집합_1 {
    static int n, num = 0;
    static String answer = "NO";
    static int[] ar;
    boolean flag = false;
    public void DFS(int L, int sum) {
        if (flag) return;
        if(sum > (num/2)) return;
        if (L == n) {
            if((num - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        }else{
            DFS(L+1, sum + ar[L]);
            DFS(L+1, sum);
        }
    }

    public static void main(String[] args) {
        합이_같은_부분집합_1 T = new 합이_같은_부분집합_1();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
            num += ar[i];
        }
        T.DFS(0,0);
        System.out.println(answer);
    }
}
