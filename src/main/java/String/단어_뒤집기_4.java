package String;

import java.util.Scanner;

public class 단어_뒤집기_4 {

    public StringBuilder Solution(String str) {

        StringBuilder st = new StringBuilder();

        for (int i = str.length()-1; i >= 0; i--) {
            st.append(str.charAt(i));
        }
        return st;
    }

    public static void main(String[] args) {
        단어_뒤집기_4 T = new 단어_뒤집기_4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            System.out.println(T.Solution(str));
        }
    }
}
