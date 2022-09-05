package com.company.linkedlist;

public class LinkedList {
    public static Node head = null;
    public static Node tail = null;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        //method to add a new node to the linked list
        public void insert(int data){
            Node newNode = new Node(data);
            //if list is empty then set head and tail to new node
            if (head == null){
                head = newNode;
                tail = newNode;
            }
            else {
                //add new node after tail
                tail.next = newNode;
                //now new node is the tail
                tail = newNode;
            }

        }
    public void print() {
        //Node current will point to head
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {
            //Print each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    //delete node from beginning
    public void delete(){
        head = head.next;
    }
    public void deleteEnd(){
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next=null;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(12);
        list.insert(13);
        list.insert(15);
        list.insert(18);
        list.insert(20);
        //delete from beginning
        list.delete();
        //delete from end
        list.deleteEnd();
        System.out.println("LinkedList Elements : ");
        list.print();


    }
}
