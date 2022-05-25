class Solution {
    public int fib(int n) {
        int[] qb = new int[n+1];
        if (n == 0 || n == 1) {
            return n;
        }

        if (qb[n] != 0) {
            return qb[n];
        }

        int fibnm1 = fib(n - 1);
        int fibnm2 = fib(n - 2);
        int fibn = fibnm1 + fibnm2;

        qb[n] = fibn;
        return fibn;
    }
}