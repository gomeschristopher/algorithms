class BinarySearch {
    public void main() {
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 5;

        int leftIndex = 0;
        int rightIndex = nums.length - 1;

        while(leftIndex <= rightIndex) {
            int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;
            
            if(nums[middleIndex] == target) {
                System.out.println(middleIndex);
            }

            if(nums[middleIndex] < target) {
                leftIndex = middleIndex + 1;
            } else {
                rightIndex = middleIndex - 1;
            }
        }
    }
}
