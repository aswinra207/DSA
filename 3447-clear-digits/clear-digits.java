class Solution {
    public String clearDigits(String s) {
        StringBuilder res = new StringBuilder();
        char[] ch = s.toCharArray();
        for(char i : ch){
            if(Character.isDigit(i)){
                if (res.length() > 0) {
                    res.deleteCharAt(res.length()-1);
                }
            }else{
                res.append(i);
            }
        }
        return res.toString();
    }
}