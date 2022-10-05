class Solution {
    public List<String> letterCombinations(String digits) {
        String[] digit = {"","", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        
        List<String> res = new ArrayList<>();
        if(digits.length()==0) return res;
        res.add("");
        
        for(int i=0; i<digits.length(); i++){
            res = makeCombination(digit[digits.charAt(i)-'0'], res);
        }
        
        return res;
    }
    
    public List<String> makeCombination(String digits, List<String> l){
        
        List<String> res = new ArrayList<>();
        
        for(int i=0; i<digits.length(); i++){
            
            for(String x : l){
                res.add(x+digits.charAt(i));
            }
        }
        
        return res;
    }
}
