class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int low=1;
        int high=0;
        for(int i=0;i<n;i++){
            if(piles[i]>high) high=piles[i];
        }
        int ans=high;
        while(low<=high){
            int k=low+(high-low)/2;
            long hours=0;
            for(int i=0;i<n;i++){
                hours+=(piles[i]+(long)k-1)/k;
            }
            if(hours<=h){
                ans=k;
                high=k-1;
            }else{
                low=k+1;
            }
        }
        
        return ans;
    }
}
