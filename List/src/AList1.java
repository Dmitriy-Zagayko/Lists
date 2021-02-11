import Interafce.IList;

public class AList1 implements IList {

    private int size;
    private int[] array;
    private final static int DEFAULT_CAPACITY = 10;

    public AList1() {
        array = new int[DEFAULT_CAPACITY];
    }

    @Override
    public void clear() {
        array = null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public boolean add(int value) {
        return false;
    }

    @Override
    public boolean add(int index, int value) {
        return false;
    }

    @Override
    public int remove(int number) {
        int removedValue = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == number){
                removedValue = removeByIndex(i);
            }
        }
        return removedValue;
    }

    @Override
    public int removeByIndex(int index) {
        return 0;
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (value == array[i]) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean set(int index, int value) {
        array[index] = value;
        return true;
    }

    @Override
    public void print() {
        String result = "[ ";
        for (int i = 0; i < size; i++) {
            result += array[i] + ", ";
        }
        result += " ]";
        System.out.println(result);
    }

    @Override
    public int[] toArray() {
        int[] newArray = new int[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    @Override
    public boolean removeAll(int[] ar) {
        return false;
    }
}
