import java.util.*;
class DS_StackUsingArray {
	static int max = 1000;
	static int[] array = new int[max];
	static int top = -1;
	DS_StackUsingArray() {};
	DS_StackUsingArray(int k) {
		max = k;
	}
	public static void push(int x) {
		if(top>=(max-1)) {
			System.out.println("Stack Overflow");
		} else {
			array[++top] = x;
		}
	}
	public static int pop() {
		if(top<0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			return array[top--];
		}
	}
	public static int peek() {
		if(top<0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			return array[top];
		}
	}

	public static void main(String[] args) {
		DS_StackUsingArray stack = new DS_StackUsingArray(10);
		push(1);
		push(3);
		System.out.println(peek());
		System.out.println(pop());
		System.out.println(peek());
	}
}