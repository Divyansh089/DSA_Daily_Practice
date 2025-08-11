package LinkedList;
import LinkedList.ListNode;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Arrays;

public class stack {
    //implementation of stack using linked List
    static class LinkedStack{
        public static ListNode head;
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
            ListNode newNode = new ListNode(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int pop(){
            if(isEmpty()) return -1;
            int top = head.val;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()) return -1;
            return head.val;
        }
    }
    //implementation of stack using ArrayList
    static class ListStack{
         static ArrayList<Integer> list = new ArrayList<>();
         public static boolean isEmpty(){
             return list.isEmpty();
         }
         public static void push(int x){
             list.add(x);

         }
         public static int pop(){
             if(isEmpty()) return -1;
             int top = list.get(list.size() -1);
             list.remove(list.indexOf(top));
             return top;
         }
         public static int peek(){
             if(isEmpty()) return - 1;
             return list.get(list.size() - 1);
         }
    }

    public static  void pushAtBottom(int data , Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data , s);
        s.push(top);
    }
    public static  void reverse(Stack<Integer> s){
        if(s.isEmpty()) return;
        int top = s.pop();
        reverse(s);
        pushAtBottom(top , s);
    }
    public static void main(String [] args){
        LinkedStack s = new LinkedStack();
        ListStack ls = new ListStack();

        Stack<Integer> ss = new Stack(); // implementation using in-built Stack class
        ss.push(1);
        ss.push(2);
        ss.push(3);
        ss.push(4);
        pushAtBottom(5 , ss);
        reverse(ss);
        while(!ss.isEmpty()){
            System.out.println(ss.peek());
            ss.pop();
        }

    }
}
