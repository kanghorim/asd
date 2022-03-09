
class QlistNode {
	String name; // �̸�
	int priority; // ���� ��??
	QlistNode link; // ��ũ
}
class PQ {
	QlistNode front;
	int count = 0; // count
	public PQ(){
	}
	void enqueue(String name, int priority){
		QlistNode p;
		QlistNode newNode=new QlistNode();
		newNode.name=name;
		newNode.priority=priority;
		newNode.link=null;
		if((front==null)||(newNode.priority<front.priority)){ 
			newNode.link=front; 
			front=newNode;
		}
		else{
			p=front;
			while(p.link!=null && p.link.priority<=newNode.priority){
				p=p.link;
			}	
			newNode.link=p.link;
			p.link=newNode;
		}
		count++; // ��� ������ ��ġ�� ������ ���� ī���� ����
	}
	String dequeue(){
	    String name="";
		if(front==null){ System.out.println("Queue underflow");}
		else {name=front.name; front=front.link;}
		count--;
		return name;
	}
	int CountItem() { // count�� ���� �� ���� ������ ���� ���ϴ� �Լ�
		return count;
	}
	int numberofitem(){ // �⸻���� ����1
		int x=0;
		QlistNode p = front;
		while(p != null) {
			x++;
			p = p.link;
		}
		return x;
	}
	String peek(){ // �⸻���� ����2
		String name="";
		
		return front.name;
	}
	
	public void clear() { // �⸻���� ����3
		front = null;	
	}
	
}  

class ListPQMain {
	public static void main(String[] args){
		PQ listQ= new PQ();
		listQ.enqueue("Kim",30);
		listQ.enqueue("Lee",20);
		listQ.enqueue("Park",10);
		listQ.enqueue("Cho",70);
		
		
	
		
		
		System.out.println("������ ���� : "+listQ.CountItem());
		//listQ.clear();
		System.out.println("========== ���� �߰� �غ��� =============");
		listQ.enqueue("Seo", 45); // ���� �߰�
		
		
		System.out.println("���� �߰��� ��� count : "+listQ.CountItem());
		
		
		System.out.println("���� ���� : "+listQ.peek());
		System.out.println("======= ������ ���� ���� ==============");
		System.out.println(listQ.dequeue()); 
		System.out.println(listQ.dequeue()); 
		System.out.println(listQ.dequeue()); 
		System.out.println("������ ���� : "+listQ.CountItem());
		System.out.println(listQ.dequeue()); 
		System.out.println("������ ���� : "+listQ.CountItem());
		System.out.println(listQ.dequeue()); 
	}
}