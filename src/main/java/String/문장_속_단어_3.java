package String;

import java.util.Scanner;

public class 문장_속_단어_3 {

    public String Solution(String str) {
        String answer = "";

        int max = Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' ')) != -1) {
            String tmp = str.substring(0,pos);
            int len = tmp.length();

            if(len > max) {
                max = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }
        //마지막 단어
        if(str.length() > max) answer = str;

        return answer;

    }

    public static void main(String[] args) {
        문장_속_단어_3 T = new 문장_속_단어_3();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(T.Solution(str));

    }
}