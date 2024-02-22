import java.util.Scanner;

public class 가장_짧은_문자거리_10 {

    public String Solution(String str, char c) {

        int[] ar = new int[str.length()];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int min = Integer.MAX_VALUE;

            if(str.charAt(i) == c) {
                ar[i] = 0;
            }else{
                for(int j = 0; j < str.length(); j++) {

                    if(str.charAt(j) == c) {
                        if(min > Math.abs(j-i)) {
                            min = Math.abs(j-i);
                        }
                    }
                }
                ar[i] = min;
            }
            sb.append(ar[i] + " ");
        }

        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        가장_짧은_문자거리_10 T = new 가장_짧은_문자거리_10();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(T.Solution(str,c));

    }
}
