class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length()==0){
            return t.charAt(0);
        }
        char[] ch=s.toCharArray();
        char[] ch1=t.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        int i=0;
        int j=0;

        while(i<ch.length && j<ch1.length){
            if (ch[i]==ch1[j]){
                i++;
                j++;
            }else
            {
            return ch1[j];
            }
        }
        return ch1[ch1.length - 1];

    }
}