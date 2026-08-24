class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int j=0;
        int sum=0;
        int minlen=n+1;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            while(sum>=target){
                int len=i-j+1;
                if(len<minlen) minlen=len;
                sum-=nums[j];
                j++;
            }
        }
        if(minlen==n+1) return 0;
        else return minlen;
    }
}