class Solution {
    public int bitwiseComplement(int n) {
        // if(n==1){
        //     return 0;
        // }
        String s=Integer.toBinaryString(n);
        StringBuffer str=new StringBuffer(s);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){
                str.setCharAt(i,'1');
            }else{;
                str.setCharAt(i,'0');
            }
        }
        return Integer.parseInt(str.toString(),2);
    }
}