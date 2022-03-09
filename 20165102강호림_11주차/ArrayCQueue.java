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

	public boolean isEmpty() { // front와 rear이 같을때 = 이때는 비어있을때로 가정한다
		return (front == rear);
	}

	public boolean isFull() { // front와 rear이 같을때 = 이때는 원소가 가득찼을때로 가정한다.
		return (((rear + 1) % this.queueSize) == front);
	}

	public void enQueue(char item) {
		// if (isFull()) {
		if (((rear + 1) % this.queueSize) == front) {
			System.out.println("Inserting fail! Array Circular Queue is full!!");
			// Queue Full일때 Queue size를 5개 증가시키라.
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
			System.out.println("배열의 원소가 비어있습니다. null!");
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

	// Queue의 선두 원소를 제거하라. 제거된 아이템을 리턴하지 않는다.
	public void delete() { // 원소 삭제 메소드
		if (isEmpty())
			System.out.println("원소가 비어있습니다.");
		else {
			front = (front + 1) % this.queueSize;
			count--;
		}
	}

	// 선두 원소의 값을 return하라. 이때 큐의 내용은 변하지 않는다.
	public char peek() { // 선두원소 검색 메소드
		if (isEmpty()) // 원소가 비어있다면 0의 문자를반환
			return 0;
		else {
			return itemArray[front + 1];
		}
	}

	public void printQueue() { // 큐를 출력하는 메소드
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

		deletedItem = cQ.deQueue(); // A를 삭제
		if (deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		cQ.printQueue();

		cQ.enQueue('C');
		cQ.printQueue();

		cQ.enQueue('D');
		cQ.printQueue();

		cQ.enQueue('E');
		cQ.printQueue();

		System.out.println("선두 원소 삭제 : "+cQ.peek());
		cQ.delete(); // 가장 먼저 들어온 원소 삭제 -> B를 삭제
		//cQ.printQueue();
		System.out.print("현재 선두원소: ");
		System.out.println(cQ.peek());

		//cQ.printQueue();
	}
}