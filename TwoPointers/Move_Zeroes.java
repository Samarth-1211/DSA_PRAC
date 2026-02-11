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


    // STEPS 
    
}
