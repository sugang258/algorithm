package HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class 학급_회장_1 {
    public static HashMap<Character,Integer> map;

    public char Solution(int n, String s) {

        char answer = ' ';
        for(char x : s.toCharArray()) {
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int max = 0;
        for(char key : map.keySet()) {
            if(map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        학급_회장_1 T = new 학급_회장_1();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        map = new HashMap<>();

        System.out.println(T.Solution(n,sc.next()));
    }
}
