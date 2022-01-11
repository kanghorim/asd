package week_6;

public class CDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CDLinkedList<String> c = new CDLinkedList<String>();
		c.insert("잠실"); //삽입
		c.insertAfter("잠실", "신천");
		c.insertAfter("신천", "종합운동장");
		c.insertAfter("종합운동장", "삼성");
		c.insertAfter("삼성", "선릉");
		c.insertAfter("선릉", "역삼");
		c.insertAfter("역삼", "강남");
		c.insertAfter("강남", "교대");
		c.insertAfter("교대", "서초");
		c.insertAfter("서초", "방배");
		c.insertAfter("방배", "사당");
		c.insertAfter("사당", "낙성대");
		c.insertAfter("낙성대", "서울대 입구");
		c.insertAfter("서울대 입구", "봉천");
		c.insertAfter("봉천", "신림");
		c.insertAfter("신림", "신대방");
		c.insertAfter("신대방", "구로디지털단지");
		c.insertAfter("구로디지털단지", "대림");
		c.insertAfter("대림", "신도림");
		c.insertAfter("신도림", "문래");
		c.insertAfter("문래", "영등포구청");
		c.insertAfter("영등포구청", "당산");
		c.insertAfter("당산", "합정");
		c.insertAfter("합정", "홍대입구");
		c.insertAfter("홍대입구", "신촌");
		c.insertAfter("신촌", "이대");
		c.insertAfter("이대", "아현");
		c.insertAfter("아현", "충정로");
		c.insertAfter("충정로", "시청");
		c.insertAfter("시청", "을지로입구");
		c.insertAfter("을지로입구", "을지로3가");
		c.insertAfter("을지로3가", "을지로4가");
		c.insertAfter("을지로4가", "동대문 역사문화 공원");
		c.insertAfter("동대문 역사문화 공원", "신당");
		c.insertAfter("신당", "상왕십리");
		c.insertAfter("상왕십리", "왕십리");
		c.insertAfter("왕십리", "한양대");
		c.insertAfter("한양대", "뚝섬");
		c.insertAfter("뚝섬", "성수");
		c.insertAfter("성수", "건대입구");
		c.insertAfter("건대입구", "구의");
		c.insertAfter("구의", "강변");
		c.insertAfter("강변", "잠실나루");
		c.printAll();
		c.numberOfStation("잠실", "왕십리");
		c.remove("잠실");
		c.printAll();
		c.insertAfter("방배", "별당");
		c.printAll();
		c.countTotalStation();
		System.out.println("\n전체역의 개수는:" + c.countTotalStation());
		/*c.insertAfter("월", "수"); //월 다음에 수 삽입
		//c.printAll();
		c.insertPrevious("수", "화"); // 수 이전에 화 삽입
		c.printAll();
		c.insertLast("목"); // 마지막에 목 추가
		c.printAll();
		c.insertFront("일"); // 처음에 일 추가 
		c.printAll();
		c.removeAfter("일"); // 일 다음에 있는 월 제거 
		c.printAll();
		c.removePrevious("목"); // 목요일날 앞에 있는 수 제거
		c.printAll();
		c.removePrevious("일"); // 이중연결이기 때문에 일 앞에 있는(실제론 뒤)
		// 목 삭제됨 
		c.printAll();
		c.removePrevious("일"); // 똑같이 일 앞에있지만 실제론 뒤에있는 화가 삭제
		c.printAll();
		c.removePrevious("일"); 
		c.printAll();*/
	}

}
