public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        // Initialize two pointers: one for iterating through the array, and another for placing non-zero elements.
        int nonZeroPointer = 0;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is non-zero, move it to the position pointed by nonZeroPointer
            if (nums[i] != 0) {
                int temp = nums[nonZeroPointer];
                nums[nonZeroPointer] = nums[i];
                nums[i] = temp;
                nonZeroPointer++;
            }
        }
    }
}
