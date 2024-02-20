import java.util.Scanner;
import java.util.Stack;

public class 회문_문자열_7 {

    public String Solution(String str) {
        str = str.toLowerCase();
        int size = str.length();

        for(int i=0;i<size/2;i++) {
            if(str.charAt(i) != str.charAt(size-i-1)) return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        회문_문자열_7 T = new 회문_문자열_7();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.Solution(str));
    }
}
