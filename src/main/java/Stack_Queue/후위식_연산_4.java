package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class 후위식_연산_4 {

    public int Solution(String s) {
        Stack<Integer> stack = new Stack<>();

        int top = 0, bot = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case '+' :
                    top = stack.pop();
                    bot = stack.pop();
                    stack.add(top + bot);
                    break;
                case '-' :
                    top = stack.pop();
                    bot = stack.pop();
                    stack.add(bot - top);
                    break;
                case '*' :
                    top = stack.pop();
                    bot = stack.pop();
                    stack.add(top * bot);
                    break;
                case '/' :
                    top = stack.pop();
                    bot = stack.pop();
                    stack.add(bot / top);
                    break;
                default:stack.add(Integer.parseInt(String.valueOf(c)));
                    break;
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        후위식_연산_4 T = new 후위식_연산_4();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(T.Solution(s));
    }
}
