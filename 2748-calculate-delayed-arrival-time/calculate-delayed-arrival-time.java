class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int sum = arrivalTime+delayedTime;
      
        if(sum==24){
            return 0;
        }return sum%24;
        
    }
}