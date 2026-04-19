import java.util.Arrays;

class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) return 0;

        //  Sort hoga balloon by their end 
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        // Greedy approach
        int arrows = 1; // at least one arrow needed
        int end = points[0][1]; // end of the first balloon

        for (int i = 1; i < points.length; i++) {
            // If the current balloon starts after the last arrow's end,
            // we need a new arrow
            if (points[i][0] > end) {
                arrows++;
                end = points[i][1]; // update end to this balloon's end
            }// Otherwise, the current balloon overlaps with the previous one,
            // so the same arrow can burst it
        } return arrows;
    }
}