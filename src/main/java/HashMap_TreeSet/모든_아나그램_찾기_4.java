package HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class 모든_아나그램_찾기_4 {

    public int Solution(String s, String t) {

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : t.toCharArray()) {
            map1.put(c,map1.getOrDefault(c,0)+1);
        }

        for (int i = 0; i < t.length()-1; i++) {
            map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);
        }

        int lt=0, rt =t.length()-1, count =0;
        while(rt < s.length() && lt < s.length()) {
            map2.put(s.charAt(rt), map2.getOrDefault(s.charAt(rt),0)+1);
            if(map1.equals(map2)) count++;
            if (!map2.containsKey(s.charAt(lt)) || map2.get(s.charAt(lt)) > 1) {
                map2.put(s.charAt(lt), map2.getOrDefault(s.charAt(lt),0)-1);
            }else{
                map2.remove(s.charAt(lt));
            }
            lt++; rt++;
        }
        return count;
    }

    public static void main(String[] args) {
        모든_아나그램_찾기_4 T = new 모든_아나그램_찾기_4();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        System.out.println(T.Solution(s,t));



    }
}
