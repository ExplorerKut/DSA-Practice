class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1&&trust.length==0){
            return 1;
        }
        HashMap<Integer,Integer> numSet=new HashMap<Integer,Integer>();
        int count=0;
        int ans=-1;
        for(int i=0;i<trust.length;i++){
            numSet.put(trust[i][1],numSet.getOrDefault(trust[i][1],0)+1);
        }
        for(int i=1;i<n+1;i++){
            if(numSet.containsKey(i)&&numSet.get(i)==n-1){
                ans=i;
                break;
            }
        }
        for(int i=0;i<trust.length;i++){
            if(trust[i][0]==ans){
                return -1;
            }
        }
        return ans;
    }
}
