class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        char[] ch=jewels.toCharArray();
        char[] ch1=stones.toCharArray();
        for(char i : ch){
            for(char j : ch1){
                if(i==j){
                    count++;
                }

            }
        }return count;
    }
}