package Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 크레인_인형뽑기_카카오_3 {

    public int Solution(int n, int k, int[][] board, int[] moves) {

        Stack<Integer> stack = new Stack<>();
        int cnt =0;

        for (int i = 0; i < k; i++) {
            int l = moves[i]-1;
            for (int j = 0; j < n; j++) {
                if (board[j][l] != 0) {
                    if(stack.isEmpty()) stack.add(board[j][l]);
                    else if(stack.peek() == board[j][l]) {
                        stack.pop();
                        cnt = cnt+2;
                    }
                    else stack.add(board[j][l]);
                    board[j][l] = 0;
                    break;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        크레인_인형뽑기_카카오_3 T = new 크레인_인형뽑기_카카오_3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int k = Integer.parseInt(br.readLine());
        int[] moves = new int[k];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < k; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(T.Solution(n,k,board,moves));
    }
}
