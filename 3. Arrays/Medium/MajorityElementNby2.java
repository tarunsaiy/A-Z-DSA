public class MajorityElementNby2 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,3,3,2};
        System.out.println(majorityElement(arr));
    }
    static int majorityElement(int[] arr){
        int elem = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(count == 0){
                elem = arr[i];
                count += 1;
            } else if (arr[i] == elem) {
                count += 1;
            }
            else{
                count -= 1;
            }
        }
        int condition = arr.length / 2;
        count = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == elem) count += 1;
        }
        return count >= condition ? elem : -1;
    }
}
