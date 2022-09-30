class LRUCache {

    public class DLL {
        int key; //0
        int val; //1
        DLL prev;
        DLL next;

        DLL(int key, int val, DLL prev, DLL next) {
            this.key = key;
            this.val = val;
            this.prev = prev;
            this.next = next;
        }

        DLL(int key, int val) {
            this.key = key;
            this.val = val;
        }

        DLL() {}
    }

    HashMap<Integer, DLL> map;
    int cap;
    DLL head;
    DLL tail;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        cap = capacity;
        head = new DLL(-1, -1);
        tail = new DLL(-1, -1);
        head.next = tail;
        head.prev = null;
        tail.next = null;
        tail.prev = head;
    }

    public int get(int key) {
        if (map.get(key) == null) return -1;

        int val = map.get(key).val;
        DLL keyNode = map.get(key);
        putNodeInPlace(keyNode);
        return val;
    }

    public void put(int key, int value) {
        if (!map.containsKey(key)) {
            //DLL node = new DLL(value);
            if (map.size() == cap) {
                // delete node before tail;
                int k = tail.prev.key;
                DLL nodePrev = tail.prev.prev;
                DLL nodeNext = tail;
                nodePrev.next = nodeNext;
                nodeNext.prev = nodePrev;
                map.remove(k);
            }
            // add node after head;
            DLL headNext = head.next;
            DLL tba = new DLL(key, value);
            tba.next = head.next;
            headNext.prev = tba;
            tba.prev = head;
            head.next = tba;
            map.put(key, tba);
        } else {
            DLL node = map.get(key);

            // delete node
            DLL nodePrev = node.prev;
            DLL nodeNext = node.next;
            nodePrev.next = nodeNext;
            nodeNext.prev = nodePrev;
            map.remove(key);
            // add node
            DLL headNext = head.next;
            DLL tba = new DLL(key, value);
            tba.next = head.next;
            headNext.prev = tba;
            tba.prev = head;
            head.next = tba;
            map.put(key, tba);
        }
    }

    public void putNodeInPlace(DLL node) {
        // removing the node
        DLL nodePrev = node.prev;
        DLL nodeNext = node.next;
        nodePrev.next = nodeNext;
        nodeNext.prev = nodePrev;
        // put after head
        DLL headNext = head.next;
        node.prev = head;
        node.next = headNext;
        headNext.prev = node;
        head.next = node;
    }
}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
