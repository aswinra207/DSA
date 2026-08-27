class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int max=0;
        HashSet <Character> res = new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(res.contains(s.charAt(i))){
                res.remove(s.charAt(left));
                left++;
            }
            res.add(s.charAt(i));
            max=Math.max(max,res.size());

        }
        return max;
    }
}