package week_10;
import java.util.Stack;

public class MyStringCheek {
	public static void stringCheck(String exp) {
		Stack<Character> stack1 = new Stack<Character>();
		Stack<Character> stack2 = new Stack<Character>();
		for (int i = 0; i<exp.length(); i++) {
			char c = exp.charAt(i);
			if(c == 'a') { stack1.push(c);}
			else {stack2.push(c);}
				
			}
			while(!stack1.isEmpty()&&! stack2.isEmpty()) {
				stack1.pop();
				stack2.pop();
				
			}
			if(!stack1.isEmpty()) {
				System.out.println("there are more a's");
			}else if (!stack2.isEmpty()) {
				System.out.println("b");
			}else {System.out.println("a와b의 개수가 같음");}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "aaaabbbb";
		stringCheck(exp);
		System.out.print("g");
	}

}
