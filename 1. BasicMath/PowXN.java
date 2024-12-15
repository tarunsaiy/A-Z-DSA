//LEETCODE 50
public class PowXN {
    public static void main(String[] args) {
        System.out.println(pow(2, -1));
    }
    static double pow(double x, int n){
        double ans = 1;
        if(n == Integer.MIN_VALUE){
            ans *= x;
            n += 1;
        }
        int neg = n;
        n = Math.abs(n);
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
        if(neg < 0) return (1 / ans);
        return ans;
    }
}
