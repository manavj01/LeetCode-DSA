class MyHashSet {
    List<Integer> set;
    public MyHashSet() {
        set = new ArrayList<>();
    }
    
    public void add(int key) {
        boolean flag = true;
        for(int i=0; i<set.size(); i++){
            if(set.get(i)==key){
                flag = false;
                break;
            }
        }
        if(flag)set.add(key);
    }
    
    public void remove(int key) {
       if(set.contains(key))
            set.remove(set.indexOf(key));
    }
    
    
    public boolean contains(int key) {
       boolean flag = false;
        for(int i=0; i<set.size(); i++){
            if(set.get(i)==key){
                flag = true;
                return true;
            }
        }
        return flag;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */