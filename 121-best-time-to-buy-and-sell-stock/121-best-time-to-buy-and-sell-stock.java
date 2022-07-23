class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=0;
        
        for(int i=0;i<prices.length;i++){
            if(prices[i]<prices[min]){
                min=i;
            }
            if(min!=i&&max<prices[i]-prices[min]){
                max=prices[i]-prices[min];
            }
            
            
        }
        
        // System.out.println(max+" "+min);
        return max;
    }
    
    
}