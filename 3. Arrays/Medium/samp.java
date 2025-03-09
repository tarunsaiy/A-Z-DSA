import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputData = scanner.nextLine().split(" ");
        int t = Integer.parseInt(inputData[0]);
        int index = 1;
        List<String> resLines = new ArrayList<>();

        for (int _ = 0; _ < t; _++) {
            int n = Integer.parseInt(inputData[index++]);
            int x = Integer.parseInt(inputData[index++]);
            int k = Integer.parseInt(inputData[index++]);
            String s = inputData[index++];

            int[] prefix = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                if (s.charAt(i - 1) == 'L') {
                    prefix[i] = prefix[i - 1] - 1;
                } else {
                    prefix[i] = prefix[i - 1] + 1;
                }
            }

            int firstReset = -1;
            for (int i = 1; i <= n; i++) {
                if (x + prefix[i] == 0) {
                    firstReset = i;
                    break;
                }
            }

            if (firstReset == -1 || firstReset > k) {
                resLines.add("0");
                continue;
            }

            int resets = 1;
            int timeUsed = firstReset;

            int t0 = -1;
            for (int j = 1; j <= n; j++) {
                if (prefix[j] == 0) {
                    t0 = j;
                    break;
                }
            }

            if (t0 == -1) {
                resLines.add(String.valueOf(resets));
                continue;
            }

            int additionalCycles = (k - timeUsed) / t0;
            resets += additionalCycles;
            resLines.add(String.valueOf(resets));
        }

        System.out.println(String.join("\n", resLines));
    }
}