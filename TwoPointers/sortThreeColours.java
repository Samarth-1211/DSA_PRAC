public class sortThreeColours {

    public static void main(String[] args) {
        int[] nums = {
            2,0,2,1,1,0,2,1,1,0,2,2
        //  0,0,0,1,1,1,1,2,2,2,2,2
        //        i             
        //              j
        //                k
        };

        System.out.println("Before------------");

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        sortColours(nums);

        System.out.println("After------------");

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }

    }
    // Solution -------------------------

    public static void sortColours(int[] nums){
        int i=0,j=nums.length-1,k=0;

        while(k<=j){
            if(nums[k]==1){
                k++;
            }else if(nums[k]==2){
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                j--;
           }else{
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                i++;
                k++;

            }
        }
    }
}
