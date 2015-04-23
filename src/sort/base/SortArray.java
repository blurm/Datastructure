package sort.base;

public class SortArray {
    private long[] array;

    public SortArray(int size) {
        array = new long[size];
    }

    public void setElem(int index,long value) {
        array[index] = value;
    }

    public long getElem(int index) {
        return array[index];
    }

    public void display() {
        for (int i = 0; i < 10; i++) {
            System.out.print();
        }
    }
}
