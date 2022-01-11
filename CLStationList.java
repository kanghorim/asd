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
			System.out.println(a + "���� " + b + "�� ���̿� ������ ��:" + value);
		} else {
			System.out.println(a + "���� " + b + "�� ���̿� ������ ��:" + value1);
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

		cl1.addLast("���");
		cl1.addLast("��õ");
		cl1.addLast("���տ��");
		cl1.addLast("�Ｚ");
		cl1.addLast("����");
		cl1.addLast("����");
		cl1.addLast("����");
		cl1.addLast("����");
		cl1.addLast("����");
		cl1.addLast("���");
		cl1.addLast("���");
		cl1.addLast("������");
		cl1.addLast("������Ա�");
		cl1.addLast("��õ");
		cl1.addLast("�Ÿ�");
		cl1.addLast("�Ŵ��");
		cl1.addLast("���ε����д���");
		cl1.addLast("�븲");
		cl1.addLast("�ŵ���");
		cl1.addLast("����");
		cl1.addLast("��������û");
		cl1.addLast("���");
		cl1.addLast("����");
		cl1.addLast("ȫ���Ա�");
		cl1.addLast("����");
		cl1.addLast("�̴�");
		cl1.addLast("����");
		cl1.addLast("������");
		cl1.addLast("��û");
		cl1.addLast("�������Ա�");
		cl1.addLast("������3��");
		cl1.addLast("������4��");
		cl1.addLast("���빮���繮ȭ����");
		cl1.addLast("�Ŵ�");
		cl1.addLast("��սʸ�");
		cl1.addLast("�սʸ�");
		cl1.addLast("�Ѿ��");
		cl1.addLast("�Ҽ�");
		cl1.addLast("����");
		cl1.addLast("�Ǵ��Ա�");
		cl1.addLast("����");
		cl1.addLast("����");
		cl1.addLast("��ǳ���");

		cl1.numberOfStation("���", "�սʸ�");
		cl1.print();
		cl1.countTotalStation();
		//cl1.deleteNode("���");
		cl1.print();
		cl1.print();
		cl1.print();
		System.out.println("\n��ü���� ������:" + cl1.countTotalStation());

	}
}

