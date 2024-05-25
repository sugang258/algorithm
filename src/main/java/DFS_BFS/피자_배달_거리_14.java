package DFS_BFS;

import java.util.ArrayList;
import java.util.Scanner;

class Node1{
    private int x;
    private int y;

    public Node1(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class 피자_배달_거리_14 {

    static int n,m,len;
    static int[][] board;
    static ArrayList<Node1> home = new ArrayList<Node1>();
    static ArrayList<Node1> pizza = new ArrayList<Node1>();
    
    static int[] combi;
    static int answer = Integer.MAX_VALUE;

    //4개 고르기
    public void DFS(int l, int s) {
        //4개 일때
        if(l == m) {
            int sum = 0;
            //집
            for (Node1 node : home) {
                int dis = Integer.MAX_VALUE;
                //피자
                for (int i : combi) {
                    dis = Math.min(dis, Math.abs(node.getX() - pizza.get(i).getX())
                            + Math.abs(node.getY() - pizza.get(i).getY()));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        }
        else{
            for (int i = s; i < len; i++) {
                combi[l] = i;
                DFS(l+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        피자_배달_거리_14 T = new 피자_배달_거리_14();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        board = new int[n][n];
        combi = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
                if(board[i][j] == 1) home.add(new Node1(i,j));
                if(board[i][j] == 2) pizza.add(new Node1(i,j));
            }
        }
        len = pizza.size();
        T.DFS(0,0);
        System.out.println(answer);
    }
}
