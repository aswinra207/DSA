class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length()!=words.length) return false;

        HashMap<Character,String> zip = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char curr_char=pattern.charAt(i);
            if(zip.containsKey(curr_char)){
                if(!zip.get(curr_char).equals(words[i])){
                    return false;
                }
            }
            else{
                if(zip.containsValue(words[i])){
                    return false;
                }
                zip.put(curr_char,words[i]);
            }
        } 
        return true;
        
    }
}