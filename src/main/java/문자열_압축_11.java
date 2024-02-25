import java.util.Scanner;

public class 문자열_압축_11 {

    public String Solution(String str) {
        StringBuilder sb = new StringBuilder();

        str = str+ " ";
        char[] ar = str.toCharArray();

        int cnt = 1;
        for (int i = 0; i < ar.length-1; i++) {

            if(ar[i] == ar[i+1]) {
                cnt++;
            }
            else{
                sb.append(ar[i]);
                if(cnt > 1) {
                    sb.append(cnt);
                }
                cnt = 1;
            }
        }
        return String.valueOf(sb);
    }


    public static void main(String[] args) {
        문자열_압축_11 T = new 문자열_압축_11();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(T.Solution(str));
    }
}
