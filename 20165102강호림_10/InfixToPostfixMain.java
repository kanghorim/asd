package week_10;
import java.util.*;
import java.util.Stack;
class InfixToPostfix{
	static int Priority(char ch) {
		switch(ch) {
		case '+': return 1;
		case '-': return 1;
		case '*': return 2;
		case '/': return 2;
		case '^': return 3;		
		}
		return -1;
	}
	public static String cal(String exp) {
		String result  = new String("");
		Stack<Character> stack1 = new Stack<Character>();
		for (int i = 0; i< exp.length(); i++) {
			char c =  exp.charAt(i);
			if(Character.isLetterOrDigit(c)) {
				result += c;
			}else if (c=='(') {
				stack1.push(c);
			}else if (c==')') {
				while(!stack1.isEmpty()&&stack1.peek()!='(') {
					result += stack1.pop();
				}
				if(!stack1.isEmpty()&&stack1.peek()!='(') {
					return "error";
				}else {
					stack1.pop();
				}
			}else {
				while(!stack1.isEmpty()&&Priority(c) <= Priority(stack1.peek())){
					result += stack1.pop();
				}
				stack1.push(c);
			}
		}
		while(!stack1.isEmpty()) {
			result += stack1.pop();
		}
		return result;
	}
}
public class InfixToPostfixMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "a+b(c^d-e)^(f+g*h)-i";
		System.out.println(InfixToPostfix.cal(exp));
	}

}
