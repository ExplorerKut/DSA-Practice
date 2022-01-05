class Solution {
    public int removeDuplicates(int[] nums){
        int n=nums.length;
        int j=0;
        for(int i=0;i<n-1;i++){
            if(nums[j]!=nums[i+1]){
                j++;
                nums[j]=nums[i+1];
            }
            
        }return j+1;
    }
}