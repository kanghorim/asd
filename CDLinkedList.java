package week_6;

public class CDLinkedList<T> implements ICircularDoubleLinkedList<T> {
	public CDNode<T> last;
	public CDNode<T> head;
	public int size;
	public CDLinkedList() {
		last = null;
		head = null;
		size = 0;

	}
	public void insert(T data) {
		CDNode<T> newNode = new CDNode<T>(null, data,null);
		
		if(size ==0) {
			head = newNode;
			last = newNode;
			newNode.rightLink = newNode;
			newNode.leftLink = newNode;
		}else {
			newNode.rightLink = head;
			newNode.leftLink = last;
			last.rightLink = newNode;
			head.leftLink = newNode;
			last = newNode;
		}
		size++;
	}
	@Override
	public boolean search(T data) {
		// TODO Auto-generated method stub
		CDNode<T> p = last;
		for(int i = 0; i<size; i++) {
			if(data==p.data) return true;
			p = p.rightLink;
		}
		return false;
	}
	public CDNode<T> findNode(T data){
		CDNode<T> p = last;
		for(int i = 0; i< size; i++) {
			if(data ==p.data) return p;
			p = p.rightLink;
		}
		return null;
	}
	@Override
	public void insertAfter(T target, T data) {
		// TODO Auto-generated method stub
		CDNode<T> newNode = new CDNode<T>(null, data,null);
		if(size == 0) {
			newNode.rightLink = newNode;
			newNode.leftLink = newNode;
			last = newNode;
			head = newNode;
		}else {
			if(search(target)) {
				CDNode<T> t = findNode(target);
				CDNode<T> p = t.rightLink;
				t = p.leftLink;
				
				newNode.leftLink = t;
				newNode.rightLink = p;
				t.rightLink = newNode;
				p.leftLink = newNode;
			}
		}
		size++;
	}
	@Override
	public void insertPrevious(T target, T data) {
		// TODO Auto-generated method stub
		CDNode<T> newNode = new CDNode<T>(null, data,null);
		if(last == null) {
			newNode.rightLink = newNode;
			newNode.leftLink = newNode;
			last = newNode;
		}else {
			if(search(target)) {
				CDNode<T> t = findNode(target);
				CDNode<T> p= t.leftLink;
				t = p.rightLink;
				
				newNode.leftLink = p;
				newNode.rightLink = t;
				p.rightLink = newNode;
				t.leftLink = newNode;
				if(t==last) {
					last = newNode;
				}
			}
		}
		size++;
	}
	@Override
	public void insertFront(T data) {
		// TODO Auto-generated method stub
		CDNode<T> newNode = new CDNode<T>(null, data,null);
		if(last == null) {
			newNode.rightLink = newNode;
			newNode.leftLink = newNode;
			last = newNode;
		}else {
			CDNode<T> p = last.leftLink;
			p.rightLink = last;
			
			newNode.leftLink = p;
			newNode.rightLink = last;
			p.rightLink = newNode;
			last.leftLink = newNode;
			
			last = newNode;
		}
		size++;
	}
	@Override
	public void insertLast(T data) {
		// TODO Auto-generated method stub
		CDNode<T> newNode = new CDNode<T>(null, data,null);
		if(last == null) {
			newNode.rightLink = newNode;
			newNode.leftLink = newNode;
			last = newNode;
		}else {
			CDNode<T> p = last.leftLink;
			p.rightLink = last;
			
			newNode.leftLink = p;
			newNode.rightLink = last;
			p.rightLink = newNode;
			last.leftLink = newNode;
			
			
		}
		size++;
	}
	
	@Override
	public void removeAfter(T target) {
		// TODO Auto-generated method stub
		
		CDNode<T> t = findNode(target);
		if (last == null) {
			System.out.println("데이터가 없습니다.");
		}
		else if(size == 1) {
			last = null;
			size--;
		}
		else {
			CDNode<T> p = t.rightLink.rightLink;
			t = p.leftLink.leftLink;
			
			t.rightLink = p;
			p.leftLink = t;
			size--;
		}
	}
	@Override
	public void removePrevious(T target) {
		// TODO Auto-generated method stub
		CDNode<T> t = findNode(target);
		if (last == null) {
			System.out.println("데이터가 없습니다.");
		}
		else if(size == 1) {
			last = null;
			size--;
		}
		else {
			CDNode<T> p = t.leftLink.leftLink;
			t = p.rightLink.rightLink;
			
			p.rightLink = t;
			t.leftLink = p;
			size--;
		}
	}
	public void remove(T target) {
		// TODO Auto-generated method stub
		CDNode<T> t = findNode(target);
		if(t==null) { System.out.println("삭제하려는 역이 없습니다.");
			return;
		}
//		if (last == null) {
//			System.out.println("데이터가 없습니다.");
//		}
//		else if(size == 1) {
//			last = null;
//			size--;
//		}
		else {//역이 있음
//			CDNode<T> p = t.leftLink.leftLink;
//			t = p.rightLink.rightLink;
//			
//			p.rightLink = t;
//			t.leftLink = p;
			t.leftLink.rightLink=t.rightLink;
			t.rightLink.leftLink=t.leftLink;
			size--;
			if(size==0) { head=null; last=null;}
		}
	}
	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		if (last == null) {
			System.out.println("데이터가 없습니다.");
		}
		else {
			System.out.print("List =[");
			for(int i = 0; i<size; i++) {
				System.out.print(last.data+", ");
				last = last.rightLink;
			}
			System.out.println("]");
		}
	}
	public void numberOfStation(String a, String b) {
		CDNode<T> p, p2;
		p = head;
		p2 = head;

		int cnt = 0;
		int cnt1 = 0;

		do {
			if (p.data.equals(a)) {
				break;
			}
			cnt++;
			p = p.leftLink;
		} while (p != head);

		do {
			if (p2.data.equals(b)) {
				break;
			}
			cnt1++;
			p2 = p2.leftLink;
		} while (p2 != head);

		int cnt2 = 0;
		int value = 0;
		int value1 = 0;
		if (cnt < cnt1) {
			cnt2 = 43 - cnt1;

			value = cnt2 + cnt - 1;

		} else if (cnt > cnt1) {
			cnt2 = 43 - cnt;

			value = cnt1 + cnt2 - 1;

		} else {
			return;
		}
		if (cnt < cnt1) {
			value1 = cnt1 - cnt - 1;

		} else if (cnt > cnt1) {
			value1 = cnt - cnt1 - 1;
		} else {
			return;
		}
		if (value1 > value) {
			System.out.println(a + "역과 " + b + "역 사이에 정거장 수:" + value);
		} else {
			System.out.println(a + "역과 " + b + "역 사이에 정거장 수:" + value1);
		}
	}
	public int countTotalStation() {
		return size++;
	}
	}
