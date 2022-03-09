package 우선순위큐;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyClass {
	int id;
	String name;
	int score;

	public MyClass(int id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}
}

class MyClassComparator implements Comparator<MyClass> {
	@Override
	public int compare(MyClass x, MyClass y) {
		// Assume neither string is null. Real code should
		// probably be more robust
		// You could also just return x.length() - y.length(),
		// which would be more efficient.
		if (x.score < y.score) {
			return 1;
		}
		if (x.score > y.score) {
			return -1;
		}
		return 0;
	}
}

public class PQCompObj {
	public static void main(String[] args) {
		Comparator<MyClass> comparator = new MyClassComparator();
		PriorityQueue<MyClass> queue = new PriorityQueue<MyClass>(10, comparator);
		MyClass n1 = new MyClass(1, "Kim", 88);
		MyClass n2 = new MyClass(2, "Lee", 68);
		MyClass n3 = new MyClass(3, "Park", 98);
		MyClass n4 = new MyClass(4, "Choi", 55);
		MyClass n5 = new MyClass(5, "Son", 100);
		MyClass n6 = new MyClass(6, "Yoo", 30);
		MyClass n7 = new MyClass(7, "Jo", 10);
		MyClass n8 = new MyClass(8, "Ji", 32);
		MyClass n9 = new MyClass(9, "Yoon", 73);
		MyClass n10 = new MyClass(10, "Han", 20);

		queue.add(n1);
		queue.add(n2);
		queue.add(n3);
		queue.add(n4);
		queue.add(n5);
		queue.add(n6);
		queue.add(n7);
		queue.add(n8);
		queue.add(n9);
		queue.add(n10);

		while (queue.size() != 0) {
			MyClass n = queue.remove();
			System.out.println(n.id + "	" + n.name + "		" + n.score);

		}
	}
}
