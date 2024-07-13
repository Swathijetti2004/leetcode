class Solution {
    public String longestCommonPrefix(String[] s) {
        if(s.length==0){
            return "";
        }
        if(s.length==1){
            return s[0];
        }
        String prefix=s[0];
        for(int i=1;i<s.length;i++){
            while(s[i].indexOf(prefix)!=0){
                int n=prefix.length();
                prefix=prefix.substring(0,n-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}