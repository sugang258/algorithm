import java.util.Scanner;

public class 중복문자제거_6 {

    public String Solution(String str) {
        char[] ar = str.toCharArray();

        for (int i =0;i<ar.length;i++) {
            char c = ar[i];

            for(int j= i+1; j<ar.length; j++) {
                if(c == ar[j]) ar[j] =' ';
            }
        }
        return String.valueOf(ar).replace(" ","");
    }

    public static void main(String[] args) {
        중복문자제거_6 T = new 중복문자제거_6();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(T.Solution(str));

    }
}
