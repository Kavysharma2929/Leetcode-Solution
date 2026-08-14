class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int max = 0;
        int[] first=new int[2*n+1];
        Arrays.fill(first,-2);
        first[n]=-1;
        int sum=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) sum--;
            else sum++;
            if(first[sum+n]!=-2) max=Math.max(max,i-first[sum+n]);
            else first[sum+n]=i;
        }
        return max;
    }
}