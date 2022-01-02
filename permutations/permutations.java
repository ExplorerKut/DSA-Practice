class Solution {
    public List<List<Integer>> permute(int[] nums) {
        return findPerm(nums,0,new ArrayList<List<Integer>>());
    }
    public List<List<Integer>> findPerm(int[]nums,int curr,List<List<Integer>> answer){
        if(curr==nums.length){
            List<Integer> perm=new ArrayList<Integer>();
            for(int i=0;i<nums.length;i++){
                perm.add(nums[i]);
            }
            answer.add(perm);
            return answer;
        }
        for(int i=curr;i<nums.length;i++){
            swap(nums,curr,i);
            findPerm(nums,curr+1,answer);
            swap(nums,curr,i);
        }
        return answer;
    }
    public void swap(int nums[],int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];    
        nums[j]=temp;
    }
}