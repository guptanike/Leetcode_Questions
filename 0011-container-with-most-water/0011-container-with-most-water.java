class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, h * (right - left));
            while (left < right && h >= height[left]) {
                left++;
            }
            while (left < right && h >= height[right]) {
                right--;
            }
        }
        return maxArea;
    }
}