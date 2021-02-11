import Interafce.IList;

public class LList1 implements IList {
    Node root = null;

    class Node {
        Node next;

        int value;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    private int count = 0;

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public boolean add(int value) {
        if (root == null) {
            root = new Node(value);
        }
        while (root.next != null) { }
        return false;
    }

    @Override
    public boolean add(int index, int value) {
        return false;
    }

    @Override
    public int remove(int number) {
        return 0;
    }

    @Override
    public int removeByIndex(int index) {
        return 0;
    }

    @Override
    public boolean contains(int value) {
        return false;
    }

    @Override
    public boolean set(int index, int value) {
        return false;
    }

    @Override
    public void print() {

    }

    @Override
    public int[] toArray() {
        return new int[0];
    }

    @Override
    public boolean removeAll(int[] ar) {
        for (int i = 0; i < ar.length; i++){
            remove(ar[i]);
        }
        return true;
    }
}
