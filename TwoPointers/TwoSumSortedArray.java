public class TwoSumSortedArray {

    //Brute-Force
        public int[] twoSum(int[] nums, int target) {
            int left = 0;
            int[] numbers = new int[2];
    
            while(left<nums.length){
                for(int right=left+1;right<nums.length;right++){
                    if(nums[left]+nums[right]==target){
                        numbers[0] = left;
                        numbers[1]= right;
                    }
                }
              left++;
            }
    
            return numbers;
        }
    }
