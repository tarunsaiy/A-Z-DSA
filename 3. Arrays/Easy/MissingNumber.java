public class MissingNumber {
    public static void main(String[] args) {
        int arr0[] = {0,1,3};
        int arr[] = {1,2,4};
        System.out.println(missingNumber0xor(arr0));
        System.out.println(missingNumberxor(arr));
        System.out.println(cyclicsort0(arr0));
    }
    static int missingNumber0xor(int[] arr){
        int xor1 = 0, xor2 = 0;
        for(int i = 0; i < arr.length; i++){
            xor1 ^= arr[i];
            xor2 ^= i + 1;

        }
        return xor1 ^ xor2;
    }
    static int missingNumberxor(int[] arr){
        int xor1 = 0, xor2 = 0;
        for(int i = 0; i < arr.length; i++){
            xor1 ^= arr[i];
            xor2 ^= i + 1;

        }
        xor2 ^= arr.length + 1;
        return xor1 ^ xor2;
    }
    static int cyclicsort0(int arr[]){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }
        }
        for(int ii = 0; ii < arr.length; ii++){
            if(arr[ii] != ii){
                return ii;
            }
        }
        return arr.length + 1;
    }
}
