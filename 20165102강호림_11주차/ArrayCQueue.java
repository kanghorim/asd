class ArrayCQueue implements Queue {
	private int front;
	private int rear;
	private int count;
	private int queueSize;
	private char itemArray[];

	public ArrayCQueue(int queueSize) {
		front = 0;
		rear = 0;
		count = 0;
		this.queueSize = queueSize;
		itemArray = new char[this.queueSize];
	}

	public boolean isEmpty() { // front�� rear�� ������ = �̶��� ����������� �����Ѵ�
		return (front == rear);
	}

	public boolean isFull() { // front�� rear�� ������ = �̶��� ���Ұ� ����á������ �����Ѵ�.
		return (((rear + 1) % this.queueSize) == front);
	}

	public void enQueue(char item) {
		// if (isFull()) {
		if (((rear + 1) % this.queueSize) == front) {
			System.out.println("Inserting fail! Array Circular Queue is full!!");
			// Queue Full�϶� Queue size�� 5�� ������Ű��.
			int oldSize = this.queueSize;
			queueSize += 5;
			char copyArray[] = new char[queueSize];
			for (int i = 1; i <= count; i++) {
				copyArray[i] = itemArray[(front + i) % oldSize];
			}
			itemArray = copyArray;
			front = 0;
			rear = count;
			rear = (rear + 1) % this.queueSize;
			itemArray[rear] = item;
			count++;
			System.out.println("Inserted Item : " + item);

		} 
		else {
			rear = (rear + 1) % this.queueSize;
			itemArray[rear] = item;
			count++;
			System.out.println("Inserted Item : " + item);

		}
	}

	public char deQueue() {
		if (isEmpty()) {
			System.out.println("�迭�� ���Ұ� ����ֽ��ϴ�. null!");
			return 1;
		}
		if (front == rear) {
			System.out.println("Deleting fail! Array  Circular Queue is empty!!");
			return 0;
		} else {
			front = (front + 1) % this.queueSize;
			count--;
			return itemArray[front];
		}

	}

	// Queue�� ���� ���Ҹ� �����϶�. ���ŵ� �������� �������� �ʴ´�.
	public void delete() { // ���� ���� �޼ҵ�
		if (isEmpty())
			System.out.println("���Ұ� ����ֽ��ϴ�.");
		else {
			front = (front + 1) % this.queueSize;
			count--;
		}
	}

	// ���� ������ ���� return�϶�. �̶� ť�� ������ ������ �ʴ´�.
	public char peek() { // ���ο��� �˻� �޼ҵ�
		if (isEmpty()) // ���Ұ� ����ִٸ� 0�� ���ڸ���ȯ
			return 0;
		else {
			return itemArray[front + 1];
		}
	}

	public void printQueue() { // ť�� ����ϴ� �޼ҵ�
		for (int i = 1; i <= count; i++)
			System.out.println(itemArray[(front + i) % queueSize]);

	}
}

class ArrayQueueMain {
	public static void main(String args[]) {
		int queueSize = 4;
		char deletedItem;
		ArrayCQueue cQ = new ArrayCQueue(queueSize);

		cQ.enQueue('A');
		cQ.printQueue();

		cQ.enQueue('B');
		cQ.printQueue();

		deletedItem = cQ.deQueue(); // A�� ����
		if (deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		cQ.printQueue();

		cQ.enQueue('C');
		cQ.printQueue();

		cQ.enQueue('D');
		cQ.printQueue();

		cQ.enQueue('E');
		cQ.printQueue();

		System.out.println("���� ���� ���� : "+cQ.peek());
		cQ.delete(); // ���� ���� ���� ���� ���� -> B�� ����
		//cQ.printQueue();
		System.out.print("���� ���ο���: ");
		System.out.println(cQ.peek());

		//cQ.printQueue();
	}
}