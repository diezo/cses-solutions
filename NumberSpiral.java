import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class NumberSpiral {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    static long nextLong() throws Exception {
        int c;
        while ((c = br.read()) <= ' ') {}

        long num = 0;
        boolean negative = false;

        if (c == '-') {
            negative = true;
            c = br.read();
        }

        while (c > ' ') {
            num = num * 10 + (c - '0');
            c = br.read();
        }

        return negative ? -num : num;
    }

    public static void main(String[] args) throws Exception {
        long t = nextLong();

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            long x = nextLong() - 1;
            long y = nextLong() - 1;

            long res = compute(x, y);
            sb.append(res + (t > 0 ? "\n" : ""));
        }

        println(sb.toString());

        br.close();
    }

    private static long compute(long x, long y) {
        long res = Math.max(x, y) * Math.max(x, y);

        if (x > y) {
            if (x % 2 == 0) {
                return res + y + 1;
            } else {
                return res + (x * 2) + 1 - y;
            }
        } else {
            if (y % 2 != 0) {
                return res + x + 1;
            } else {
                return res + (y * 2) + 1 - x;
            }
        }
    }

    private static void print(Object o) {
        System.out.print(o);
    }

    private static void println(Object o) {
        System.out.println(o);
    }
}