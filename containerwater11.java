class Solution {
    public int maxArea(int[] height) {
        int left = 0;                  // pointer at the start
        int right = height.length - 1; // pointer at the end
        int maxArea = 0;

        while (left < right) {
            //  area leftaur right lines ke beech
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;

            // Update hoga agar area abhi tak ke max se bada hai
            maxArea = Math.max(maxArea, area);

            // Move the pointer at the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}