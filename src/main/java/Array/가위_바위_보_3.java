package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가위_바위_보_3 {

    public String Solution(int n, int[][] ar) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(game(ar[i][0],ar[i][1]) + "\n");
        }
        return String.valueOf(sb);
    }

    public String game(int a, int b) {
        if(a == b) {
            return "D";
        }
        if(a == 1){
            if(b == 2) return "B";
            return "A";

        }
        if (a == 2) {
            if(b == 1) return "A";
            return "B";
        }
        if(a == 3) {
            if(b == 1) return "B";
            return "A";
        }
        return "A";
    }

    public static void main(String[] args) throws IOException {
        가위_바위_보_3 T = new 가위_바위_보_3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] ar = new int[n][2];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            ar[i][0] = Integer.parseInt(st.nextToken());
        }

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            ar[i][1] = Integer.parseInt(st1.nextToken());
        }
        System.out.println(T.Solution(n, ar));
    }
}
