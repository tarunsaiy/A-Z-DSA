public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {-1,-8,-99,0,-2};
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        System.out.println(largest);
    }
}
