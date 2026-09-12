class Solution {
    public boolean canConstruct(String s, int k) {
        int n=s.length();
        if(n<k) return false;
        int[] count=new int[26];
        for(int i=0;i<n;i++){
            count[s.charAt(i)-'a']++;
        }
        int odd=0;
        for(int i=0;i<26;i++){
            if(count[i]%2!=0) odd++;
        }
        return odd<=k;
    }
}