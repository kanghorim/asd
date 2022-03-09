package week_10;
import java.util.Stack;

class Student{
	int hakbun;
	String name;
	public Student(int id, String myname) {
		hakbun = id;
		name = myname;
	}
}
public class MyNodeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Student> stack1 = new Stack<Student>();
		//Student tmpStudent = new Student();
		//tmpStudent.hakbun = 111;
		//tmpStudent.name = "horim";
		//stack1.push(tmpStudent);
		stack1.push(new Student(1111,"horim"));
		Student tmpStudent2 = stack1.pop();
		System.out.print(" id " + tmpStudent2.hakbun +  "  name " + tmpStudent2.name);
	}

}
