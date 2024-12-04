public class JumpGame{
    public static void main(String[] args) {
        int[] arr = {3,2,1,0,4};
        System.out.println(jumpGame(arr));
    }
    static boolean jumpGame(int[] arr){
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++){
            if (i > maxIndex) return false;
            maxIndex = Math.max(maxIndex, arr[i] + i);
            if(maxIndex >= arr.length) return true;
        }
        return true;
    }
}
