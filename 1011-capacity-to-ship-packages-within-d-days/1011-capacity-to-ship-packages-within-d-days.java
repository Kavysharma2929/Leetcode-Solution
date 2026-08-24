class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int n=weights.length;
        int low=weights[0];
        int high=0;
        for(int i=1;i<n;i++){
            low=Math.max(low,weights[i]);
        }
        for(int i=0;i<n;i++){
            high+=weights[i];
        }
        while(low<=high){
            int day=1;
            int sum=0;
            int mid=(high+low)/2;
            for(int i=0;i<n;i++){
                if(sum+weights[i]>mid){
                    day++;
                    sum=0;
                }
                sum+=weights[i];
            }
            if(day<=days) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}