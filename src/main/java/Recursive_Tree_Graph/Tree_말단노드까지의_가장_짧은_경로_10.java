package Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;

class Node_10 {
    int data;
    Node_10 lt, rt;
    public Node_10(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Tree_말단노드까지의_가장_짧은_경로_10 {
    Node_10 root;

    public int BFS(Node_10 root) {
        Queue<Node_10> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node_10 cur = Q.poll();
                if(cur.lt == null && cur.rt == null) return L;
                if(cur.lt != null) Q.offer(cur.lt);
                if(cur.rt != null) Q.offer(cur.rt);
            }
            L++;
        }
        return L;
    }

    public static void main(String[] args) {
        Tree_말단노드까지의_가장_짧은_경로_10 T = new Tree_말단노드까지의_가장_짧은_경로_10();
        T.root = new Node_10(1);
        T.root.lt = new Node_10(2);
        T.root.rt = new Node_10(3);
        T.root.lt.lt = new Node_10(4);
        T.root.lt.rt = new Node_10(5);

        System.out.println(T.BFS(T.root));
    }
}
