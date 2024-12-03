public class DivideTwoIntegers {
    public static void main(String[] args) {
        System.out.println(divide(18, -3));
    }
    static int divide(int a, int b){
        boolean check = false;
        if(a > 0 && b < 0) check = true;
        if(a < 0 && b > 0) check = true;
        int n = Math.abs(a);
        int d = Math.abs(b);
        int ans = 0;
        while (n >= d){
            int cnt = 0;
            while (n >= (d << cnt + 1)) cnt += 1;
            ans +=  1<< cnt;
            n -= d << cnt;
        }
        if(ans == 1 << 31 && check == true) return Integer.MAX_VALUE;
        if(ans == 1 << 31 && check == false) return Integer.MIN_VALUE;
        return check ? -ans : ans;
    }
}
