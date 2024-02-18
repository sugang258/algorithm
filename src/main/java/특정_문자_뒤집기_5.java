import java.util.Scanner;

public class 특정_문자_뒤집기_5 {

    public String Solution(String str) {
        char[] ar = str.toCharArray();
        int lt = 0, rt = str.length()-1;

        while(lt < rt) {
            if (!Character.isAlphabetic(ar[lt])) lt++;
            else if (!Character.isAlphabetic(ar[rt])) rt--;
            else {
                char tmp = ar[lt];
                ar[lt] = ar[rt];
                ar[rt] = tmp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(ar);
    }

    public static void main(String[] args) {
        특정_문자_뒤집기_5 T = new 특정_문자_뒤집기_5();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(T.Solution(str));
    }
}
