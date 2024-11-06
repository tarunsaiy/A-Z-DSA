public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5,6,9,8,2,3,77};
        int target = 7;
        int ans = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
