class Solution {
    public String firstPalindrome(String[] words) {
        for(String s: words){
            if(isPallindrome(s)){
                return s;
            }
        }
        return "";
    }
    public static boolean isPallindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    } 
}