class Solution {
    public int jump(int[] nums) {
        int steps = 0;
        int i = 0;
        while (i < nums.length - 1) {
            if (i + nums[i] >= nums.length - 1) {
                steps++;
                break;
            }
            int next = i;
            int max = 0;
            for (int j = i + 1; j <= i + nums[i] && j < nums.length; j++) {
                if (j + nums[j] > max) {
                    max = j + nums[j];
                    next = j;
                }
            }
            i = next;
            steps++;
        }
        return steps;
    }
}