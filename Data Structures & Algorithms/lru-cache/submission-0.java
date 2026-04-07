class LRUCache{
    HashMap<Integer, Node> map = new HashMap<>();
    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);
    int capacity;
    public class Node {
        int key;
        int val;
        Node next;
        Node prev;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;

    }

    public int get(int key) {
        if (!map.containsKey(key)){
            return -1;
        }
        update(map.get(key));
        return map.get(key).val;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)){
            Node n = map.get(key);
            n.val = value;
            update(n);
        }else{
            Node n = new Node(key,value);
            if (map.size() == capacity) {
                Node lastNode = tail.prev;
                delete(lastNode);
                map.remove(lastNode.key);
            }
            map.put(key, n);
            add(n);
        }

    }

    public void update(Node n){
        delete(n);
        add(n);
    }
    public void delete(Node n){
        Node preNode = n.prev;
        Node nextNode = n.next;
        preNode.next = nextNode;
        nextNode.prev = preNode;

    }
    public void add(Node n){
        Node nextNode = head.next;
        head.next = n;
        n.prev = head;
        n.next = nextNode;
        nextNode.prev = n;


    }


}