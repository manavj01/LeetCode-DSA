class Solution {
   public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> res=new ArrayList<String>();
        recur(s,wordDict,res,"",0);
        return res;
    }
    public void recur(String s, List<String> wordDict,List<String> res,String cur,int idx){
        if(idx==s.length()){
            res.add(cur.substring(0,cur.length()-1));
            return;
        }
        for(int i=idx;i<s.length();i++){
            String temp=s.substring(idx,i+1);
            if(wordDict.contains(temp)){
                recur(s,wordDict,res,cur+temp+" ",i+1);
            }
        }
    }
}