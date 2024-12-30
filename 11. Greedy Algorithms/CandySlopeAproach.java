public class CandySlopeAproach {
    public static void main(String[] args) {
        int[] arr= {1,5,4,2,1};
        System.out.println(minimumCandies(arr));
    }
    static int minimumCandies(int[] arr){
        int peek = 0, sum = 1, down = 0, i = 1, n = arr.length;
        while (i < n){
            if (arr[i] == arr[i - 1]){
                sum += 1; i += 1; continue;
            }
            peek = 1;
            while (i < n && arr[i - 1] < arr[i]){
                peek += 1; sum += peek; i += 1;
            }
            down = 1;
            while (i < n && arr[i - 1] > arr[i]){
                sum += down;down += 1;  i += 1;
            }
//            down += 1;
            if(down > peek){
                sum += down - peek;
            }
        }
        return sum;
    }
}
