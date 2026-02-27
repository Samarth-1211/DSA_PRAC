public class SortTwoColours {

    // This exaplme builds the foundation for Sort Three Colours 

    // T : O(n) S :(1)
    public static void sortTwoColours(int[] nums){
        int i=0,j=nums.length-1;

        while(i<j){
            if(nums[i]==0){
                i++;
            }else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {
            0,1,1,1,0,0,1,1
        };
        System.out.println("--------Before---------");
            for(int i=0;i<nums.length;i++){
                System.out.println(nums[i]);
            }
        sortTwoColours(nums);
        System.out.println("--------After---------");
            for(int i=0;i<nums.length;i++){
                System.out.println(nums[i]);
            }
        
    }
}
