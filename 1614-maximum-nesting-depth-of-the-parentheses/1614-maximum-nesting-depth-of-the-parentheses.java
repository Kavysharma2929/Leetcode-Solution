class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int count=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                count++;
                if(count>ans) ans=count;
            }
            else if(s.charAt(i)==')'){
                count--;
            }
        }
        return ans;
    }
}