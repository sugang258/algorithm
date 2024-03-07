package TwoPointers;

import java.util.Scanner;

public class 최대_길이_연속부분수열_6 {

    public int Solution(int n, int k, int[] ar) {

        int max = 0, lt = 0, rt = 0;
        while(lt < n && rt < n) {

            if(ar[rt] == 1) {
                rt++;
            }else {
                if (k > 0) {
                    k--;
                    rt++;
                }else {
                    max = Math.max(max,rt-lt);
                    if (ar[lt] != 1) {
                        k++;
                    }
                    lt++;
                }
            }
        }
        return max;

    }

    public static void main(String[] args) {
        최대_길이_연속부분수열_6 T = new 최대_길이_연속부분수열_6();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        System.out.println(T.Solution(n,k,ar));


    }
}
