class Solution {
    public double myPow(double x, int n) {
        long N = n;                    // avoid overflow for Integer.MIN_VALUE
        double result = fastPow(x, Math.abs(N));
        return n < 0 ? 1.0 / result : result;
    }

    private double fastPow(double x, long n) {
        if (n == 0) return 1.0;
        double half = fastPow(x, n / 2);
        return (n % 2 == 0) ? half * half : half * half * x;
    }
}