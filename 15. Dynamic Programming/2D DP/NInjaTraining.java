import java.util.Arrays;

public class NInjaTraining {
    static int memorization(int[][] points){
        int dp[][] = new int[points.length][4];
        for (int[] i : dp) Arrays.fill(i, -1);
        return f(points, points.length - 1, 3, dp);
    }
    static int f(int[][] points,int day, int last, int[][]dp){
        if (day == 0){
            int max = 0;
            for (int task = 0; task < 3; task++){
                if (task != last){
                    max = Math.max(points[0][task],max);
                }
            }
            return dp[0][last] = max;
        }
        if (dp[day][last] != -1) return dp[day][last];
        int max = 0;
        for (int task = 0; task < 3; task++){
            if (task != last){
                int point = points[day][task] + f(points, day - 1, task, dp);
                max = Math.max(max, point);
            }
        }
        return dp[day][last] = max;
    }

    static int tabulation(int[][] points){
        int[][] dp = new int[points.length][4];
        dp[0][0] = Math.max(points[0][1], points[0][2]);
        dp[0][1] = Math.max(points[0][0], points[0][2]);
        dp[0][2] = Math.max(points[0][0], points[0][1]);
        dp[0][3] = Math.max(points[0][0], Math.max(points[0][1], points[0][2]));
        for (int day = 1; day < points.length; day++){
            for (int last = 0; last < 4; last++){
                dp[day][last] = 0;
                for (int task = 0; task < 3; task++){
                    if (last != task){
                        int point = points[day][task] + dp[day - 1][task];
                        dp[day][last] = Math.max(point, dp[day][last]);
                    }
                }
            }
        }
        return dp[points.length - 1][3];
    }
    static int spaceOptimization(int[][] points){
        int prev[] = new int[4];
        prev[0] = Math.max(points[0][1], points[0][2]);
        prev[1] = Math.max(points[0][0], points[0][2]);
        prev[2] = Math.max(points[0][0], points[0][1]);
        prev[3] = Math.max(points[0][0], Math.max(points[0][1], points[0][2]));

        for (int day = 1; day < points.length; day++){
            int[] temp = new int[4];
            for (int last = 0; last < 4;last++){

                temp[last] = 0;
                for (int task = 0; task < 3; task++){
                    if (task != last){
                        int point = points[day][task] + prev[task];
                        temp[last] = Math.max(temp[last], point);
                    }
                }
            }
            prev = temp;
        }
        return prev[3];
    }
    public static void main(String[] args) {
        int[][] points = {{10, 40, 70},
                {20, 50, 80},
                {30, 60, 90}};
        System.out.println(memorization(points));
        System.out.println(tabulation(points));
        System.out.println(spaceOptimization(points));
    }
}
