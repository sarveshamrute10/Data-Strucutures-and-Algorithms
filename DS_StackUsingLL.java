import java.util.*;

class DS_StackUsingLL {
	public static class Node {
		int data;
		Node next;
		Node() {}
		Node(int k) {
			data = k;
		}
	}
	static Node top;
	public static void push(int x) {
		Node node = new Node(x);
		node.next = top;
		top = node;
	}
	public static int pop() {
		if(top==null) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			Node temp = top;
			top = top.next;
			return temp.data;
		}
	}

	public static void main(String[] args) {
		DS_StackUsingLL s1 = new DS_StackUsingLL();
		s1.push(1);
		System.out.println(s1.pop());
	}
}