class Solution {
    public void wiggleSort(int[] nums) {
        int n=nums.length;
        int[] temp=nums.clone();
        Arrays.sort(temp);
        int j=n-1;
        for(int i=1;i<n;i+=2){
            nums[i]=temp[j--];
        }for(int i=0;i<n;i+=2){
            nums[i]=temp[j--];
        }
    }
}