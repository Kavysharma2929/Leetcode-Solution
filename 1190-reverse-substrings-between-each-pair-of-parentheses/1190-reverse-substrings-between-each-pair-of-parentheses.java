class Solution{
    public String reverseParentheses(String s){
        Stack<String> st=new Stack<>();
        String cur="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(cur);
                cur="";
            }
            else if(c==')'){
                String temp=st.pop();
                for(int j=cur.length()-1;j>=0;j--)
                    temp+=cur.charAt(j);
                cur=temp;
            }
            else{
                cur+=c;
            }
        }
        return cur;
    }
}
