import java.util.Scanner;

public class 문장_속_단어_3 {

    public String Solution(String str) {
        String[] array = str.split(" ");
        String answer = "";

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i].length() > max) {
                max = array[i].length();
                answer = array[i];
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        문장_속_단어_3 T = new 문장_속_단어_3();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(T.Solution(str));

    }
}