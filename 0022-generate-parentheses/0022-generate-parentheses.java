class Solution{
    public List<String> generateParenthesis(int n){
        List<String> ans=new ArrayList<>();
        Queue<String> q=new LinkedList<>();
        q.add("");
        while(!q.isEmpty()){
            String s=q.poll();
            int open=0,close=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='(') open++;
                else close++;
            }
            if(s.length()==2*n){
                ans.add(s);
                continue;
            }
            if(open<n) q.add(s+"(");
            if(close<open) q.add(s+")");
        }
        return ans;
    }
}