public class Palindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome(12121));
    }
    static boolean checkPalindrome(int n){
        int org = n;
        int temp = 0;
        while(n > 0){
            int lb = n % 10;
            temp = temp * 10 + lb;
            n /= 10;
        }
        if(temp == org) return true;
        return false;
    }
}
