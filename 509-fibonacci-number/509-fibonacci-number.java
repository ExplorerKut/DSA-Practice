class Solution {
    public int fib(int n) {
        return fibHelper(n,new int[n+1]);
    }
    public int fibHelper(int n,int arr[]){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            if(arr[n]!=0){
                return arr[n];
            }
            else{
                return arr[n]=fibHelper(n-1,arr)+fibHelper(n-2,arr);
            }
        }
    }
    
}