package Array;

import java.util.Scanner;

public class 뒤집은_소수_6 {

    public boolean Solution(int n) {

        //소수 => false
        //소수x => true
        if(n < 2) {
            return true;
        }

        if(n == 2) {
            return false;
        }

        for(int i= 2; i <=Math.sqrt(n);i++) {
            if(n % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        뒤집은_소수_6 T = new 뒤집은_소수_6();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] ar = new String[n];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = new StringBuilder(sc.next()).reverse().toString();
            int num = Integer.parseInt(ar[i]);
            if(T.Solution(num) == false) {
                System.out.print(num + " ");
            }
        }
    }
}
