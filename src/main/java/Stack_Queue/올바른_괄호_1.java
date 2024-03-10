package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class 올바른_괄호_1 {

    public String Solution(String s) {

        Stack<Character> stack = new Stack<>();

        if(s.charAt(0) == ')') return "NO";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') stack.add(c);
            else
                if(stack.isEmpty()) return "NO";
                else stack.pop();
        }

        if (stack.isEmpty()) return "YES";

        return "No";
    }

    public static void main(String[] args) {
        올바른_괄호_1 T = new 올바른_괄호_1();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(T.Solution(s));
    }
}
