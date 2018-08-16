/**
 * Given an array of integers, we want to find the largest sum of contiguous
 * subarray.
*/
public class LargestSumContiguousSubarray {

    private LargestSumContiguousSubarray() { }
    public static int getLargestSumContiguousSubarray(int[] A) {
        if (A == null)
            throw new NullPointerException("The given array is null");

        int max_so_far = A[0];
        int max_ending_here = A[0];
        for (int i = 1; i < A.length; i++) {
            max_ending_here = Math.max(A[i], max_ending_here + A[i]);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }

}
