import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long targetSum = (n * (1 + n)) / 2;
        long sum = 0;

        for (long i = 0; i < n - 1; i++) {
            sum += sc.nextLong();
        }

        System.out.println(targetSum - sum);

        sc.close();
    }
}
