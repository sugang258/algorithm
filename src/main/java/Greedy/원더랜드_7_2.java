package Greedy;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

// 최소스패닝트리 : 프림, PriorityQueue 활용
// 인접리스트로 그래프 표현
// 임의의 한 점 선택 -> 퍼져나가면서 트리 완성
// check 배열 - 정점이 트리의 원소인지 확인
class Edge_7_2 implements Comparable<Edge_7_2> {
    public int v1;
    public int cost;

    public Edge_7_2(int v1, int cost) {
        this.v1 = v1;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge_7_2 o) {
        return this.cost - o.cost;
    }
}
public class 원더랜드_7_2 {
    static PriorityQueue<Edge_7_2> pq = new PriorityQueue<>();
    static boolean[] check;
    public static int Solution(ArrayList<ArrayList<Edge_7_2>> arr) {
        int answer = 0;
        while (!pq.isEmpty()) {
           Edge_7_2 tmp = pq.poll();
           int ev = tmp.v1;
           if(check[ev] == false) {
               check[ev] = true;
               answer += tmp.cost;
               for (Edge_7_2 ob: arr.get(ev)) {
                   if(check[ob.v1] == false) pq.offer(new Edge_7_2(ob.v1, ob.cost));
               }
           }
        }
       return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        ArrayList<ArrayList<Edge_7_2>> arr = new ArrayList<ArrayList<Edge_7_2>>();
        check = new boolean[v+1];
        for (int i = 0; i <= v ; i++) {
            arr.add(new ArrayList<Edge_7_2>());
        }
        for (int i = 0; i < e; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr.get(a).add(new Edge_7_2(b,c));
            arr.get(b).add(new Edge_7_2(a,c));
        }
        pq.offer(new Edge_7_2(1,0));

        System.out.println(Solution(arr));
    }
}
