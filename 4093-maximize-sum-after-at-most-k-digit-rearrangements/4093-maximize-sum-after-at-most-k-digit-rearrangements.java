import java.util.*;
class Solution {
    public long maximizeSum(int[] nums, int k) {
        long totalSum = 0;
        List<Long> gains = new ArrayList<>();
        for (int num : nums) {
            totalSum += num;
            char[] digits = String.valueOf(num).toCharArray();
            Arrays.sort(digits);
            StringBuilder sb = new StringBuilder(new String(digits));
            long maxNum = Long.parseLong(sb.reverse().toString());
            long gain = maxNum - num;
            if (gain > 0) {
                gains.add(gain);
            }
        }
        Collections.sort(gains, Collections.reverseOrder());
        int operations = Math.min(k, gains.size());
        for (int i = 0; i < operations; i++) {
            totalSum += gains.get(i);
        }
        return totalSum;
    }
}