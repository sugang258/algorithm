package Dynamic_Programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class cuboid implements Comparable<cuboid> {
    public int area;
    public int height;
    public int weight;

    public cuboid(int area, int height, int weight) {
        this.area = area;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(cuboid o) {
        return o.area - this.area;
    }
}

public class 가장_높은_탑_쌓기_4 {
    static int[] dy; //i번째 벽돌을 가장 위에 올렸을때의 총 높이

    public static int Solution(ArrayList<cuboid> ar) {
        dy[0] = ar.get(0).height;
        int max = dy[0];
        for (int i = 1; i < ar.size(); i++) {
            int tmp = ar.get(i).height;
            for (int j = 0; j < i; j++) {
                if(ar.get(i).weight < ar.get(j).weight) {
                    int c = dy[j] + ar.get(i).height;
                    tmp = Math.max(tmp,c);
                }
            }
            dy[i] = tmp;
            max = Math.max(max, dy[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<cuboid> ar = new ArrayList<>();
        dy = new int[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            ar.add(new cuboid(a,b,c));
        }
        Collections.sort(ar);
        System.out.println(Solution(ar));
    }
}
