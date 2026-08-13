class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            if(k>0 &&nums[i]<0){
                nums[i]=-nums[i];
                k--;
            }
            sum+=nums[i];
        }
        if(k%2==1){
            Arrays.sort(nums);
            nums[0]=-nums[0];
        }
        sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        return sum;
    }
}