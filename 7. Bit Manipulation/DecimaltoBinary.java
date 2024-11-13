public class DecimaltoBinary {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(toBinary(n));
    }
    static String toBinary(int n){
        String ans = "";
        while (n != 0){
            if(n % 2 != 0) ans += "1";
            else ans += "0";
            n /= 2;
        }
        ans = reverse(ans);
        return ans;
    }
    static String reverse(String str){
        StringBuilder s = new StringBuilder();
        s.append(str);
        s.reverse();
        return s.toString();
    }
}

