public class NoofSetBits {
    public static void main(String[] args) {
        int n = 7;
        int cnt = 0;
        int i = 0;
        int size = (int)(Math.log(n)/Math.log(2)) + 1;
        while (i < size){
            if((n & (1 << i))  != 0) cnt += 1;
            i++;
        }
        System.out.println(cnt);
    }
}
