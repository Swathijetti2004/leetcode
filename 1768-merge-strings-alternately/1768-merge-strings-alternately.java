class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuffer s=new StringBuffer("");
        int n1=word1.length();
        int n2=word2.length();
        if(n1<=n2){
            for(int i=0;i<n1;i++){
                s.append(word1.charAt(i));
                s.append(word2.charAt(i));
            }
            s.append(word2.substring(n1));
        }else{
            for(int i=0;i<n2;i++){
                s.append(word1.charAt(i));
                s.append(word2.charAt(i));
            }
            s.append(word1.substring(n2));
        }
        return s.toString();
    }
}