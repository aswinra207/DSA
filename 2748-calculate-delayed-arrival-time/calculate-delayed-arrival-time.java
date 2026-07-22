class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int n = arrivalTime+delayedTime;
        
        if(n<24){
            return n;
        }return n%24;
    }
}