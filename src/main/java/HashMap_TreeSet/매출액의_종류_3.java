package HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class 매출액의_종류_3 {

    public String Solution(int n, int k, int[] ar) {
        HashMap<Integer, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            map.put(ar[i],map.getOrDefault(ar[i],0)+1);
        }
        sb.append(map.size() + " ");

        int lt =0, rt =k;
        while(rt < n) {
            if(map.get(ar[lt]) > 1) {
                map.put(ar[lt], map.get(ar[lt])-1);
            }else{
                map.remove(ar[lt]);
            }
            map.put(ar[rt],map.getOrDefault(ar[rt],0)+1);
            lt++;
            rt++;
            sb.append(map.size() + " ");
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        매출액의_종류_3 T = new 매출액의_종류_3();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println(T.Solution(n,k,ar));
    }
}
