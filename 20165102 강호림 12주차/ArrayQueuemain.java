

class ArrayQueue{
	int front, rear, count;
	private String[] q;
	public void enqueue(String item) {
		if((rear+1)%q.length==front) {
			resize(2*q.length);
		}
		rear=(rear+1)%q.length;
		q[rear]=item;
	}
	private void resize(int i) {
		String[] t=new String[i];
		for(int l=1, j=front+1; l<count+1; l++, j++) {
			t[i]=q[j%q.length];
		}
		front=0;
		rear=count;
		q=t;
	}
	public void printQueue() {
		for(int i=front+1; i<=rear; i++) {
			System.out.println(" "+q[i]);
		}
	}
	public String dequeue() {
		if(front==rear) {
			System.out.println("Queue Underflow");
			return null;
		}
		front=(front+1)%q.length;
		String item=q[front];
		count--;
		return item;
	}
	private boolean isEmpty() {
		return (count==0);
	}
	public Object peek() {
		if(front==rear) {
			return null;
		}
		else {
			return q[front];
		}
	}
	public void delete() {
		q[front]=null;
		count--;
	}
	public ArrayQueue() {
		front=0;
		rear=0;
		count=0;
		q=(String[]) new String[10];
	}
	public void queueSize() {
		System.out.println("size = "+count);
	}
}
public class ArrayQueuemain {
	public static void main(String[] args) {
		
		ArrayQueue q1=new ArrayQueue();
		q1.enqueue("Kim");
		q1.enqueue("Lee");
		q1.enqueue("Park");
		
		
		System.out.print(q1.peek());
		q1.printQueue();	
		
	}

}
