package com.bridgelabz.datastructure;

public class LinkedListMain {

    public static void main(String[] args) {


        LinkedList<Integer> linkedList1 = new LinkedList();
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);

        linkedList1.display();

        System.out.println(linkedList1.popLast());
        linkedList1.display();
        System.out.println();

        LinkedList<Integer> linkedList2 = new LinkedList();
        linkedList2.append(56);
        linkedList2.append(30);
        linkedList2.append(70);

        linkedList2.display();

        System.out.println(linkedList2.pop());
        linkedList2.display();
        System.out.println();

        LinkedList<Integer> linkedList3 = new LinkedList();
        linkedList3.push(70);
        linkedList3.push(30);
        linkedList3.push(56);

        linkedList3.display();
        if (linkedList3.search(40) == null)
            System.out.println("Element not found!!");
        else
            System.out.println("Element Found!!");

        boolean isInserted = linkedList3.insertAfter(40, 30);
        if (isInserted)
            System.out.println("Element inserted successfully!!");
        else
            System.out.println("Element not inserted!!");

        linkedList3.display();

        Stack<Integer> stack1 = new Stack();
        stack1.push(30);
    }
}
