package TwoPointers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 두_배열_합치기 {

    public static ArrayList<Integer> a;

    public static void main(String[] args) {
        두_배열_합치기 T = new 두_배열_합치기();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            a.add(sc.nextInt());
        }

        Collections.sort(a);

        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }

    }
}
