public class Prime {
    public static void main(String[] args) {
        System.out.println(primeCheck(77));
        printPrimeNumbers(50);
        System.out.println(countPrime(10));
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
    static int countPrime(int n){
        int count = 0;
        for(int i = 2; i <= n; i++){
            int flag = -1;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag == -1) count += 1;
        }
        return count;
    }
}
