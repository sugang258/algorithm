package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 공주_구하기_6 {

    public int Solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int cnt = 0;
        while (queue.size() != 1) {
            if(cnt == k-1) {
                queue.remove();
                cnt = 0;
            }
            queue.add(queue.remove());
            cnt++;
        }
        return queue.remove();
    }

    public static void main(String[] args) {
        공주_구하기_6 T = new 공주_구하기_6();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(T.Solution(n,k));
    }
}
