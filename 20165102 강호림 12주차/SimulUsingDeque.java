package week_12; 
class Node {
	public int data;
	public Node next; // right link
	public Node prev; // left link
}

class Deque {

	Node head;
	Node tail;
	int count;

	public Deque() {
		head = null;
		tail = null;
		count = 0;
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.prev = null;
		newNode.next = null;
		if (head != null) { // 원소가 존재하면
			head.prev = newNode;
			newNode.next = head;
		}
		head = newNode;
		if (tail == null) {
			tail = newNode;
		}
		count++;

	}

	public Node deleteFirst() {
		if (head == null) {
			System.out.println("원소없음");
			return null;
		}
		Node tmpNode = head;
		head = head.next;
		if (head != null) {
			head.prev = null;
		}
		count--;
		if (head == null) {
			tail = null;
		}

		return tmpNode;
	}

	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.prev = tail;
		newNode.next = null;
		if (tail != null) { // 원소존재
			tail.next = newNode;
		}
		tail = newNode;
		if (head == null) {
			head = newNode;
		}
		count++;
	}

	public Node deleteLast() {
		if (tail == null) {
			System.out.println("원소없음");
			return null;
		}
		Node tmpNode = tail;
		tail = tail.prev;
		if (tail != null) {
			tail.next = null;
		}
		count--;
		if (tail == null) {
			head = null;
		}

		return tmpNode;
	}

	public void printDQ() {
		Node p = head;
		if (p != null) {
			while (p != tail) {
				System.out.print(" " + p.data);
				p = p.next;
			}
			System.out.println(" " + p.data);
		}else {
			System.out.println("원소없음");
		}
	}
}
class Stack{
	Deque dq1 = new Deque();
	public void push(int x) {
		dq1.insertFirst(x);
	}
	public int pop() {
		Node x = dq1.deleteFirst();
		return x.data;
	}
}

public class SimulUsingDeque {

	public static void main(String[] args) {

		Deque dq1 = new Deque();
		/*
		dq1.insertFirst(10);
		dq1.insertFirst(30);
		dq1.printDQ();
		dq1.deleteFirst();
		dq1.printDQ();
		dq1.insertLast(20);
		dq1.printDQ();
		dq1.deleteLast();
		dq1.printDQ();
		*/
		Stack stack1 = new Stack();
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		stack1.push(40);
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
	}
}
