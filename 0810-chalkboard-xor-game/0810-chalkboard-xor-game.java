class Solution {
    public boolean xorGame(int[] nums) {
        int n=nums.length;
        int xor=0;
        for(int i=0;i<n;i++){
            xor^=nums[i];
        }
        if(xor==0 || n%2==0) return true;
        else return false;
    }
}