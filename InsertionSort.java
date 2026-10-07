import java.util.Arrays;

public class InsertionSort {
    public static void main() {
        int[] nums = { 4, 2, 9, 8, 7, 6, 5, 1, 3 };

        for (int currentIndex = 1; currentIndex < nums.length; currentIndex++) {

            while (currentIndex > 0 && (nums[currentIndex] < nums[currentIndex - 1])) {
                int currentValue = nums[currentIndex];
                int leftValue = nums[currentIndex - 1];

                nums[currentIndex] = leftValue;
                nums[currentIndex - 1] = currentValue;

                currentIndex--;
            }
        }

        System.out.println(Arrays.toString(nums));

    }

}
