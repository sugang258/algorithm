import java.util.Scanner;

public class 암호_12 {

    public String Solution(int n, String str) {

        StringBuilder sb = new StringBuilder();
        String[] ar = new String[n];
        int tmp = 0;

        for(int i=0;i<n;i++){
            ar[i] = str.substring(tmp,tmp+7);
            tmp = tmp+7;
            String result = "";

            for(int j=0;j<ar[i].length();j++) {

                if(ar[i].charAt(j) == '#') {
                    result += "1";
                }else{
                    result += "0";
                }

            }
            char answer = (char)Integer.parseInt(result,2);
            sb.append(answer);
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        암호_12 T = new 암호_12();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.Solution(n,str));

    }
}
