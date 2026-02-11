public class Move_Zeroes {

    //Brute Force 

    public void moveZeroes(int[] nums) {
        //Use Two Pointers in Same Direction
        int i=0;


        for(int j=1 ; j<nums.length;j++){
            if(nums[j]!=0 && nums[i]==0){
                int temp;
                temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
        }
        
    }

    //Optimal Approach 


    class Solution {
        public void moveZeroes(int[] nums) {
    
            int i = 0;  // position to place next non-zero
    
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != 0) {
                    // swap nums[i] and nums[j]
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
    
                    i++;
                }
            }
        }
    }
        
}
