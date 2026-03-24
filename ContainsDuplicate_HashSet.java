
// ContainsDuplicate_HashSet.java
import java.util.HashSet;

public class ContainsDuplicate_HashSet {

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) { // for-each loop

            if (set.contains(num)) {
                return true; // duplicate found
            }

            set.add(num);
        }

        return false; // no duplicates
    }

    public static void main(String[] args) {
      
        int[] nums = { 1, 2, 3, 4, 1 };

        boolean result = containsDuplicate(nums);

        System.out.println("Contains Duplicate: " + result);
    }
}