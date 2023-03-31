package hw3;

public class MyStringArrayList {
    private String[] strings;
    private int size;

    public MyStringArrayList() {
        this.strings = new String[10];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return strings[index];
    }

    public void set(int index, String value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        strings[index] = value;
    }

    public void add(int index, String value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        if (size == strings.length) {
            String[] newStrings = new String[strings.length * 2];
            System.arraycopy(strings, 0, newStrings, 0, strings.length);
            strings = newStrings;
        }
        System.arraycopy(strings, index, strings, index + 1, size - index);
        strings[index] = value;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        System.arraycopy(strings, index + 1, strings, index, size - index - 1);
        strings[size - 1] = null;
        size--;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(strings[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}