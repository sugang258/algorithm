package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class 큰_수_출력하기_1 {

    public ArrayList<Integer> Solution(int[] ar, int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(ar[0]);

        for(int i=1;i<n;i++) {
            if(ar[i] > ar[i-1]) {
                arrayList.add(ar[i]);
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        큰_수_출력하기_1 T = new 큰_수_출력하기_1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];

        for(int i=0;i<n;i++) {
            ar[i] = sc.nextInt();
        }

        for(int x : T.Solution(ar,n)) {
            System.out.print(x + " ");
        }
    }
}
