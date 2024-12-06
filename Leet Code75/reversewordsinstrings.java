public class reversewordsinstrings{
       
       public String reverseWords(String s) {
        // Storing the string without any of the Whitespaces as well as the null characters;
        String[] temp = s.trim().split("\\s+");
        
        // Cretaing a result String to display the reversed sentence;
        String reverse= "";

        for (int i = temp.length-1; i>0; i--){
            reverse += temp[i] + " ";
        }
        
        return reverse + temp[0];
    }

    public static void main(String[] args){
        String s = "LeetCOdE";

    }
}