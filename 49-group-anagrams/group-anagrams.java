class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>ans=new HashMap<>();
        for (String s : strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String ne=new String(ch);

            if(!ans.containsKey(ne)){
                ans.put(ne,new ArrayList<>());
            }
            ans.get(ne).add(s);
            
        }
        return new ArrayList<>(ans.values());
    }
}