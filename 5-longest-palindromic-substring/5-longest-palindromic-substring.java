class Solution {
    public String longestPalindrome(String s) {
        StringBuffer str=new StringBuffer();
        if(s.length()==1){return s;}
        int m=s.length();
        int strTable[][]=new int[m][m];
        int max=0;
        int row=0;
        for(int i=0;i<m;i++){
            for(int k=0,j=i;j<m;j++,k++){
                if(i==0){
                    strTable[k][j]=1;
                }
                else if(i==1){
                    if(s.charAt(k)==s.charAt(j)){
                        strTable[k][j]=1;
                    }
                    else{
                        strTable[k][j]=0;
                    }
                }
                else{
                    if(s.charAt(k)==s.charAt(j)&&strTable[k+1][j-1]==1){
                        strTable[k][j]=1;
                        
                    }
                    else{
                        strTable[k][j]=0;
                    }
                }
                if(strTable[k][j]==1){
                    row=k;
                    max=i+1;
                }
            }
        }
        for(int i=row;i<row+max;i++){
            str.append(s.charAt(i)+"");
        }
    return str.toString();
    }
}