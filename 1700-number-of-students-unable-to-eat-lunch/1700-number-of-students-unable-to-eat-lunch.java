class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count0=0,count1=0;
        for(int i=0;i<students.length;i++){
            if(students[i]==1) count1++;
            if(students[i]==0) count0++;
        }
        for(int j=0;j<sandwiches.length;j++){
            if(sandwiches[j]==0){
                if(count0==0) return count1;
                count0--;
            }else{
                if(count1==0) return count0;
                count1--;
            }
        }
        return 0;
    }
}