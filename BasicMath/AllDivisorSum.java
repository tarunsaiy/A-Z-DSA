public class AllDivisorSum {
    public static void main(String[] args) {
        int n = 4;
        int ans = 0;
        for (int i = 0; i < n; i++){
            ans += divisorSum(i + 1);
        }
        System.out.println(ans);
    }
    static int divisorSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            if(n % i == 0) sum += i;
        }
        return sum;
    }
}
