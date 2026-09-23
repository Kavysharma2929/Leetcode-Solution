class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int total=0;
        for(int i=0;i<n;i++){total+=nums[i];}
        int target=total-x;
        if(target<0)return -1;
        int sum=0,left=0,max=-1;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            while(sum>target && left<=i){
                sum-=nums[left];
                left++;
            }
            if(sum==target) max=Math.max(max,i-left+1);
        }
        if(max==-1) return -1;
        return n-max;
    }
}