package TwoPointers;

import java.util.Scanner;

public class 연속된_자연수의_합_5 {

    public int Solution(int n) {

        int count = 0, sum = 0, lt = 1;

        for(int i=1; i<=n/2+1; i++) {
            sum += i;
            if(sum == n) count++;
            while(sum >= n) {
                sum -= lt++;
                if(sum == n) count++;
            }
        }
        return count;
    }

    public int Solution_Math(int n) {
        int count = 0, cnt = 1;
        n--;
        while(n > 0) {
            cnt++;
            n = n-cnt;

            if(n % cnt == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        연속된_자연수의_합_5 T = new 연속된_자연수의_합_5();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(T.Solution_Math(n));
    }
}
