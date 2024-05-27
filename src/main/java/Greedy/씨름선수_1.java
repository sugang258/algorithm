package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body> {
    public int h, w;

    public Body(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body o) {
        return o.h - this.h;
    }
}

public class 씨름선수_1 {

    static int n;
    static ArrayList<Body> ar;
    static int count = 0;

    public void Greedy() {
        //내림차순 정렬
        Collections.sort(ar);
        int max = Integer.MIN_VALUE;
        for (Body body : ar) {
            if (body.w > max) {
                max = body.w;
                count++;
            }
        }
    }

    public static void main(String[] args) {
        씨름선수_1 T = new 씨름선수_1();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ar.add(new Body(sc.nextInt(), sc.nextInt()));

        }
        T.Greedy();
        System.out.println(count);
    }
}
