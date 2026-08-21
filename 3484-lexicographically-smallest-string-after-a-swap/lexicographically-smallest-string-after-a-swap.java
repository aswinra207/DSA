class Solution {
    public String getSmallestString(String s) {
        char[] ch = s.toCharArray();
        for(char i=1;i<ch.length;i++){
            if(ch[i]<ch[i-1]){
                if(ch[i]%2==0 && ch[i-1]%2==0 || ch[i]%2!=0 && ch[i-1]%2!=0){
                    char temp=ch[i-1];
                    ch[i-1]=ch[i];
                    ch[i]=temp;
                    break;
                }
            }
        }
        return String.valueOf(ch);      
    }
}