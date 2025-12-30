package LeetCode;

import java.util.*;

public class MinimumCostToMakeArrayEqual {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2};
        int[] cost = {2, 3, 1, 14};

        long ans = minimumCost(nums, cost);
        System.out.println(ans);
    }

    static long minimumCost(int[] nums, int[] cost) {
        int n = nums.length;

        // Pair nums and cost
        int[][] pair = new int[n][2];
        for (int i = 0; i < n; i++) {
            pair[i][0] = nums[i];
            pair[i][1] = cost[i];
        }

        // Sort by nums
        Arrays.sort(pair, Comparator.comparingInt(a -> a[0]));

        long totalCost = 0;
        for (int c : cost) {
            totalCost += c;
        }

        // Find weighted median
        long currCost = 0;
        int target = 0;
        for (int i = 0; i < n; i++) {
            currCost += pair[i][1];
            if (currCost >= (totalCost + 1) / 2) {
                target = pair[i][0];
                break;
            }
        }

        // Calculate minimum cost
        long result = 0;
        for (int i = 0; i < n; i++) {
            result += (long) Math.abs(nums[i] - target) * cost[i];
        }

        return result;
    }
}
