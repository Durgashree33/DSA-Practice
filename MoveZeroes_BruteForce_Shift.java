
public class MoveZeroes_BruteForce_Shift {

    public static void moveZeroes(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (nums[i] == 0) {

                // Shift elements left
                for (int j = i; j < n - 1; j++) {
                    nums[j] = nums[j + 1];
                }

                nums[n - 1] = 0; // Put zero at end
                i--;
                n--;
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