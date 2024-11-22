public class SingleElement {
    public static void main(String[] args) {
       int[] arr = {1,1,2,2,3,3,4,4,5,5,6,7,7};
        System.out.println(singleElem(arr));
    }
    static int singleElem(int[] arr){
        int n = arr.length;
        if(n == 1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[n - 1] != arr[n - 2]) return arr[n - 1];
        int low = 0, high = n - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) return arr[mid];
            if((((mid & 1) == 0) && arr[mid] == arr[mid + 1]) || (((mid & 1) == 1) && arr[mid] == arr[mid - 1])) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
