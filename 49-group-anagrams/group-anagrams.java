class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        Map <String,List<String>> res = new HashMap<>();

        for (String i : s){
            char[] chars = i.toCharArray();
            Arrays.sort(chars);
            String fe = new String(chars);

            if (!res.containsKey(fe)) {
                res.put(fe, new ArrayList<>());
            }
            res.get(fe).add(i);
        }
        return new ArrayList<>(res.values());
        
    }
}