package String;

import java.util.Scanner;

public class 회문_문자열_7 {

    public String Solution(String str) {
       String tmp = new StringBuilder(str).reverse().toString();
       if(str.equalsIgnoreCase(tmp)) return "YES";
       return "NO";
    }

    public static void main(String[] args) {
        회문_문자열_7 T = new 회문_문자열_7();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.Solution(str));
    }
}
