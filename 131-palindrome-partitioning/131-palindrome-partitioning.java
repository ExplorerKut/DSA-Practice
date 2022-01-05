class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> answer=new ArrayList<List<String>>();
        List<String> temp=new ArrayList<>();
        func(0,s,temp,answer);
        return answer;
    }
    void func(int index,String s,List<String>temp,List<List<String>> answer){
        if(index==s.length()){
            answer.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<s.length();++i){
            if(isPalindrome(s,index,i)){
                temp.add(s.substring(index,i+1));
                func(i+1,s,temp,answer);
                temp.remove(temp.size()-1);
            }
        }
    }
    boolean isPalindrome(String s,int i,int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}