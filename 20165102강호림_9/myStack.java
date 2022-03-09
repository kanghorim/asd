package week_9;
import java.util.Stack;
public class myStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> myStack1 = new Stack<>();
		myStack1.push("Kim");
		myStack1.push("Lee");
		myStack1.push("Park");
	
		System.out.println(myStack1);
		System.out.println(myStack1.peek());
		System.out.println(myStack1.size());
		//myStack1.pop();
		//myStack1.pop();
		//myStack1.pop();
		//myStack1.pop();
		//pop는 스텍의 값을 제거하는것으로 크기가 3이라 4번이상 실행하면
		//오류가 생긴다.
	}

}
