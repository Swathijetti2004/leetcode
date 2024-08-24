class Solution {
    public int findComplement(int num) {
        StringBuffer s=new StringBuffer();
        int temp=num;
        while(temp>0){
            s.append(temp%2);
            temp=temp/2;
        }
        s.reverse();
        int pos=0;
        String possible=s.toString();
        for(char c:possible.toCharArray()){
            if(c=='1'){
                break;
            }
            pos++;
        }
        for(int i=pos;i<s.length();i++){
            if(s.charAt(i)=='0'){
                s.setCharAt(i,'1');
            }else{
                s.setCharAt(i,'0');
            }
        }
            
        String str=s.toString();
        int power=0;
        int sum=0;
        for(int i=str.length()-1;i>=pos;i--){
            sum+=Math.pow(2,power)*Integer.parseInt(Character.toString(str.charAt(i)));
            power++;
        }
        return sum;
    }
}