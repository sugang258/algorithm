package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기_5 {

    public int Solution(String s) {
        Stack<Character> stack = new Stack<>();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.add(s.charAt(i));
            }else {
                if(s.charAt(i-1) == '(') {
                    stack.pop();
                    cnt += stack.size();
                }
                if (s.charAt(i-1) != '(') {
                   stack.pop();
                   cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        쇠막대기_5 T = new 쇠막대기_5();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(T.Solution(s));
    }
}
