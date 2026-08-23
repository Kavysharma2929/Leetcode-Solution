class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
        int bobq=0;
        int aliceq=0;
        int bob=0;
        int alice=0;
        for(int i=0;i<n/2;i++){
            if(num.charAt(i)=='?') bobq++;
            else bob+=num.charAt(i)-'0';
            if(num.charAt(n-1-i)=='?') aliceq++;
            else alice+=num.charAt(n-1-i)-'0';
        }
        int diff = 2*(bob-alice);
        int qdiff = 9*(aliceq-bobq);
        return diff!=qdiff;
    }
}