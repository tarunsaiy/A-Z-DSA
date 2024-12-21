public class BinarytoDecimal {
    public static void main(String[] args) {
        int arr[] = {1,0,0};
        System.out.println(toDecimal(arr));
        System.out.println(todecimal(arr));
    }
    static int toDecimal(int[] arr){
        int pow = arr.length - 1;
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            ans += (arr[i] << pow);
            pow -= 1;
        }
        return ans;
    }
    static int todecimal(int[] arr){
        int ans = 0, pow = 1;
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == 1) ans += pow;
            pow *= 2;
        }
        return ans;
    }
}
