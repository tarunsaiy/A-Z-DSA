public class BinarytoDecimal {
    public static void main(String[] args) {
        int arr[] = {1,0,1,1};
        System.out.println(toDecimal(arr));
    }
    static int toDecimal(int[] arr){
        int ans = 0, pow = 1;
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == 1) ans += pow;
            pow *= 2;
        }
        return ans;
    }
}
