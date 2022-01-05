class Solution {
    // public int longestPalindromeSubseq(String s) {
    //     StringBuffer revS=new StringBuffer(s);
    //     revS.reverse();
    //     return lps(s,revS.toString(),s.length()-1,s.length()-1);
    // }
    // public int lps(String s,String revS,int i,int j){
    //     if(i<0||j<0){
    //         return 0;
    //     }
    //     if(s.charAt(i)==revS.charAt(j)){
    //         return 1+lps(s,revS,i-1,j-1);
    //     }
    //         return Math.max(lps(s,revS,i,j-1),lps(s,revS,i-1,j));
    // }
    public int longestPalindromeSubseq(String s){
        StringBuffer revS=new StringBuffer(s);
        revS.reverse();
        int m=s.length();
        int sTable[][]=new int[m+1][m+1];
        for(int i=1;i<m+1;i++){
            for(int j=1;j<m+1;j++){
                if(s.charAt(i-1)==revS.charAt(j-1)){
                    sTable[i][j]=1+sTable[i-1][j-1];
                }
                else{
                    sTable[i][j]=Math.max(sTable[i-1][j],sTable[i][j-1]);
                }
            }
        }
        return sTable[m][m];
    }
}