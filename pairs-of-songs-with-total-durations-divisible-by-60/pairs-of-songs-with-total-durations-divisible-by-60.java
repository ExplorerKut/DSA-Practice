class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        if(time.length==1){
            return 0;
        }
        int count=0;
        int hashMap[]=new int[60];
        for(int i=0;i<time.length;i++){
            hashMap[time[i]%60]+=1;
        }
        count+=hashMap[0]*(hashMap[0]-1)/2;
        count+=hashMap[30]*(hashMap[30]-1)/2;
            
        for(int i=1;i<30;i++){
            count+=hashMap[i]*hashMap[60-i];
        }
        return count;
    }
}