package week_10;
public class StackMain{
	public static void main (String[] args) {
		StackClass stack = new StackClass();
		stack.push(new Integer(1000));
		stack.push(new Integer(1001));
		stack.push(new Integer(1002));
		stack.push(new Integer(1003));
		stack.push(new Integer(1004));
		stack.push(new Integer(1005));
		stack.push(new Integer(1006));
		stack.push(new Integer(1007));
		stack.push(new Integer(1008));
		stack.push(new Integer(1009));
		
		stack.print();
		
		Integer x = (Integer) stack.pop(11);
		System.out.println("\n출고되는 차량 : " + x);
		
		stack.print();
		stack.push(new Integer(1010));
		stack.print();
		stack.push(new Integer(1011));
		stack.print();
	}
}
