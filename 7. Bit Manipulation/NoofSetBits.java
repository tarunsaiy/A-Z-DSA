public class NoofSetBits {
    public static void main(String[] args) {
        int n = 9;
        int cnt = 0;
        int i = 0;
        while (i < 31){
            if((n & (1 << i))  != 0) cnt += 1;
            i++;
        }
        System.out.println(cnt);
        int size = (int)(Math.log(n)/Math.log(2)) + 1;
        System.out.println(size);
    }
}
