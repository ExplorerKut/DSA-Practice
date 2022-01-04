class Solution {
    public int bitwiseComplement(int n) {
        int count=0;
        int ans=0;
        while(n>1){
            int remainder=n%2;
            n=n/2;
            if(remainder!=1){
                ans+=Math.pow(2,count);
            }
            count++;
        }
        if(n!=1){
            ans+=Math.pow(2,count);
        }
        return ans;
    }
}