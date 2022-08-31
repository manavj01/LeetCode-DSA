class Solution {
    public int mySqrt(int number) {
        double low = 1;
        double high = number;
        double eps = 1e-6;

        while ((high - low) > eps) {
            double mid = (low + high) / 2.0;
            if (multiply(mid, 2) < number) {
                low = mid;
            } else high = mid;
        }

        return (int) high;
    }
     public static double multiply(double number, int n) {
        double ans = 1.0;
        for (int i = 1; i <= n; i++) {
            ans *= number;
        }
        return ans;
    }
}