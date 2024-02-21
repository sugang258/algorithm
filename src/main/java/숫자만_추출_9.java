import java.util.Scanner;

public class 숫자만_추출_9 {

    public int Solution(String str) {

        str = str.toUpperCase().replaceAll("[A-Z]","");

        return Integer.parseInt(str);

    }

    public static void main(String[] args) {
        숫자만_추출_9 T = new 숫자만_추출_9();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(T.Solution(str));

    }
}
