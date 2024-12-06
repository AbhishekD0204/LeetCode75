public class ProductofArrayExceptSelf{
       
       public int[] productExceptSelf(int[] nums) {
    
        int prefix[] = new int[nums.length]; 
        int suffix[] = new int[nums.length];
        int result[] = new int[nums.length];
        prefix[0] =1; 
        suffix[nums.length-1] = 1;
        // Calculate the prefix array;
        for (int i =1 ; i < nums.length; i++){
            prefix[i] = prefix[i-1]*nums[i-1];
        }
        // Calculate the Suffix array;
        for (int i =nums.length-2 ; i>=0; i--){
            suffix[i] = suffix[i+1]*nums[i+1];
        }    

        // Calculate the Output  array;
        for (int i =0 ; i < nums.length; i++){
            result[i] = prefix[i]*suffix[i];
        }

    return result;            
    }

    public static void main(String[] args){
        String s = "LeetCOdE";

    }
}