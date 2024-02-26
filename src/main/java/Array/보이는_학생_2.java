package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 보이는_학생_2 {

    public Integer Solution(int n, int[] ar) {

        int cnt = 1;
        int max = ar[0];

        for(int i=1;i<n;i++) {
            if(ar[i] > max) {
                max = ar[i];
                cnt++;
            }
        }
        return cnt;

    }

    public static void main(String[] args) throws IOException {
        보이는_학생_2 T = new 보이는_학생_2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        int[] ar = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(T.Solution(n,ar));

    }
}
