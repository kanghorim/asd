package week_12; //AverageDeque
import java.util.*; // 입력 콘솔

class AverageDeque2 {
	int id; // 아이디를 저장할 변수
	String name; // 학생 이름
	int score; // 과목 점수
	public AverageDeque2(int id, String name, int score) { // 생성자 생성
		// 생성자의 형식매개변수를 할당받아 자동 저장
		this.id = id;  
		this.name = name;
		this.score = score;
	}
}

public class AverageDeque {
	public static void main(String[] args) { //MAIN
		Scanner in = new Scanner(System.in);
		Deque<DequeTest> deque = new LinkedList<DequeTest>(); // DequeTest자료형으로 저장받는 객체 생성(빵을 찍는다)
		DequeTest[] node = new DequeTest[10]; // 10명의 학생의 객체를 생성 (빵을 찍는다)
		
		int n; // 아이디 입력할 변수
		String name; // 이름 입력할 변수
		int score; // 점수 입력할 변수
		double ave=0; // 평균을 구할 변수
		
		int max=0; // 최대 점수 초기값 
		String Max_name = null; // 가장 점수가 높은 학생의 이름
		
		// 각 노드에 정보를 입력받아 저장하여 초기화
		for(int i= 0; i<node.length; i++){
			System.out.println("아이디 입력 :");
			n = in.nextInt(); // input Info
			System.out.println("이름 입력 :");
			name = in.next(); // input Info
			System.out.println("점수 입력: ");
			score = in.nextInt(); // input Info
			node[i]= new DequeTest(n,name,score);
		}
		
		// 순차적으로 deque에  추가
		for(int i=0; i<node.length; i++){
			deque.add(node[i]);
		}
		// DequeTest 형으로 iterator 객체변수에 deque에 iterator 인스턴스를 저장
		Iterator<DequeTest> iterator = deque.iterator();
		while (iterator.hasNext()) { // 다음 번째 원소가 없을때까지 출력한다
			DequeTest tmpNode= iterator.next();
			System.out.println("id : "+ tmpNode.id + "  name :"+ tmpNode.name+ "  score :"+tmpNode.score);
		}
		
		for(int i=0; i<node.length; i++){
			ave += node[i].score; // 평균 구하기
		}
		System.out.println("10명 학생들의 평균점수 : "+ave/node.length);
		
		
		
		// 역순으로 정렬
		Iterator <DequeTest> reverse = deque.descendingIterator();
		System.out.println("\n============= 역순으로 출력하기 ==================");
		while (reverse.hasNext()){ // 역순으로 하여 마지막 원소까지 출력
			DequeTest Rev = reverse.next();
			System.out.println("id : "+ Rev.id + "  name :"+ Rev.name+ "  score :"+Rev.score);
		}
		
		 //가장 점수가 높은 학생과 점수를 추출하기위한 과정
		for(int i=0; i<node.length; i++){
			if (node[i].score > max) {
				max = node[i].score;
				Max_name = node[i].name;
			}
		}
		System.out.println("가장높은 성적의 학생 이름 : "+ Max_name);
		
	}
}