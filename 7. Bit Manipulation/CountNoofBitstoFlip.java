public class CountNoofBitstoFlip {
    public static void main(String[] args) {
        int num = 8;
        int target = 2;
        int ans = num ^ target;
        int cnt = 0;
        int size = (int)(Math.log(num) / Math.log(2)) + 1;
        int i = 0;
        while (i < size){
            if((ans & (1 << i)) != 0) cnt += 1;
            i += 1;
        }
        System.out.println(cnt);
    }
}
