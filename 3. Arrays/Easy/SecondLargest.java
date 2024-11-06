public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,20,5,6,3,99,88,99,14,3,8,9};
        int max = Integer.MIN_VALUE, secmax = Integer.MIN_VALUE;
        for(int i : arr){
            max = Math.max(max, i);
            if(i < max && i >= secmax) secmax = i;
        }
        System.out.println("max: "+max+" secmax " +secmax);
    }
}
