class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if(target>x+y) return false;
        while(y!=0){
            int z=x%y;
            x=y;
            y=z;
        }
        if(target%x==0) return true;
        else return false;
    }
}