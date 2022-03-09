
class QlistNode {
	String name; // 이름
	int priority; // 선두 값??
	QlistNode link; // 링크
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
		count++; // 모든 실행을 마치면 원소의 개수 카운팅 시작
	}
	String dequeue(){
	    String name="";
		if(front==null){ System.out.println("Queue underflow");}
		else {name=front.name; front=front.link;}
		count--;
		return name;
	}
	int CountItem() { // count가 있을 때 쓰는 원소의 개수 구하는 함수
		return count;
	}
	int numberofitem(){ // 기말시험 예상1
		int x=0;
		QlistNode p = front;
		while(p != null) {
			x++;
			p = p.link;
		}
		return x;
	}
	String peek(){ // 기말시험 예상2
		String name="";
		
		return front.name;
	}
	
	public void clear() { // 기말시험 예상3
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
		
		
	
		
		
		System.out.println("원소의 개수 : "+listQ.CountItem());
		//listQ.clear();
		System.out.println("========== 원소 추가 해보자 =============");
		listQ.enqueue("Seo", 45); // 원소 추가
		
		
		System.out.println("원소 추가된 결과 count : "+listQ.CountItem());
		
		
		System.out.println("선두 원소 : "+listQ.peek());
		System.out.println("======= 순차적 원소 삭제 ==============");
		System.out.println(listQ.dequeue()); 
		System.out.println(listQ.dequeue()); 
		System.out.println(listQ.dequeue()); 
		System.out.println("원소의 개수 : "+listQ.CountItem());
		System.out.println(listQ.dequeue()); 
		System.out.println("원소의 개수 : "+listQ.CountItem());
		System.out.println(listQ.dequeue()); 
	}
}