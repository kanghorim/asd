package dkfrh_10;
import java.util.Stack;

class Student {
	   int id;
	   String name;
	   
	   Student(String name, int id) {
	      this.id = id;
	      this.name = name;
	   }
	}
public class StackNumber {
	public static void sorted(Stack <Student> myStack) {
	      Stack <Student> sort = new Stack<>();
	      Student tmp;
	      
	      sort.push(myStack.pop());
	      
	      while(!myStack.isEmpty()) {
	         tmp = myStack.pop();
	         
	         while(!sort.isEmpty() && tmp.id > sort.peek().id) {
	            myStack.push(sort.pop());
	         }
	         sort.push(tmp);
	      }
	      
	      
	      printStack(sort);
	      
	      
	   }
	   
	   public static void printStack(Stack <Student> st) {
	      Student tmp;
	      int count = 1;
	      
	      System.out.println("Stack");
	      while(!st.isEmpty()) {
	         tmp = st.pop();
	         System.out.printf("%2d. 학번 : %d, 이름 : %s\n", count++, tmp.id, tmp.name);
	         
	      }
	      System.out.println();
	   }

	   public static void main(String[] args) {
	      
	      Stack <Student> myStack = new Stack<>();
	      
	      myStack.push(new Student("강호림", 20165102));
	      myStack.push(new Student("이수민", 20177144));
	      myStack.push(new Student("김준호", 20185230));
	      
	      
	      sorted(myStack);
	      
	      

	   }
	}
