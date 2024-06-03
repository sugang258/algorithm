package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge> {

    public int vex; //정점
    public int cost; //비용

    public Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}

public class 다익스트라_알고리즘_5 {

    static int n,m;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis;

    public void Solution(int vex) {
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(vex,0));
        dis[vex] = 0;
        while(!pQ.isEmpty()) {
            Edge tmp = pQ.poll();
            int now = tmp.vex;
            int nowCost = tmp.cost;
            if(nowCost > dis[now]) continue;
            for (Edge edge : graph.get(now)) {
                if (dis[edge.vex] > nowCost + edge.cost) {
                    dis[edge.vex] = nowCost + edge.cost;
                    pQ.offer(new Edge(edge.vex, nowCost + edge.cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        다익스트라_알고리즘_5 T = new 다익스트라_알고리즘_5();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Edge>>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge>());
        }
        dis = new int[n+1];
        Arrays.fill(dis,Integer.MAX_VALUE);
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Edge(b,c));
        }

        T.Solution(1);
        for (int i = 2; i <= n; i++) {
               if (dis[i] != Integer.MAX_VALUE) System.out.println(i + " : " + dis[i]);
               else System.out.println(i + " : impossible");
        }
    }
}
