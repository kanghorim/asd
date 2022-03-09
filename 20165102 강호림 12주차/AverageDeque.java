package week_12; //AverageDeque
import java.util.*; // �Է� �ܼ�

class AverageDeque2 {
	int id; // ���̵� ������ ����
	String name; // �л� �̸�
	int score; // ���� ����
	public AverageDeque2(int id, String name, int score) { // ������ ����
		// �������� ���ĸŰ������� �Ҵ�޾� �ڵ� ����
		this.id = id;  
		this.name = name;
		this.score = score;
	}
}

public class AverageDeque {
	public static void main(String[] args) { //MAIN
		Scanner in = new Scanner(System.in);
		Deque<DequeTest> deque = new LinkedList<DequeTest>(); // DequeTest�ڷ������� ����޴� ��ü ����(���� ��´�)
		DequeTest[] node = new DequeTest[10]; // 10���� �л��� ��ü�� ���� (���� ��´�)
		
		int n; // ���̵� �Է��� ����
		String name; // �̸� �Է��� ����
		int score; // ���� �Է��� ����
		double ave=0; // ����� ���� ����
		
		int max=0; // �ִ� ���� �ʱⰪ 
		String Max_name = null; // ���� ������ ���� �л��� �̸�
		
		// �� ��忡 ������ �Է¹޾� �����Ͽ� �ʱ�ȭ
		for(int i= 0; i<node.length; i++){
			System.out.println("���̵� �Է� :");
			n = in.nextInt(); // input Info
			System.out.println("�̸� �Է� :");
			name = in.next(); // input Info
			System.out.println("���� �Է�: ");
			score = in.nextInt(); // input Info
			node[i]= new DequeTest(n,name,score);
		}
		
		// ���������� deque��  �߰�
		for(int i=0; i<node.length; i++){
			deque.add(node[i]);
		}
		// DequeTest ������ iterator ��ü������ deque�� iterator �ν��Ͻ��� ����
		Iterator<DequeTest> iterator = deque.iterator();
		while (iterator.hasNext()) { // ���� ��° ���Ұ� ���������� ����Ѵ�
			DequeTest tmpNode= iterator.next();
			System.out.println("id : "+ tmpNode.id + "  name :"+ tmpNode.name+ "  score :"+tmpNode.score);
		}
		
		for(int i=0; i<node.length; i++){
			ave += node[i].score; // ��� ���ϱ�
		}
		System.out.println("10�� �л����� ������� : "+ave/node.length);
		
		
		
		// �������� ����
		Iterator <DequeTest> reverse = deque.descendingIterator();
		System.out.println("\n============= �������� ����ϱ� ==================");
		while (reverse.hasNext()){ // �������� �Ͽ� ������ ���ұ��� ���
			DequeTest Rev = reverse.next();
			System.out.println("id : "+ Rev.id + "  name :"+ Rev.name+ "  score :"+Rev.score);
		}
		
		 //���� ������ ���� �л��� ������ �����ϱ����� ����
		for(int i=0; i<node.length; i++){
			if (node[i].score > max) {
				max = node[i].score;
				Max_name = node[i].name;
			}
		}
		System.out.println("������� ������ �л� �̸� : "+ Max_name);
		
	}
}