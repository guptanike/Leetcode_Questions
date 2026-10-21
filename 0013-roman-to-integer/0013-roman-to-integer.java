class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            int curr = value(s.charAt(i));
            if (i < length - 1 && curr < value(s.charAt(i + 1))) {
                sum -= curr;
            }
            else {
                sum += curr;
            }
        }
        return sum;
    }
    public static int value(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}