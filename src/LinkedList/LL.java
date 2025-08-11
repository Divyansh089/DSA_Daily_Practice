package LinkedList;

import java.net.StandardSocketOptions;

public class LL {
    Node head;
    private int size;

    LL(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        Node secondLast = head;
        Node lastNode = head.next;
        if (secondLast.next == null){
            lastNode = secondLast;
        }
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public int getSize(){
        return size;
    }
    public void print(){
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print("->" + currNode.data);
            currNode = currNode.next;
        }
        System.out.print("->NULL" + "\n");
    }

    public static void main(String [] args){
        LL list = new LL();
        list.addFirst("fucking");
        list.addFirst("is");
        list.print();
        list.addLast("great");
        list.addFirst("Divyansh");
        list.deleteLast();
        list.deleteFirst();
        System.out.println(list.getSize());
        list.print();

    }
}
