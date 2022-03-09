package week_9;
interface Stack{
	boolean isEmpty();
	void push(char item);
	char pop();
	void delete();
	char peek();
}
class ArrayStack{
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
public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char item;
		ArrayStack array1 = new ArrayStack();
		array1.push('a');
		array1.push('+');
		array1.push('b');
		array1.push('-');
		array1.push('c');
		System.out.println(array1.pop());
		System.out.println(array1.pop());
		System.out.println(array1.pop());
		System.out.println(array1.pop());
		System.out.println(array1.pop());
		System.out.println(array1.pop());
	}

}
