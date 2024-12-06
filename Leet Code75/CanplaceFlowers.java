public class CanplaceFlowers{
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0){
            return true;
        }
        int len = flowerbed.length;
        for(int i = 0;i<len && n>0; i++){
            boolean prev = i == 0 || flowerbed[i-1]==0;
            boolean next = i == len-1 || flowerbed[i+1]==0;
            if(flowerbed[i]==0 && prev && next){
                flowerbed[i] =1;
                n--;
            if(n == 0 ){
                return true;
            }
            }
        }
    return false;
    }
   

    public static void main(String[] args){
        String s = "LeetCOdE";

    }
}