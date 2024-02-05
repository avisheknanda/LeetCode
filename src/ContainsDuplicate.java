import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        boolean containsDuplicate = false;
        Set<Integer> integerSet = new HashSet<>();

        for (int number : nums) {
            if (integerSet.contains(number)) {
                containsDuplicate = true;
            }
            integerSet.add(number);
        }
        return containsDuplicate;
    }
}
