package String;

import java.util.Scanner;

public class 대소문자_변환_2 {

    public String Solution(String str) {

        int tmp = 0;
        String result ="";

        for (int i = 0; i < str.length(); i++) {
            tmp = (int) str.charAt(i);
            if(tmp>=97 && tmp<=122) {
                result += (char) (tmp-32);
            }
            if(tmp>=65 && tmp <= 90) {
                result += (char) (tmp+32);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        대소문자_변환_2 T = new 대소문자_변환_2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(T.Solution(str));

    }
}
