
public class ArithmeticProgression {

    public static final long sequenceTotalUsingLoop(int startNumber, int numberOfNumbersToCompute) {
        int start = startNumber;
        int length = numberOfNumbersToCompute;
        long result = 0L;
        while (length > 0) {
            result += start++;
            length--;
        }
        return result;
    }

    public static final long sequenceTotalUsingTriangularNumbers(int startNumber, int numberOfNumbersToCompute) {
        // n*(n+1)/2
        final int start = startNumber;
        final int length = numberOfNumbersToCompute;

        long result = length * (length + 1) / 2;
        result += (start - 1) * length;
        return result;
    }
}
