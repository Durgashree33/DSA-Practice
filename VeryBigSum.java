// VeryBigSum.java
public class VeryBigSum {

    public static long aVeryBigSum(long[] nums) {

        long sum = 0;

        for (long num : nums) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {

        long[] nums = { 1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L };

        System.out.println("Sum: " + aVeryBigSum(nums));
    }
}