public class CountNoofBitstoFlip {
    public static void main(String[] args) {
        int num = 8;
        int target = 2;
        int ans = num ^ target;
        int len = (int) (Math.log(ans) / Math.log(2)) + 1;
        int cnt = 0;
        for(int i = 0; i < len; i++){
            if((ans & (1 << i)) != 0) cnt += 1;
        }
        System.out.println(cnt);
    }
}
