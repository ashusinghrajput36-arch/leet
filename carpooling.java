class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] stops = new int[1001];
        for (int[] trip : trips) {
            stops[trip[1]] += trip[0];
            stops[trip[2]] -= trip[0];
        }
        
        int currentPassengers = 0;
        for (int change : stops) {
            currentPassengers += change;
            if (currentPassengers > capacity) {
                return false;
            }
        }
        return true;
    }
}
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Map to store the next greater element for each number in nums2
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        // Traverse through nums2 to find the next greater elements
        for (int num : nums2) {
            // While stack is not empty and the current number is greater than the top of the stack
            while (!stack.isEmpty() && num > stack.peek()) {
                nextGreaterMap.put(stack.pop(), num);
            }
            // Push the current number onto the stack
            stack.push(num);
        }
        
        // Build the result for nums1 using the map
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            // If the element is not in the map, it means there is no greater element, so default to -1
            result[i] = nextGreaterMap.getOrDefault(nums1[i], -1);
        }
        
        return result;
    }
}
