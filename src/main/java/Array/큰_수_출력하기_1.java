package Array;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 큰_수_출력하기_1 {

    public String Solution(int[] ar) {
        StringBuilder sb = new StringBuilder();
        sb.append(ar[0] + " ");

        for(int i=1;i<ar.length;i++) {
            if(ar[i] > ar[i-1]) {
                sb.append(ar[i] + " ");
            }
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args) throws IOException {
        큰_수_출력하기_1 T = new 큰_수_출력하기_1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ar = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(T.Solution(ar));
    }
}
