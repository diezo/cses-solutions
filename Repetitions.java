import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int res = 0;
        int len = 0;

        char lastChar = '-';

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != lastChar) len = 0;
            
            lastChar = str.charAt(i);
            len++;

            res = Math.max(res, len);
        }

        System.out.println(res);

        sc.close();
    }
}