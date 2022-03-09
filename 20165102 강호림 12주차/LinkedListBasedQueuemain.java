

class ListNodeQueue{
	Object data;
	ListNodeQueue link;
}
class Queue{
	ListNodeQueue front;
	ListNodeQueue rear;
	int count;
	public Queue() {
		front=null;
		rear=null;
		count=0;
	}
	public void enqueue(Object x) {
		ListNodeQueue tmpNode=new ListNodeQueue();
		tmpNode.data=x;
		tmpNode.link=null;
		if(front==null) {
			front=tmpNode;
			rear=tmpNode;
			count=1;
		}else {
			rear.link=tmpNode;
			rear=tmpNode;
			count++;
		}
	}
	public Object dequeue() {
		if(isEmpty()) {
			System.out.println("Queue Empty");
			return null;
		}else {
			Object item=front.data;
			front=front.link;
			if(front==null) {
				rear=null;
			}
			count--;
			return item;
		}
	}
	private boolean isEmpty() {
		return (count==0);
	}
	public Object peek() {
		if(count==0)return null;
		else return front.data;
	}
	public void delete() {
		front.data=null;
		count--;
	}
	public void queueSize() {
		System.out.println("Queue Size = "+count);
	}
}
public class LinkedListBasedQueuemain {
	public static void main(String[] args) {
		Queue q2=new Queue();
		
		q2.enqueue("Kim");
		q2.enqueue("Park");
		q2.enqueue("Lee");
		q2.enqueue("kang");
		
		System.out.println(q2.dequeue());
		System.out.println(q2.dequeue());
		System.out.println(q2.dequeue());
		System.out.println(q2.dequeue());
		
		q2.enqueue(1);
		q2.enqueue(2);
		
		int x=(int)q2.dequeue()+(int)q2.dequeue();
		System.out.println(x);
		
	}

}
