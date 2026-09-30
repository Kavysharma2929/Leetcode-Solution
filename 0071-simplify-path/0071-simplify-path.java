class Solution {
    public String simplifyPath(String path) {
        int n=path.length();
        Stack<String> st=new Stack<>();
        String[] arr=path.split("/");
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("") || arr[i].equals(".")) continue;
            if(arr[i].equals("..")){
                if(!st.isEmpty()) st.pop();
            }
            else st.push(arr[i]);
        }
        String ans="";
        while(!st.isEmpty()){
            ans="/"+st.pop()+ans;
        }
        if(ans.equals("")) return "/";
        return ans;
    }
}