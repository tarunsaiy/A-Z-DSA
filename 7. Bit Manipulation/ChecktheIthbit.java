public class ChecktheIthbit {
//    if ith bit == 1 it is set else not
    public static void main(String[] args) {
        System.out.println(check(8,3));
        System.out.println(5 >> 2 & 1);
    }
    static boolean check(int n, int i){
        if((n >> i & 1) == 1) return true;
        return false;
    }

}
 