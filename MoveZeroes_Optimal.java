// MoveZeroes_Optimal.java
public class MoveZeroes_Optimal {

    public static void moveZeroes(int[] nums) {

        int j = 0; // position for next non-zero

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                // Swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = { 0, 1, 0, 3, 12 };

        moveZeroes(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}