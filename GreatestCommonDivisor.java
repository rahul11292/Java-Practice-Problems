public class GreatestCommonDivisor {

    /**
     * Calculate greatest common divisor of two numbers using recursion.
     */
    public static long gcdUsingRecursion(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        return a == 0 ? b : gcdUsingRecursion(b%a, a);
    }

    public static final long gcdUsingEuclides(long x, long y) {
        long greater = x;
        long smaller = y;
        if (y > x) {
            greater = y;
            smaller = x;
        }

        long result = 0;
        while (true) {
            if (smaller == greater) {
                result = smaller; // smaller == greater
                break;
            }

            greater -= smaller;
            if (smaller > greater) {
                long temp = smaller;
                smaller = greater;
                greater = temp;
            }
        }
        return result;
    }
}
