import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long res = 0;
        long last = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] >= last) {
                last = arr[i];
                continue;
            }

            res += last - arr[i];
        }

        System.out.println(res);

        sc.close();
    }
}
