class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int prev1=0;
        int prev2=0;
        for(int i=0;i<n;i++){
            int pick=nums[i]+prev2;
            int notpick=prev1;
            int curr=Math.max(pick,notpick);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}