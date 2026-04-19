class Solution {
    public void sortColors(int[] nums) {
        int low = 0;          // pointer for 0s
        int mid = 0;          // pointer for 1s
        int high = nums.length - 1; // pointer for 2s

        while (mid <= high) {
            if (nums[mid] == 0) {
                // swap karne ke liye temp ka use hua hai
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++; // move forward
            } else { // nums[mid] == 2
                //swap hoga 2 ko high ke sath, taki 2s end me chala jaye
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}