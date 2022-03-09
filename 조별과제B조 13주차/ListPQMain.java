package 우선순위큐;

class QlistNode {
	String name;
	int priority;
	QlistNode link;
}

class PQ {
	QlistNode front;

	public PQ() {
	}

	void enqueue(String name, int priority) {
		QlistNode p;
		QlistNode newNode = new QlistNode();
		newNode.name = name;
		newNode.priority = priority;
		newNode.link = null;
		if ((front == null) || (newNode.priority < front.priority)) {
			newNode.link = front;
			front = newNode;
		} else {
			p = front;
			while (p.link != null && p.link.priority <= newNode.priority) {
				p = p.link;
			}
			newNode.link = p.link;
			p.link = newNode;
		}
	}

	String dequeue() {
		String name = "";
		if (front == null) {
			System.out.println("Queue underflow");
		} else {
			name = front.name;
			front = front.link;
		}
		return name;
	}

	int numberofitem() {
		int x = 0;
		QlistNode p = front;
		while (p != null) {
			p = p.link;
			x++;
		}
		return x;
	}

	String peek() {
		String name = "";
		if (front == null) {
			return null;
		}
		return front.name;
	}

	public void clear() {
		front = null;
	}
}

public class ListPQMain {
	public static void main(String[] args) {
		PQ listQ = new PQ();
		listQ.enqueue("Kim", 30);
		listQ.enqueue("Lee", 20);
		listQ.enqueue("Pak", 10);
		listQ.enqueue("Cho", 70);
		listQ.enqueue("Son", 100);
		System.out.println("q size : " + listQ.numberofitem());
		System.out.println("peek : " + listQ.peek());
		System.out.println(listQ.dequeue());
		System.out.println(listQ.dequeue());
		System.out.println(listQ.dequeue());
		System.out.println(listQ.dequeue());
		System.out.println(listQ.dequeue());
		listQ.clear();
		System.out.println(listQ.dequeue());
	}
}