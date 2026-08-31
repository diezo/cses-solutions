import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 1) {
            System.out.println(n);

            sc.close();
            System.exit(0);
        }

        if (n == 4) {
            System.out.println("2 4 1 3");

            sc.close();
            System.exit(0);
        }

        if (n < 5) {
            System.out.println("NO SOLUTION");

            sc.close();
            System.exit(0);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i += 2) {
            sb.append(i + " ");
        }

        for (int i = 2; i <= n; i += 2) {
            sb.append(i + " ");
        }

        System.out.println(sb.toString());

        sc.close();
    }
}
