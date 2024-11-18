import java.util.ArrayList;

public class PrimeFactors {
    public static void main(String[] args) {
        System.out.println(primeFactors(12246));
    }
    static ArrayList<Integer> primeFactors(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                arr.add(i);
                while (n % i == 0){
                    n = n / i;
                }
            }
        }
        if(n != 1) arr.add(n);
        return arr;
    }
}
