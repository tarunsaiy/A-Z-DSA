//GFG : https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1
public class Prime {
    public static void main(String[] args) {
        System.out.println(primeCheck(77));
        printPrimeNumbers(20);
    }
    static boolean primeCheck(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    static void printPrimeNumbers(int n){
        for(int i = 2; i <= n; i++){
            int flag = -1;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag == -1) System.out.print(i + " ");
        }
        System.out.println();
    }
}
