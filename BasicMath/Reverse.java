public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(56443));
    }
    static int reverse(int n){
        int ans = 0;
        while(n > 0){
            int lb = n % 10;
            ans = ans * 10 + lb;
            n /= 10;
        }
        return ans;
    }
}
