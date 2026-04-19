class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0]; 
        // first element same hoga

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
             // current number ko previous me sum hoga
        }

        return result;
    }
}