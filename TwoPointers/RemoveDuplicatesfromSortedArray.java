public class RemoveDuplicatesfromSortedArray {
    
    // Two Pointers In same direction One read s and another writes 
    
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;

        int i=0;

        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                 i++;  //Here Keep in mind forst to increase the i so that next elemt to i can be manupulated not i 
                nums[i]=nums[j];
               
            }
        }
         return i+1;
    }
}
