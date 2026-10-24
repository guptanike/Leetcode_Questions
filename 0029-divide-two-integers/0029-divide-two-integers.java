class Solution {
    public int divide(int dividend, int divisor) 
    {
        // Handle Overflow edge case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        // Determine the sign of the result
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        // Convert to long to prevent overflow with Integer.MIN_VALUE
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        int quotient = 0;
        // Subtract the largest possible shifted divisor
        while (dvd >= dvs) {
            long tempDivisor = dvs;
            long multiple = 1;
            // Double the divisor and the multiple as long as it fits into the dividend
            while (dvd >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }
            // Subtract and add to quotient
            dvd -= tempDivisor;
            quotient += multiple;
        }
        // Apply sign and return
        return isNegative ? -quotient : quotient;
    }
}