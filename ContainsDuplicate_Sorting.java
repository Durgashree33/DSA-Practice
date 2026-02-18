
import java.util.Arrays;

public class ContainsDuplicate_Sorting {

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true; // duplicate found
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1};
        System.out.println("Contains Duplicate: " + containsDuplicate(nums));
    }
}
