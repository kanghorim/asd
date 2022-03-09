class QNode{
	char data;
	QNode link;
}

class LinkedQueue implements Queue{
	QNode front;
	QNode rear;
		
	public LinkedQueue(){
		front = null;
		rear = null;		
	}
	
	public boolean isEmpty(){
		return (front == null);
	}
	
	public void enQueue(char item){
		QNode newNode = new QNode();
		newNode.data = item;
		newNode.link = null;
		if(isEmpty()){
			front = newNode;
			rear = newNode;
		}
		else {
			rear.link = newNode;
			rear = newNode;			
		}
		System.out.println("Inserted Item : " + item);
	}
	
	public char deQueue(){
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Queue is empty!!");
			return 0;
		}
		else{ 
			char item = front.data;
			front = front.link;
			if(front == null)
				rear = null;
			return item;
		}				
	}
	
	public void delete(){
		// 삭제하는 메소드
		if(front== null)
			isEmpty();
		else{
			front = front.link;
		}
	}
	
	public char peek(){
		// 선두원소 검색
		if(isEmpty())  
			return 0;
		else
			return front.data;
	}
	
	public void printQueue(){
		//큐 출력 함수
		QNode q = new QNode();
	
		q = front;
		while(q!= null){
			System.out.println(q.data);
			q = q.link;	
		}
	}
}

class ListQueueMain{
	public static void main(String args[]){		
		char deletedItem;
		LinkedQueue listQ = new LinkedQueue();
		
		listQ.enQueue('A');
		listQ.printQueue(); // A
		
		
		listQ.enQueue('B');
		listQ.printQueue(); //A B
		
		deletedItem = listQ.deQueue();
		if(deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		listQ.printQueue();
		
		System.out.print("현재 선두원소: ");
		System.out.println(listQ.peek());
		
		listQ.enQueue('C');
		listQ.printQueue();
		
		deletedItem = listQ.deQueue();
		if(deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		listQ.printQueue();

		deletedItem = listQ.deQueue();
		if(deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		listQ.printQueue();		
		deletedItem = listQ.deQueue();
		if(deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		listQ.printQueue();
        listQ.delete();
        }
}