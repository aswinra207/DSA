class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int max=0;
        HashSet<Character> res=new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(res.contains(s.charAt(right))){
                res.remove(s.charAt(left));
                left++;
            }
            res.add(s.charAt(right));
            max=Math.max(max,res.size());
        }
        return max;
    }
}