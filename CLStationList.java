package week_6;
class CNode {
	String data;
	CNode next;

}

public class CLStationList {
	CNode head;
	int cnt = 0;
	int cnt1=0;

	public void deleteNode(String a) {
		CNode pre, cun;
		cun = head.next;
		pre = head;
		if (head == null) {
			return;
		} else if (head.next == head) {
			head = null;
			cnt1--;
			return;
		} else {
			while (cun.next != head) {

				if (cun.data.equals(a)) {
					break;
				}
				pre = pre.next;
				cun = cun.next;

			}
			cnt1--;
			pre.next = cun.next;
		}

	}

	public void addNode(String a, String b) {
		CNode per, cun;
		per = head;
		cun = head.next;
		CNode newNode = new CNode();
		newNode.data = b;
		do {
			if (per.data.equals(a)) {
				break;
			}

			cun = cun.next;
			per = per.next;
		} while (per != head);

		if (per.next == head) {
			newNode.next = head;
			per.next = newNode;
			cnt1++;
		} else {
			newNode.next = cun.next;
			per.next = newNode;
			cnt1++;
		}

	}

	public void addLast(String a) {
		CNode newNode = new CNode();
		newNode.data = a;
		CNode p;
		p = head;
		if (p == null) {
			head = newNode;
			cnt1++;
			newNode.next = head;
		} else {
			do {
				p = p.next;
			} while (p.next != head);
			p.next = newNode;
			cnt1++;
			newNode.next = head;
		}
	}

	public void addFirst(String a) {
		CNode newNode = new CNode();
		CNode p;
		newNode.data = a;
		p = head;
		if (p == null) {
			head = newNode;
			newNode.next = head;
			
		} else {
			newNode.next = head;
			do {
				p = p.next;
			} while (p.next != head);
			p.next = newNode;
			head = newNode;
			
		}
	}

	public void numberOfStation(String a, String b) {
		CNode p, p2;
		p = head;
		p2 = head;

		int cnt = 0;
		int cnt1 = 0;

		do {
			if (p.data.equals(a)) {
				break;
			}
			cnt++;
			p = p.next;
		} while (p != head);

		do {
			if (p2.data.equals(b)) {
				break;
			}
			cnt1++;
			p2 = p2.next;
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

	public void print() {
		CNode p;
		p = head;

		do {
			
				cnt++;
				System.out.print(" " + p.data + "->");
				p = p.next;
			

		} while (p != head);
	}

	public int countTotalStation() {
		return cnt1++;
	}

	public static void main(String[] args) {

		CLStationList cl1 = new CLStationList();

		cl1.addLast("잠실");
		cl1.addLast("신천");
		cl1.addLast("종합운동장");
		cl1.addLast("삼성");
		cl1.addLast("선릉");
		cl1.addLast("역삼");
		cl1.addLast("강남");
		cl1.addLast("교대");
		cl1.addLast("서초");
		cl1.addLast("방배");
		cl1.addLast("사당");
		cl1.addLast("낙성대");
		cl1.addLast("서울대입구");
		cl1.addLast("봉천");
		cl1.addLast("신림");
		cl1.addLast("신대방");
		cl1.addLast("구로디지털단지");
		cl1.addLast("대림");
		cl1.addLast("신도림");
		cl1.addLast("문래");
		cl1.addLast("영등포구청");
		cl1.addLast("당산");
		cl1.addLast("합정");
		cl1.addLast("홍대입구");
		cl1.addLast("신촌");
		cl1.addLast("이대");
		cl1.addLast("아현");
		cl1.addLast("충정로");
		cl1.addLast("시청");
		cl1.addLast("을지로입구");
		cl1.addLast("을지로3가");
		cl1.addLast("을지로4가");
		cl1.addLast("동대문역사문화공원");
		cl1.addLast("신당");
		cl1.addLast("상왕십리");
		cl1.addLast("왕십리");
		cl1.addLast("한양대");
		cl1.addLast("뚝섬");
		cl1.addLast("성수");
		cl1.addLast("건대입구");
		cl1.addLast("구의");
		cl1.addLast("강변");
		cl1.addLast("잠실나루");

		cl1.numberOfStation("잠실", "왕십리");
		cl1.print();
		cl1.countTotalStation();
		//cl1.deleteNode("잠실");
		cl1.print();
		cl1.print();
		cl1.print();
		System.out.println("\n전체역의 개수는:" + cl1.countTotalStation());

	}
}

