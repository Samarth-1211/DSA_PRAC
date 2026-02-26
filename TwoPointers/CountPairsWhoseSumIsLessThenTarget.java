
import java.util.List;

public class CountPairsWhoseSumIsLessThenTarget {
    
    public int counter(List<Integer> nums , int target){

        // T : O(nlogn) ,
        // S : O(logn) --> The space required for sorting in java is log n
        int i=0,j=nums.size()-1;
        int count = 0;

        while(i<j){
            int sum = nums.get(i) + nums.get(j);
            if(sum<target){
                count = count+j-i;
                i++;
            }else{
                j--;
            }
        }
        return count;    
    }
}
