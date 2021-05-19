public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        System.out.println("Size of myLinkedList is: " + myLinkedList.size()+"\n");
        myLinkedList.addFirst(1);
        System.out.print("myLinkedList: ");
        myLinkedList.printList();
        System.out.println("\nSize of myLinkedList is: " + myLinkedList.size()+"\n");

        myLinkedList.addFirst(2);
        myLinkedList.add(5, 3);
        System.out.print("myLinkedList: ");
        myLinkedList.printList();
        System.out.println("\nSize of myLinkedList is: " + myLinkedList.size()+"\n");

        myLinkedList.addLast(5);
        System.out.print("myLinkedList after add last: ");
        myLinkedList.printList();
        System.out.println("\nSize of myLinkedList is: " + myLinkedList.size()+"\n");

        myLinkedList.remove(1);
        System.out.print("myLinkedList after remove: ");
        myLinkedList.printList();
        System.out.println("\nSize of myLinkedList is: " + myLinkedList.size()+"\n");

        System.out.print("10: " + myLinkedList.contains(10)+"\n");
        System.out.println("5: " + myLinkedList.indexOf(5)+"\n");

        System.out.println("First Node: " + myLinkedList.getFirst());
        System.out.println("Last Node: " + myLinkedList.getLast());

        myLinkedList.clear();
        System.out.println("After clear: ");
        myLinkedList.printList();
    }
}
