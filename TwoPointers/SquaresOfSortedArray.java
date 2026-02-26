public class SquaresOfSortedArray {

    // T : O(n) 
    // S:O(n) --> Wrong , Because in space complexity we dont count the DS we are returning and hence its 
    // S: O(1) --> i.e Constant 
    public int[] sortedSquares(int[] nums) {

        int i = 0,
                j = nums.length - 1;

        int[] res = new int[nums.length];

        int k = nums.length - 1;

        while (i <= j) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                res[k] = nums[i] * nums[i];
                i++;
            } else {
                res[k] = nums[j] * nums[j];
                j--;
            }
            k--;
        }

        return res;

    }

}
