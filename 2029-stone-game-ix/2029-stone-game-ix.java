class Solution {
    public boolean stoneGameIX(int[] stones) {
        int a=0,b=0,c=0;
        int n=stones.length;
        for(int i=0;i<n;i++){
            if(stones[i]%3==0) a++;
            else if(stones[i]%3==1) b++;
            else c++;
        }
        if(a%2==0) return b>0 && c>0;
        if(b>c) return b-c>2;
        else return c-b>2;
    }
}