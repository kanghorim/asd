package week_10;
import java.util.Stack;
class PostFixStack{
	public static int calc(String exp) {
		Stack<Integer> stack1 = new Stack<Integer>();
		for(int i= 0; i<exp.length(); i++) {
			
			char c = exp.charAt(i);
			if(Character.isDigit(c)) {
				stack1.push(c-'0');
				
			}else {
				int val1 = stack1.pop();
				int val2 = stack1.pop();
				switch(c) {
				case '+': 
				stack1.push(val2 + val1);
				break;
				case '-': 
				stack1.push(val2 - val1);
				break;
				case '*': 
				stack1.push(val2 * val1);
				break;
				case '/': 
				stack1.push(val2 + val1);
				break;
				}
			}
			
		}
		return stack1.pop();
	}
}
public class PostExpEval {

	public static void main(String[] args) {
		String exp = "231* + 9 -";
		System.out.println(PostFixStack.calc(exp));
		exp = "31+5-7*9+";
		System.out.println(PostFixStack.calc(exp));
	}

}
