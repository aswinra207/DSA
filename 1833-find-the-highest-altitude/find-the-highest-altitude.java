class Solution {
    public int largestAltitude(int[] gain) {
        int[] sum=new int[gain.length+1];
        sum[0]=0;
        for(int i=0;i<gain.length;i++){
            sum[i+1]+=sum[i]+gain[i];
            
        }
        int max=sum[0];
        for(int j=1;j<sum.length;j++){
            if(sum[j]>max){
                max=sum[j];
            }        
        }
        return max;
    }
}