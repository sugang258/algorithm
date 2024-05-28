package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class room implements Comparable<room> {
    public int start, end;

    public room(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(room o) {
        return this.end - o.end;
    }
}

public class 회의실_배정_2 {

    static int count = 1;

    public void Solution(ArrayList<room> ar) {
        Collections.sort(ar);
        int min = ar.get(0).end;
        for (room room : ar) {
            if(room.start >= min) {
                count++;
                min = room.end;
            }
        }
    }

    public static void main(String[] args) {
        회의실_배정_2 T = new 회의실_배정_2();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<room> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ar.add(new room(sc.nextInt(), sc.nextInt()));
        }
        T.Solution(ar);
        System.out.println(count);
    }
}
