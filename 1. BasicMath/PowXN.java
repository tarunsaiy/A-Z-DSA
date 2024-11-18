public class PowXN {
    public static void main(String[] args) {
        System.out.println(pow(1, Integer.MIN_VALUE));
    }
    static double pow(double x, int n){
        double ans = 1;
        if(n == Integer.MIN_VALUE){
            ans *= x;
            n += 1;
        }
        boolean negative = false;
        n = Math.abs(n);
        if(n < 0) negative = true;
        while (n > 0){
            if((n & 1) == 1){
                ans = ans * x;
                n -= 1;
            }
            else {
                n /= 2;
                x *= x;
            }
        }
        if(negative) return (1 / ans);
        return ans;
    }
}
