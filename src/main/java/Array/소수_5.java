package Array;

import java.util.Scanner;

public class 소수_5 {

    public static boolean[] prime;

    public void Solution(int n) {

        prime = new boolean[n+1];

        //소수x => true
        //소수 => false
        if(n<2) {
            return;
        }
        prime[0] = prime[1] = true;

        for(int i=2;i<=Math.sqrt(n);i++) {
            if(prime[i] == true) {
                continue;
            }

            for(int j=i*i;j< prime.length;j=j+i) {
                prime[j] = true;
            }
        }
    }

    public static void main(String[] args) {
        소수_5 T = new 소수_5();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        T.Solution(n);
        int cnt = 0;

        for (int i = 0; i < prime.length; i++) {
            if (prime[i] == false) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
