import java.util.Arrays;

public class MinimumPlatforms {
    public static void main(String[] args) {
        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int departure[] = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(minimumPlatforms(arrival, departure));
    }
    static int minimumPlatforms(int[] arrival, int[] departure){
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int i = 0, j = 0, cnt = 0, min = 0;
        while (i < arrival.length){
            if(arrival[i] < departure[j]){
                cnt += 1;
                i += 1;
            }else {
                cnt -= 1;
                j += 1;
            }
            min = Math.max(min, cnt);
        }
        return min;
    }
}
