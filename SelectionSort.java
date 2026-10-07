import java.util.Arrays;

public class SelectionSort {
    public static void main() {
        int[] nums = {4, 2, 9, 8, 7, 6, 5, 1, 3};

        for(int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            int minIndex = currentIndex;

            for(int x = currentIndex; x < nums.length; x++) {
                if(nums[x] < nums[minIndex]) {
                    minIndex = x;
                }
            }

            int a = nums[currentIndex];
            int b = nums[minIndex];
            nums[minIndex] = a;
            nums[currentIndex] = b;
        }

        System.out.println(Arrays.toString(nums));
    }    
}
