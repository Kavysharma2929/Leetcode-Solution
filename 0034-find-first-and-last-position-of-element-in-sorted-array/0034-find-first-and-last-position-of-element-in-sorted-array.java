class Solution {
    public int lowerBound(int arr[],int t ,int n){
        int s=0;
        int e=n-1 , m=0 , f=-1;
        while(s<=e){
            m=s+(e-s)/2;
            if(t==arr[m]){
                f=m;
                e=m-1;
            }
            else if(t< arr[m]){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return f;
    }
     public int upperBound(int arr[],int t ,int n){
        int s=0;
        int e=n-1 , m=0 , f=-1;
        while(s<=e){
            m=s+(e-s)/2;
            if(t==arr[m]){
                f=m;
                s=m+1;
            }
            else if(t< arr[m]){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return f;
    }
 
    public int[] searchRange(int[] nums, int t) {
        int n=nums.length;
        int ans[]=new int[2];
        ans[0]=lowerBound(nums, t,n);
        ans[1]=upperBound(nums, t,n);
        return ans;
    }
  
}