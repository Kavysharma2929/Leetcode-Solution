class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int low=0;
        int high=0;
        for(int i=0;i<n;i++){
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }
        while(low<=high){
            int parts=1;
            int sum=0;
            int mid=(high+low)/2;
            for(int i=0;i<n;i++){
                if(sum+nums[i]>mid){
                    parts++;
                    sum=0;
                }
                sum+=nums[i];
            }
            if(parts<=k) high=mid-1;
            else low=mid+1;
        }
        return low;

    }
}