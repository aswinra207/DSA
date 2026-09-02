class Solution {
    public String getHint(String s, String g) {
        int bulls=0 , cows=0;
        int[] num = new int[10];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==g.charAt(i)) bulls++;
            else{
                if(num[s.charAt(i)-'0']++ < 0) cows++;
                if(num[g.charAt(i)-'0']-- >0) cows++;
            }
        } 
        return bulls+"A"+cows+"B";
    }
}