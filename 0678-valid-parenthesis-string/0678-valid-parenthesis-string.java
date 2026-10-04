class Solution {
    public boolean checkValidString(String s) {
        int n=s.length();
        int open=0;
        int close=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch == '('){
                open++;
                close++;
            }
            else if(ch==')'){
                open--;
                close--;
            }
            else{
                open++;
                close--;
            }
            if(open<0) return false;
            if(close<0) close=0 ;

        }
        return close==0;
    }
}