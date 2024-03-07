package HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class 아나그램_2 {

    public String Solution(String s1, String s2) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(char x : s1.toCharArray()) {
            map1.put(x, map1.getOrDefault(x,0)+1);
        }
        for(char x : s2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x,0)+1);
        }

        if(map1.equals(map2)) {
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {
        아나그램_2 T = new 아나그램_2();
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(T.Solution(s1,s2));
    }
}
