package Greedy;

// 최소스패닝트리 : 크루스칼, Union&Find 활용
// 정점 - n개 , 간선 - n-1개
// cost 기준으로 내림차순 정렬
// find 함수를 통해 같은 집합인지 확인 -> 같은 집합이면 패쓰

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Edge_7 implements Comparable<Edge_7> {
    public int v1;
    public int v2;
    public int cost;

    public Edge_7(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge_7 o) {
        return this.cost - o.cost;
    }
}

public class 원더랜드_7_1 {
    static int[] unf;
    public static int Find(int v) {
        if(v == unf[v]) return v;
        else return unf[v] = Find(unf[v]);

    }
    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if(fa != fb) unf[fa] = fb;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        unf = new int[v+1];
        ArrayList<Edge_7> arr = new ArrayList<>();
        for (int i = 1; i <= v; i++) unf[i] = i;
        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr.add(new Edge_7(a, b, c));
        }

        int answer = 0;
        int cnt = 0;
        Collections.sort(arr);
        for (Edge_7 ob : arr) {
            if(cnt == v-1) break; // 트리가 완성되면 종료
            int fv1 = Find(ob.v1);
            int fv2 = Find(ob.v2);
            if(fv1 != fv2) {
                answer += ob.cost;
                Union(ob.v1, ob.v2);
                cnt++;
            }
        }
        System.out.println(answer);
    }
}
