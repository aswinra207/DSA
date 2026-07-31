class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque <Integer> dq = new ArrayDeque<Integer>();
        int index=0;
        int l=0,r=0;
        int[] res = new int[nums.length - k + 1];
        while(r<nums.length){
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[r]){
                dq.pollLast();
            }
            dq.offerLast(r);
            if(l>dq.peekFirst()){
                dq.pollFirst();
            }
            if(r>=k-1){
                res[index++]=nums[dq.peekFirst()];
                l++;
            }
            r++;
        }
        return res;
        
    }
}