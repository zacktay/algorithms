public class TrappingRainWater {

    public int maxArea(int[] height) {
        int maxHeight = 0;

        int start = 0;
        int end = height.length - 1;

        // Decrease left and right while finding the largest area in between
        while (start < end) {
            int startHeight = height[start];
            int endHeight = height[end];
            // Use index with the lower height
            int currentLowestHeight = Math.min(startHeight, endHeight);
            // Keep largest area
            maxHeight = Math.max(maxHeight, currentLowestHeight * (end - start));

            // Keep the index with the higher height
            if (startHeight < endHeight) {
                start++;
            } else {
                end--;
            }
        }

        return maxHeight;
    }

}
