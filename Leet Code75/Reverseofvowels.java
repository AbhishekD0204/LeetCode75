public class Reverseofvowels{
       
    public String reverseVowels(String s) {
        char [] word = s.toCharArray();
        int i=0, j = s.length()-1;
        String vowels = "aeiouAEIOU";

        while (i<j){
            //traverse from left to right till the vowel is met 
            while( i<j && vowels.indexOf(word[i]) == -1 ){
                i++;
            }
            //traverse from right to left till the vowel is met
            while( i<j && vowels.indexOf(word[j]) == -1 ){
                j--;
            }

            char temp = word[i];
            word[i] = word[j] ;
            word[j] = temp;

            i++;
            j--;
        }

        String result = new String(word);
        return result; 
    }

    public static void main(String[] args){
        String s = "LeetCOdE";

    }
}