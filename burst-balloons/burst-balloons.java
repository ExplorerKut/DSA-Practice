class Solution {
    public int maxCoins(int[] nums) {
        int N=nums.length;
        int numsTable[][]=new int[nums.length][nums.length];
        for(int g=0;g<N;g++){
            for(int i=0,j=g;j<N;i++,j++){
                int max=Integer.MIN_VALUE;
                for(int k=i;k<=j;k++){
                    
                    int left=k==i?0:numsTable[i][k-1];
                    int right=k==j?0:numsTable[k+1][j];
                    int val=(i==0?1:nums[i-1])*nums[k]*(j==nums.length-1?1:nums[j+1]);
                    
                    int total=left+right+val;
                    if(total>max){
                        max=total;
                    }
    
                }
            numsTable[i][j]=max;
            }
            
        }
        return numsTable[0][N-1];
    }
}