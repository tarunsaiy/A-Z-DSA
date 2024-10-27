public class AmstrongNumber {
    public static void main(String[] args) {
        System.out.println(checkArmstrong(153));
    }
    static boolean checkArmstrong(int n){
        int sum = 0;
        int act = n;
        while(n > 0){
            int lastbit = n % 10;
            sum += (int)Math.pow(lastbit, 3);
            n /= 10;
        }
        if(act == sum) return true;
        return false;
    }
}
