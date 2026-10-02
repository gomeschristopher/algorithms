import java.util.Arrays;
import java.util.stream.IntStream;

class BinarySearch {
    public void main() {
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 9;

        int[] numsIndexes = IntStream.range(0, nums.length).toArray();
        
        int indexMiddle = 3;

       // while(indexMiddle != target) {
            if(nums[indexMiddle] < target) {
                numsIndexes = Arrays.copyOfRange(numsIndexes, indexMiddle, numsIndexes.length);
                
            } else if (nums[indexMiddle] > target) {
                numsIndexes = Arrays.copyOfRange(numsIndexes, 0, indexMiddle);
            }

            indexMiddle = (int) Math.ceil(numsIndexes.length / 2);  

            System.out.println(Arrays.toString(numsIndexes));

            //System.out.println(Arrays.toString(numsIndexes));
            System.out.println(indexMiddle);
            System.out.println(numsIndexes[indexMiddle]);

        //}
    }
}
