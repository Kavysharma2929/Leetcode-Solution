class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n=arr.length;
        int left=0;
        int right=n-k;
        while(left<right){
            int mid=(left+right)/2;
            int a=x-arr[mid];
            int b=arr[mid+k]-x;
            if(a<=b){
                right=mid;
            }else left=mid+1;
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=left;i<left+k;i++){
            ans.add(arr[i]);
        }
        return ans;
    }
}