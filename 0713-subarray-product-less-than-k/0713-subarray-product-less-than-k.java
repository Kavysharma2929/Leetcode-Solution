class Solution{
    public int numSubarrayProductLessThanK(int[] nums,int k){
        int n=nums.length;
        if(k<=1)return 0;
        int count=0,product=1,l=0;
        for(int i=0;i<n;i++){
            product*=nums[i];
            while(product>=k){
                product/=nums[l];
                l++;
            }
            count+=i-l+1;
        }
        return count;
    }
}