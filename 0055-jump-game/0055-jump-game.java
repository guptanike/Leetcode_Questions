class Solution {
    public boolean canJump(int[] nums) {
        int maxreach = 0;
        for (int I = 0; I < nums.length; I++) {
            if (I > maxreach) {
                return false;
            }
            maxreach = Math.max(maxreach, I + nums[I]);
        }
        return true;
    }
}