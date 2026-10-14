class Solution{
    public String maxSumOfSquares(int num,int sum){
        if(sum>num*9) return "";
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<num;i++){
            int d;
            if(sum>9)d=9;
            else d=sum;
            ans.append(d);
            sum-=d;
        }
        return ans.toString();
    }
}