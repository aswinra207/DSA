class Solution {
    public int[] diStringMatch(String s) {
        int n =  s.length();
        int[] perm = new int[n+1];
        int l=0,h=n;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='I'){
                perm[i]=l;
                l++;
            }else{
                perm[i]=h;
                h--;
                
            }
        }
        perm[n]=h;
        return perm;
        
    }
}