
import java.util.HashMap;

public class ContainsDuplicate_HashMap {

    public static boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                return true; // duplicate found
            }

            map.put(nums[i], i); // store number and its index
        }

        return false; // no duplicates
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 1 };
        System.out.println("Contains Duplicate: " + containsDuplicate(nums));
    }
}
