class Solution {
    public int countStaircase(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
            for (int j = i; j < n; j++) {
                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
                boolean valid = true;
                int expected = 1;
                for (int freq : map.values()) {
                    if (freq != expected) {
                        valid = false;
                        break;
                    }
                    expected++;
                }
                if (valid) {
                    count++;
                }
            }
        }
        return count;
    }
}