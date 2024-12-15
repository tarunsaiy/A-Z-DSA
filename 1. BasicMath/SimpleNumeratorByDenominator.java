import java.util.Arrays;

//given a b c d -> Give te value of a/b + c/d in simplest form
public class SimpleNumeratorByDenominator {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(addFraction(5,7,4,9)));
    }
    public static long[] addFraction(int a, int b, int c, int d) {
        long num = a * d + b * c;
        long den = b * d;
        long gcd = gcd(Math.min(num, den), Math.max(den, num));
        num /= gcd;
        den /= gcd;
        return new long[]{num ,den};
    }
    static long gcd(long a, long b){
        if(a == 0) return b;
        return gcd(b % a, a);
    }
}
