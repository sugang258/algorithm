import java.util.Scanner;

public class 유효한_팰린드롬_8 {

    public String Solution(String str) {
        str = str.toUpperCase().replaceAll("[^A-Z]","");

        String tmp = new StringBuilder(str).reverse().toString();

        if(str.equals(tmp)) return "YES";

        return "NO";
    }

    public static void main(String[] args) {
        유효한_팰린드롬_8 T = new 유효한_팰린드롬_8();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(T.Solution(str));

    }
}
