package hw3;

public class Main {
    public static void main(String[] args) {
        MyStringArrayList arr = new MyStringArrayList();

        // adding elements
        arr.add(0, "text1");
        arr.add(1, "text2");
        arr.add(2, "text3");
        System.out.println(arr); // [text1, text2, text3]

        // getting elements
        System.out.println(arr.get(0)); // text1
        System.out.println(arr.get(1)); // text2
        System.out.println(arr.get(2)); // text3

        // setting elements
        arr.set(0, "new text1");
        arr.set(1, "new text2");
        System.out.println(arr); // [new text1, new text2, text3]

        // removing elements
        arr.remove(2);
        System.out.println(arr); // [new text1, new text2]

        // trying to access an invalid index
        try {
            System.out.println(arr.get(2));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + e.getMessage()); // Invalid index: 2
        }
    }
}
