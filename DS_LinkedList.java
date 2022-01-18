import java.util.*;

class DS_LinkedList {
    public static class LinkedList {
        Node head;
        
        public static class Node {
            int data;
            Node next;
            Node() {};
            Node(int k) {
                data = k;
            }
        }
        
        public static void printll(LinkedList list) {
            Node temp = list.head;
            while(temp!=null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        
        public static void insertFirst(LinkedList list, int key) {
            Node node = new Node(key);
            node.next = list.head;
            list.head = node;
        }
        
        public static void insertLast(LinkedList list, int key) {
            Node temp = list.head;
            while(temp.next!=null) {
                temp = temp.next;
            }
            Node node = new Node(key);
            temp.next = node;
            node.next = null;
        }
        
        public static void insert(LinkedList list, int key, int pos) {
            if(pos==1) {
                insertFirst(list,key);
            }
            Node temp = list.head;
            Node node = new Node(key);
            while(pos-- != 0) {
                if(pos==1) {
                    node.next = temp.next;
                    temp.next = node;
                } else {
                    temp = temp.next;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        LinkedList.insertFirst(LL,1);
        LinkedList.insert(LL,2,2);
        LinkedList.insert(LL,3,3);
        LinkedList.insertLast(LL,4);
        LinkedList.printll(LL);
    }
}