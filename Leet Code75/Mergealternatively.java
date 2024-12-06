public class Mergealternatively{
       
public String mergeAlternately(String word1, String word2) {
        int i = 0;
        StringBuilder result = new StringBuilder();
        int l1=word1.length(), l2=word2.length();
        while(i<l1 || i<l2 ){
            if(i < l1){
                result.append(word1.charAt(i));
            }
            if(i < l2){
                result.append(word2.charAt(i));
            }
            i++;
        }
    return result.toString();
    }

    public static void main(String[] args){
        String s = "LeetCOdE";

    }
}