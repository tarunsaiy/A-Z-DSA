public class XORfromLtoR {
    public static void main(String[] args) {
       int l = 4;
       int r = 8;
        System.out.println(xor(l - 1) ^ xor(r));
    }
    static int xor(int n){
        if(n % 4 == 1) return 1;
        if(n % 4 == 2) return n + 1;
        if(n % 4 == 3) return 0;
        return n;
    }
}
