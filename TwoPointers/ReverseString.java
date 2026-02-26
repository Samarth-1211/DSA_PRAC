public class ReverseString {
    
    public void Reverse(char[] s){
        int i=0,
        j=s.length-1;

        while(i<j){
             char temp = s[i];
             s[i] = s[j];
             s[j] = temp;

             i++;
             j--; 
        }
    }
}
