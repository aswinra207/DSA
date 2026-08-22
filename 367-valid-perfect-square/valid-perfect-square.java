class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2) return true;
        for(int i=2;i<num;i++){
            if(i*i==num){
                return true;
            }
            if(i*i>num){
                break;
            }
        }
        return false;
    }
}