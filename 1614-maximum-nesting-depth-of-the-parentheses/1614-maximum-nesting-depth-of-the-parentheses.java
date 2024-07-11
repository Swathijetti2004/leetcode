class Solution {
    public int maxDepth(String s) {
        int count=0;
        int max=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                count=count+1;
                
            }else if(c==')'){
                count--;
            }else{
                continue;
            }
            if(max<count){
                    max=count;
                }
        }
        return max;
        
       
    }
}