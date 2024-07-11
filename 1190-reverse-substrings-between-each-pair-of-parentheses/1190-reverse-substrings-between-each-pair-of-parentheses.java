class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        for(char c: s.toCharArray()){
            
            if(c==')'){
                StringBuffer temp=new StringBuffer();
                while(!st.isEmpty() && st.peek()!='('){
                    temp=temp.append(st.pop());
                }
                if(st.peek()=='('){
                    char gf=st.pop();
                }
                for (int i = 0; i < temp.length(); i++) {
                    st.push(temp.charAt(i));
                }
            }
            else{
                st.push(c);
            }
            if(st.isEmpty()){
                break;
            }
            
        }
        StringBuffer res=new StringBuffer();
        while(!st.isEmpty()){
            res=res.append(st.pop());
        }
        return res.reverse().toString();
    }
}