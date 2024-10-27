public class GCDandHCF_Iterative {
    public static void main(String[] args) {
        int gcd = 1, hcf= 1;
        int a = 8, b = 20;
//        GCD
        for (int i = 1; i <= Math.min(a, b); i++){
            if(a % i == 0 && b % i == 0) gcd = i;
        }
        for(int i = Math.min(a, b); i > 0; i--){
            if(a % i == 0 && b % i == 0){
                hcf = i;
                break;
            }
        }
        System.out.println("GCD : " + gcd+" HCF : "+hcf);
        System.out.println(RecusrsiveGCD(a, b));
        System.out.println(RecursiveHCF(a, b));
    }
    static int RecusrsiveGCD(int a, int b){
        if(a > b) return RecusrsiveGCD(b, a);
        if(a == 0) return b;
        return RecusrsiveGCD(b % a, a);
    }
    static int RecursiveHCF(int a, int b){
        if(b % a == 0) return a;
        return RecursiveHCF(b % a, a);
    }
}
