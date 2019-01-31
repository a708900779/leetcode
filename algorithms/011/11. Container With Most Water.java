package algorithms

class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        for (int i = 0;i < height.length - 1;i++) {
            for (int j = i + 1;j < height.length;j++) {
                int now = (j - i) * Math.min(height[i], height[j]);
                if (result < now) {
                    result = now;
                }
            }
        }
        return result;
    }
}
