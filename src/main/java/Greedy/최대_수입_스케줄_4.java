package Greedy;

import java.util.*;

class lecture implements Comparable<lecture> {
    public int pay, day;

    public lecture(int pay, int day) {
        this.pay = pay;
        this.day = day;
    }

    @Override
    public int compareTo(lecture o) {
        if(this.day == o.day) return o.pay - this.pay;
        else return o.day - this.day;
    }
}

public class 최대_수입_스케줄_4 {

    static PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
    static ArrayList<lecture> ar = new ArrayList<>();
    static int max = 0;
    static int answer = 0;

    public void Solution(int n) {
        Collections.sort(ar);

        int j = 0;
        for (int i = max; i > 0; i--) {
            for ( ; j < n ; j++) {
                if(ar.get(j).day < i) break;
                queue.offer(ar.get(j).pay);
            }
            if (!queue.isEmpty()) answer += queue.poll();
        }
    }

    public static void main(String[] args) {
        최대_수입_스케줄_4 T = new 최대_수입_스케줄_4();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int d = sc.nextInt();
            max = Math.max(max, d);
            ar.add(new lecture(p,d));
        }
        T.Solution(n);
        System.out.println(answer);
    }
}
