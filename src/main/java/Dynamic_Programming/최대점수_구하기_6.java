package Dynamic_Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class problem implements Comparable<problem> {
    public int score;
    public int time;

    public problem(int score, int time) {
        this.score = score;
        this.time = time;
    }

    @Override
    public int compareTo(problem o) {
        return this.time - o.time;
    }
}

public class 최대점수_구하기_6 {
    static int[] dy;

    public static int Solution(ArrayList<problem> ar, int m) {
        for (int i = 0; i < ar.size(); i++) {
            problem p = ar.get(i);
            for (int j = m; j >= p.time; j--) {
                dy[j] = Math.max((dy[j-p.time] + p.score),dy[j]);
            }
        }
        return dy[m];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<problem> ar = new ArrayList<>();
        dy = new int[m+1];
        Arrays.fill(dy,0);

        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            ar.add(new problem(s,t));
        }
        Collections.sort(ar);
        System.out.println(Solution(ar,m));
    }
}
