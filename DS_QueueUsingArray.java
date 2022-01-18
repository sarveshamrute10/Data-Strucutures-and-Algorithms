import java.util.*;

class DS_QueueUsingArray {
	public static int max = 1000;
	public static int r=(max-1);
	public static int f=(max-1);
	DS_QueueUsingArray() {}
	DS_QueueUsingArray(int k) {
		max = k;
	}
	public static int[] arr = new int[max];
	public static void enqueue(int x) {
		if(r<0) {
			System.out.println("Queue Overflow");
		} else {
			arr[r] = x;
			r--;
		}
	}
	public static int dequeue() {
		if(f<0) {	
			System.out.println("Queue Underflow");
			return 0;
		} else {
			int temp = arr[f];
			f--;
			return temp;
		}
	}
	public static int front() {
		if(r<0) {
			System.out.println("Queue Underflow");
			return 0;
		} else {
			return arr[f];
	}
}
	public static int back() {
		if(r==(max-1)) {
			System.out.println("Queue Underflow");
			return 0;
		} else {
			return arr[r+1];
		}
	}

	public static void main(String[] args) {
		DS_QueueUsingArray q = new DS_QueueUsingArray(5);
		enqueue(1);
		enqueue(3);
		enqueue(2);
		System.out.println(front());
		System.out.println(back());
		dequeue();
		System.out.println(front());
		System.out.println(back());
		dequeue();
		System.out.println(front());
		System.out.println(back());
		dequeue();
		System.out.println(front());
		System.out.println(back());
	}
}