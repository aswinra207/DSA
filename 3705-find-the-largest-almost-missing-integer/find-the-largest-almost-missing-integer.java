class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
         if (k == n) {
            int max = -1;
            for (int num : nums) {
                max = Math.max(max, num);
            }
            return max;
        }
        if (k == 1) {
            int maxUnique = -1;
            for (int num : nums) {
                if (freq.get(num) == 1) {
                    maxUnique = Math.max(maxUnique, num);
                }
            }
            return maxUnique;
        }
       int ans = -1;
        if (freq.get(nums[0]) == 1) {
            ans = Math.max(ans, nums[0]);
        }
        if (freq.get(nums[n - 1]) == 1) {
            ans = Math.max(ans, nums[n - 1]);
        }
        return ans;
    }
}