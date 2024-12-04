import java.util.Arrays;

public class JobSequence {
    public static void main(String[] args) {
       Job[] arr = new Job[4];
        arr[0] = new Job(1, 4, 20);
        arr[1] = new Job(2, 1, 10);
        arr[2] = new Job(3, 2, 40);
        arr[3] = new Job(4, 2, 30);
        System.out.println(Arrays.toString(jobSequence(arr)));
    }
    static int[] jobSequence(Job[] arr){
        Arrays.sort(arr, (a, b) -> (b.profit - a.profit));
        int maxDeadline = 0;
        for (int i = 0; i < arr.length; i++){
            maxDeadline = Math.max(maxDeadline, arr[i].deadline);
        }
        int[] hash = new int[maxDeadline + 1];
        Arrays.fill(hash, -1);
        hash[0] = 0;
        int totalJobs = 0, maxProfit = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = arr[i].deadline; j >= 0; j--){
                if (hash[j] == -1){
                    totalJobs += 1;
                    maxProfit += arr[i].profit;
                    hash[j] = j;
                    break;
                }
            }
        }
        return new int[]{totalJobs, maxProfit};
    }
}
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z) {
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}

