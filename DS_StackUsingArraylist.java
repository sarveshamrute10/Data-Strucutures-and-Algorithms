import java.util.*;

class DS_StackUsingArraylist {
	public static List<Integer> arrlist = new ArrayList<>();
	public static int top;
	DS_StackUsingArraylist() { top=-1;}
	public static void push(int x) {
		arrlist.add(x);
		top++;
	}
	public static int pop() {
		if(top<0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			return arrlist.get(top--);
		}
	}

	public static void main(String[] args) {
		DS_StackUsingArraylist s = new DS_StackUsingArraylist();
		push(3);
		push(4);
		System.out.println(pop());
	}
}