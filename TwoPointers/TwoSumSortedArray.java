import java.util.HashMap;

public class TwoSumSortedArray {

    // Brute-Force
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int[] numbers = new int[2];

        while (left < nums.length) {
            for (int right = left + 1; right < nums.length; right++) {
                if (nums[left] + nums[right] == target) {
                    numbers[0] = left;
                    numbers[1] = right;
                }
            }
            left++;
        }

        return numbers;
    }

    // If the problem says:
    // “Find pair”
    // “Sum equals target”
    // “Return indices”
    // 👉 Think HashMap immediately

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            // Deciding which collection to choose--> Hashmap
            // traverse the array once to see the numbers
            // calculate the required number to reach to the target
            // check wether it exist on the map or not
            // if yes return , new array with indices
            // if not add that to the map
            // if nothing found return empty array

            HashMap<Integer, Integer> map = new HashMap();

            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];

                if (map.containsKey(complement)) {
                    // in return statement declaration is not allowed
                    // return int[] arr={complement,nums[i]};
                    return new int[] { map.get(complement), i };
                }
                map.put(nums[i], i);
            }

            return new int[] {};

        }
    }
}
