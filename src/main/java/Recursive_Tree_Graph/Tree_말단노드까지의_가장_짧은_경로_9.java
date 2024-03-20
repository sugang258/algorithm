package Recursive_Tree_Graph;

class Node_9 {
    int data;
    Node_9 lt,rt;
    public Node_9(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Tree_말단노드까지의_가장_짧은_경로_9 {
    Node_9 root;

    public int DFS(int L, Node_9 root) {
        if (root.lt == null && root.rt == null) return L;
        else {
            return Math.min(DFS(L+1, root.lt),DFS(L+1,root.rt));
        }
    }

    public static void main(String[] args) {
        Tree_말단노드까지의_가장_짧은_경로_9 T = new Tree_말단노드까지의_가장_짧은_경로_9();
        T.root = new Node_9(1);
        T.root.lt = new Node_9(2);
        T.root.rt = new Node_9(3);
        T.root.lt.lt = new Node_9(4);
        T.root.lt.rt = new Node_9(5);

        System.out.println(T.DFS(0,T.root));
    }
}
