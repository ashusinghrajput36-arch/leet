class NumArray {
    // This is our diary of running totals
    private int[] prefixSum;

    public NumArray(int[] nums) {
        // yaha pe ek se large hoga taki array 0 index se start ho sake
        prefixSum = new int[nums.length + 1];
        prefixSum[0] = 0;

        //  total = pahle ka + abhi ka
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        //Total at the end MINUS Total from before we started counting!
        return prefixSum[right + 1] - prefixSum[left];
    }
}