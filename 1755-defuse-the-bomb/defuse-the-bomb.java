class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] arr = new int[code.length];
        int sum=0,count=0;
        int n =code.length;
        if(k==0) Arrays.fill(arr,0);
        else if(k>0){
            for(int i=0;i<n;i++){
                int j=i+1;
                while(count!=k){
                    if(j==n){
                        j=0;
                    }
                    sum+=code[j];
                    count++;
                    j++;
                }
                arr[i]=sum;
                sum=0;
                count=0;
            }
        }else{
            k=k*-1;
            for(int i=0;i<n;i++){
                int j=i-1;
                if(i==0){
                    j=n-1;
                }
                while(count!=k){
                    if(j<0){
                        j=n-1;
                    }
                    sum+=code[j];
                    count++;
                    j--;
                }
                arr[i]=sum;
                sum=0;
                count=0;
            }
        }
        return arr;
    }
}