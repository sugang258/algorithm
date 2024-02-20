import java.util.Scanner;
import java.util.Stack;

public class 유효한_팰린드롬_8 {

    public String Solution(String str) {
        Stack<Character> stack = new Stack<>();
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i))) {
                s += str.charAt(i);
            }
        }
        s = s.toLowerCase();
        int size = s.length();

        for (int i = 0; i < size/2; i++) {
            stack.add(s.charAt(i));
        }

        //짝수일 때
        if(size % 2 == 0) {
            for(int i=0;i<size/2;i++) {
                if(stack.peek() == s.charAt(i+(size/2))) {
                    stack.pop();
                }else{
                    return "NO";
                }
            }
        }

        //홀수일 때
        if(size % 2 != 0) {
            for(int i = 0; i<size/2;i++) {
                if(stack.peek() == s.charAt(i + (size/2)+1)) {
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
        유효한_팰린드롬_8 T = new 유효한_팰린드롬_8();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(T.Solution(str));

    }
}
