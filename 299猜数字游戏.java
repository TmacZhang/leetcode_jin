class Solution {
    public String getHint(String secret, String guess) {
        if(secret.length() == 0){
            return "0A0B";
        }
        int []num = new int[256];
        int numA =0 ;
        int numB =0 ;
        for(int i =0 ;i < secret.length(); i++){
            if(secret.charAt(i) == guess.charAt(i)){
                numA++;
            }else{
                num[secret.charAt(i)]++;
            }
        }
        
        for(int i =0 ;i < secret.length(); i++ ){
            if((secret.charAt(i) != guess.charAt(i)) && (num[guess.charAt(i)] > 0 ) ){
                numB++;
                num[guess.charAt(i)]--;
            }
        }
        return numA+"A" +numB+"B";
    }

}