package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {

    public int time;
    public char state;

    public Time(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time o) {
        if(this.time == o.time) return this.state - o.state;
        else return this.time - o.time;
    }
}

public class 결혼식_3 {
    static ArrayList<Time> ar;
    static int answer = Integer.MIN_VALUE;

    public void Solution() {
        Collections.sort(ar);
        int cnt = 0;
        for (Time time : ar) {
            if(time.state == 's') cnt++;
            else cnt--;
            answer = Math.max(cnt, answer);
        }
    }

    public static void main(String[] args) {
        결혼식_3 T = new 결혼식_3();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            ar.add(new Time(start, 's'));
            ar.add(new Time(end, 'e'));
        }
        T.Solution();
        System.out.println(answer);
    }
}
