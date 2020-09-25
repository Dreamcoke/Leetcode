package linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 2,1};
        LinkedList list = new LinkedList();
        for (int i = 0; i < arr.length; i++) {
            list.insertToHead(arr[i]);
        }

        System.out.println(list.palindrome());
    }
}
