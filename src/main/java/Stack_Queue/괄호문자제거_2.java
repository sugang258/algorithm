package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거_2 {

    public Stack<Character> Solution(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if(c != ')') stack.add(c);
            else {
                while(stack.peek() != '(') stack.pop();
                stack.pop();
            }
        }
        return stack;
    }

    public static void main(String[] args) {
        괄호문자제거_2 T = new 괄호문자제거_2();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        for (char c : T.Solution(s)) {
            System.out.print(c);
        }
    }
}
