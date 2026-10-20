class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] {i, map.get(diff)};
            }
            else {
                map.put(nums[i], i);
            }
            diff = target - nums[j];
            if (map.containsKey(diff)) {
                return new int[] {j, map.get(diff)};
            }
            else {
                map.put(nums[j], j);
            }
            i++;
            j--;
        }
        return new int[0]; 
    }
}