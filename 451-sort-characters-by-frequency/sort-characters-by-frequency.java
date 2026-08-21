class Solution {
    public String frequencySort(String s) {
    HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
    for(char ch : s.toCharArray()){
    hm.put(ch,hm.getOrDefault(ch,0)+1);
    } 
    ArrayList<Map.Entry<Character,Integer>> list = new ArrayList<>(hm.entrySet());
    list.sort(
    Map.Entry.<Character,Integer>comparingByValue().reversed()
    );
    
    StringBuilder res = new StringBuilder();
    for(Map.Entry<Character, Integer> ch:list) {
			char c=ch.getKey();
			int v=ch.getValue();
			for(int i=1;i<=v;i++) {
				res.append(c);
			}
    }
	return res.toString();
  }
}
    