package com.mlucov.linkedList;

public class LinkedListClass {
    public static void main( String args[] ) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.insertAtEnd(1);
        list.insertAtEnd(2);

        list.insertAtEnd(123);
        list.insertAtEnd(101);
        list.insertAtEnd(61);
        list.printList();
        System.out.println("Middle element is : " + findMiddle(list));
    }
    public static <T> boolean isPalindrome(DoublyLinkedList<T> list) {
        DoublyLinkedList<T>.Node start = list.getHeadNode(); // get the head pointer
        DoublyLinkedList<T>.Node end = list.getTailNode(); // get the tail
        if (start == null){ // if list is empty, it is a palindrome
            return true;
        }
        while(start != null){ //otherwise traverse list from both sides
            if (start.data != end.data){ // if data mismatches at any point list is not a palindrome
                return false;
            }
            start = start.nextNode;
            end = end.prevNode;
        }
        return true; // if data didn't mismatch at any point, list is a palindrome.
    }
    public static <T> Object findMiddle(SinglyLinkedList<T> list) {
        if (list.isEmpty()) return null;
        SinglyLinkedList<T>.Node mid = list.headNode;
        SinglyLinkedList<T>.Node current = list.headNode;

        while(mid != null && current != null && current.nextNode != null)
        {
            current = current.nextNode.nextNode;
            if(current != null){
                mid = mid.nextNode;
            }
        }
        return mid.data;
    }
    public static <T> void removeDuplicates(SinglyLinkedList<T> list) {
        SinglyLinkedList<T>.Node current = list.headNode; // will be used for outer loop
        SinglyLinkedList<T>.Node compare = null;     // will be used for inner loop

        while (current != null && current.nextNode != null) {
            compare = current;
            while (compare.nextNode != null) {
                if (current.data.equals(compare.nextNode.data)) { //check if duplicate
                    compare.nextNode = compare.nextNode.nextNode;
                } else {
                    compare = compare.nextNode;
                }
            }
            current = current.nextNode;
        }
    }
}
