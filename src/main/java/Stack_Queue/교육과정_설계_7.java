package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 교육과정_설계_7 {

    public String Solution(String seq, String schedule) {

        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < seq.length(); i++) {
            queue.add(seq.charAt(i));
        }

        for (char c : schedule.toCharArray()) {
            if(c == queue.peek()) {
                queue.remove();
            }
            if(queue.isEmpty()) return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        교육과정_설계_7 T = new 교육과정_설계_7();
        Scanner sc = new Scanner(System.in);

        String seq = sc.next();
        String schedule = sc.next();

        System.out.println(T.Solution(seq,schedule));
    }
}
