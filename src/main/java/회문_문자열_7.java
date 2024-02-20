import java.util.Scanner;
import java.util.Stack;

public class 회문_문자열_7 {

    public String Solution(String str) {
        Stack<Character> stack = new Stack<>();
        str = str.toLowerCase();
        int size = str.length();

        for (int i = 0; i < size/2; i++) {
            stack.add(str.charAt(i));
        }

        //짝수일 때
        if(size % 2 == 0) {
            for(int i=0;i<size/2;i++) {
                if(stack.peek() == str.charAt(i+(size/2))) {
                    stack.pop();
                }else{
                    return "NO";
                }
            }
        }

        //홀수일 때
        if(size % 2 != 0) {
            for(int i = 0; i<size/2;i++) {
                if(stack.peek() == str.charAt(i + (size/2)+1)) {
                    stack.pop();
                }else {
                    return "NO";
                }
            }
        }

        if(stack.isEmpty()) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        회문_문자열_7 T = new 회문_문자열_7();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.Solution(str));
    }
}
