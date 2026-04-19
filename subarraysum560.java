import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        // Map to store cumulative sum frequencies
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case: sum = 0 occurs once

        int count = 0;
        int sum = 0;

        for (int num : nums) {
            sum += num; // running cumulative sum

            // If (sum - k) hoga toh matlb subarray end hoga sum=k se,
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            // freq. update karega current sum ka
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }return count;
    }
}