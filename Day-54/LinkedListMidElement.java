import java.util.LinkedList;

public class LinkedListMidElement {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.addFirst(0);
        linkedList.addLast(4);
        linkedList.add(3);
        int mid = midLinkedList(linkedList);
        System.out.println("Mid of the Element : " + mid);

    }

    private static int midLinkedList(LinkedList<Integer> linkedList) {
        int slow = 0, fast = 0;

        while (fast < linkedList.size() - 1){
            slow++;
        fast += 2;}
        return linkedList.get(slow);

    }
}
