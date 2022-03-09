package week_9;
interface Stack{
	boolean isEmpty();
	void push(char item);
	char pop();
	void delete();
	char peek();
}
class StackNode{
	char data;
	StackNode link;
}
class LinkStack implements Stack{
	private StackNode top;
	public LinkStack() {
		top = null;
	}
	public boolean isEmpty(){
		return (top == null);
	}
	public void push(char item) {
		StackNode newNode = new StackNode();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
	}
	public char pop() {
		if(isEmpty()) {
			System.out.print("under flow");
			return '0';
		}
		char tmpItem = top.data;
		top = top.link;
		return tmpItem;
	}
	public void delete() {
		if(isEmpty()) {
			System.out.print("under flow");
		}
		top = top.link;
	}
	public char peek() {
		if(isEmpty()) {
			System.out.print("under flow");
			return 0;
		}else {
			return top.data;
		}
		
	}
}
class ArrayStack implements Stack{
	private int top; //
	private int stackSize = 5;
	private char itemArray[];
	private void resize(int newStacksize) {
		char temItemArray[] = new char[newStacksize];
		for (int i = 0; i <= top; i++) {
			temItemArray[i] = itemArray[i];	
		}
		itemArray = temItemArray;
	}
	public ArrayStack() {
		top = -1;
		itemArray = new char[stackSize];
	}
	public boolean isEmpty() {
		return( top == -1);
		
	}
	public boolean isFull() {
		return(top == stackSize-1);
	}
	public void push(char item) {
		if(isFull()) {
			System.out.print("Overflow");
			resize(2*stackSize);
		}
		top++;
		itemArray[top] = item; 
	}
	public char pop() {
		char tmpItem;
		if(isEmpty()) {
			System.out.println("UnderFlow");
			resize(stackSize/2);
			return 0;
		}
		tmpItem = itemArray[top];
		top--;
		return tmpItem;
		
	}
	public void delete() {
		if(isEmpty()) {
			System.out.println("UnderFlow");
			resize(stackSize/2);
			
		}
		top--;
	}
	public char peek() {
		char item;
		if(isEmpty()) {
			System.out.println("stack underflow");
			return 0;
		}
		item = itemArray[top];
		
		return item;
	}
}
public class LinkedStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char item;
		LinkStack array2 = new LinkStack();
		array2.push('a');
		array2.push('+');
		array2.push('b');
		array2.push('-');
		array2.push('c');
		System.out.println(array2.pop());
		System.out.println(array2.pop());
		System.out.println(array2.pop());
		System.out.println(array2.pop());
		System.out.println(array2.pop());
		
		
		
	}

}
