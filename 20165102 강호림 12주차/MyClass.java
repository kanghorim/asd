import java.util.Comparator;
import java.util.PriorityQueue;

class MyClass {
	int id; // 학생 id 
	String name; // 학생 이름

	public MyClass(int id, String name) { // 생성자 선언
		this.id = id; // 각 변수를 직접 할당받아 생성자 내에서 저장
		this.name = name;
	}
}

class PQCompObj {
	public static void main(String[] args) {
		Comparator<MyClass> comparator = new MyClassComparator(); // MyClass형 변수 객체 선언 및 생성
		PriorityQueue<MyClass> queue = new PriorityQueue<MyClass>(10, comparator);
		MyClass n1 = new MyClass(300, "Kim");
		MyClass n2 = new MyClass(100, "Lee");
		MyClass n3 = new MyClass(200, "Park");
		MyClass n4 = new MyClass(400, "Choi");
		
		queue.add(n1);
		queue.add(n2);
		queue.add(n3);
		queue.add(n4);

		while (queue.size() != 0) {
			System.out.println(queue.remove());
		}
	}
}

class MyClassComparator implements Comparator<MyClass> {
	@Override
	public int compare(MyClass x, MyClass y) {
		// Assume neither string is null. Real code should
		// probably be more robust
		// You could also just return x.length() - y.length(),
		// which would be more efficient.
		if (x.id < y.id) {
			return -1;
		}
		if (x.id > y.id) {
			return 1;
		}
		return 0;
	}
}