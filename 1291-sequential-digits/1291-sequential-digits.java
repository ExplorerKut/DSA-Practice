class Solution {
    // public List<Integer> sequentialDigits(int low, int high) {
    //     List<Integer> arr_list=new ArrayList<Integer>();
    //     int n=low;
    //     int x=n;
    //     int prev=-1;
    //     for(int i=low;i<=high;i++){
    //         prev=i%10;
    //         n=i/10;
    //         if((n%10)+1==prev){
    //         while(n!=0)
    //         {
    //             if((n%10)+1==prev){
    //                 prev=n%10;
    //                 n=n/10;
    //             }
    //             else{
    //                 break;
    //             }
    //         }
    //         if(n==0){
    //             arr_list.add(i);
    //         }
    //         }
    //     }
    //     return arr_list;
    // }
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> arr_list=new ArrayList<Integer>();
        int x=12;
        int change=x;
        int y=11;
        while(x<=high){
            if(x>=low){
                // arr_list.add(x);
                if(x<=high){
                    arr_list.add(x);
                }
                if((x+y)%10==0){
                    y=y*10+1;
                    x=change+y;
                    change=x;
                }
                else{
                x=x+y;
                }
                
                
            }
            else{
                if((x+y)%10==0){
                    y=y*10+1;
                    x=change+y;
                    change=x;
                }
                else{
                x=x+y;
                }
            }
        }
        return arr_list;
    }


}