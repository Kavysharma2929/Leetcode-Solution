class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            int value=s.charAt(i)-'a'+1;
            value=27-value;
            ans+=value*(i+1);
        }
        return ans;
    }
}