import java.util.Scanner;

public class samp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            long N = scanner.nextLong();
            // m = floor(N/2)
            long m = N / 2;

            // Compute the answer using the derived formula:
            // ans = (m+1) * ( m*(3*N - 2*m - 1) + 6 ) / 6
            long numerator = m * (3 * N - 2 * m - 1) + 6;
            long ans = (m + 1) * numerator / 6;

            System.out.println(ans);
        }

        scanner.close();
    }
}