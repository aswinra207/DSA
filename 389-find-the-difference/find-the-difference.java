class Solution {
    public char findTheDifference(String s, String t) {
        char[] ch=s.toCharArray();
        char[] ch1=t.toCharArray();
        int sum=0;
        for(char i : ch){
            sum-=i;
        }

        for(char j : ch1){
                sum+=j;
        }

        return (char)sum;
        
    }
}