public class CountPrime {
//    count prime only less than n
   public static void main(String[] args) {
       System.out.println(countPrime(20));
   }
   static int countPrime(int n){
       int arr[] = new int[n + 1];
       for(int i = 2; i <= Math.sqrt(n); i++){
           if(arr[i] == 0){
               for (int j = i * i; j <= n; j += i){
                   arr[j] = 1;
               }
           }
       }
       int cnt = 0;
       for(int i = 2; i < n; i++){
           if(arr[i] == 0) cnt += 1;
       }
       return cnt;
   }
}
