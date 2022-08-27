class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solve( nums,0,res);
            return res;
    }
     public void solve(int[] s, int index,List<List<Integer>> res) {
        if (index == s.length){
            ArrayList<Integer> al = new ArrayList<>();
            for(int i=0; i<s.length; i++){
                al.add(s[i]);
            }
            res.add(new ArrayList<>(al));
            return;
        }

        for (int i= index; i<s.length; i++){
            swap(s,i,index);
            solve(s,index+1,res);
            swap(s,i,index);

        }
    }
    public void swap(int[] s, int i, int j) {
        int ch = s[i];
        s[i] = s[j];
        s[j] = ch;
    }
}