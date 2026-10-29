class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String []strs = s.split("\\s+");
        return strs[strs.length - 1].length();
    }
}