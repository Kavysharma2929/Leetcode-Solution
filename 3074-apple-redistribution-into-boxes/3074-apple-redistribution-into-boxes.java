class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
       Arrays.sort(capacity);
       int sum=0;
       for(int i=0;i<apple.length;i++){
        sum+=apple[i];
       } 
       int count=0;
       for(int j=capacity.length-1;j>=0;j--){
        sum-=capacity[j];
            count++;
        if(sum<=0) break;
       }
       return count;
    }
}