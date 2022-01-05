class Solution {
    public int removeDuplicates1(int[] nums) {
        int tail=nums.length;
        int newTail=tail;
        for(int i=0;i<tail;i++)
        {
           if(nums[i]==nums[i+1])
           {
            int x=1, j=i+2;
            while(nums[i]==nums[j]&&j<=tail)
            {
                x++;
            }
            for(int l=i+1;l<=i+x;l++)
            {
                nums[l]=nums[l+x];
            }
              tail=tail-x;
           } 
        }
    return tail+1;
    }
    public int removeDuplicates(int[] nums){
        int n=nums.length;
        int j=0;
        //1 1 1 2 2 3
        /*
        j=0
        i=0
        nums[0]!=nums[1]
        */
        int count=1;
        for(int i=0;i<n-1;i++){
            if(nums[j]!=nums[i+1]){
                count++;
                j++;
                nums[j]=nums[i+1];
            }
            
        }return count;
    }
}