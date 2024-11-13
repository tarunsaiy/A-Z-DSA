public class Clearithbit {
    public static void main(String[] args) {
        int n = 70;
        int i = 2;
        int ans = n & (~(1 << i));
        System.out.println(ans);
    }
}
