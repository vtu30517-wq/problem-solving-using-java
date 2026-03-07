class MyHashSet {

    private static final int SIZE = 1000;   // number of buckets
    private Node[] buckets;

    // Node class for Linked List
    private static class Node {
        int key;
        Node next;
        Node(int key) {
            this.key = key;
        }
    }

    public MyHashSet() {
        buckets = new Node[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void add(int key) {
        int index = hash(key);

        // If bucket is empty, create new node
        if (buckets[index] == null) {
            buckets[index] = new Node(key);
            return;
        }

        Node curr = buckets[index];

        // Check if key already exists
        while (true) {
            if (curr.key == key) {
                return; // already exists
            }
            if (curr.next == null) break;
            curr = curr.next;
        }

        // Add new node at end
        curr.next = new Node(key);
    }

    public void remove(int key) {
        int index = hash(key);

        Node curr = buckets[index];
        Node prev = null;

        while (curr != null) {
            if (curr.key == key) {
                if (prev == null) {
                    buckets[index] = curr.next; // remove head
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    public boolean contains(int key) {
        int index = hash(key);

        Node curr = buckets[index];
        while (curr != null) {
            if (curr.key == key) {
                return true;
            }
            curr = curr.next;
        }

        return false;
    }
}