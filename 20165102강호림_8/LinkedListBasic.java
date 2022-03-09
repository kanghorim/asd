package week_5;
import java.util.ArrayList;
import java.util.Arrays; 
class LinkedList2 {
	String data;
	LinkedList2 link;
}

public class LinkedListBasic {

	public static void main(String[] ar) {
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("pineapple"); // 선두에 원소 추가
		alist.add("apple");
		alist.add("strawberry");
		alist.add("orange");
		alist.add("banana");
		alist.add("melon"); 
		System.out.println(alist);
		alist.remove(1);//2번원소 제거
		int numberOfItems = alist.size();
		System.out.println(numberOfItems);//원소 개수 출력
		alist.add("durian");
		System.out.println(alist);
		alist.set(2, "grape");
		System.out.println(alist);
		
		
		
		//alist.remove("Steve");
		//System.out.println(alist);
		//alist.set(4, "Kim");
		//System.out.println(alist);
		
		
		//alist.contains("Kim");
		//int post = alist.indexOf("Kim");
	}

}

//		tmp= new LinkedList2();
//		tmp.data="apple"; tmp.link=null;
//		list2 = tmp;
		// 선두에 원소추가하라
		// 2. list2 = ("pineapple", "apple", "strawberry", "orange", "banana", "melon")
		// 만들어라
		// 두번째 원소를 제거하라.
		// 3. list2 = ("pineapple", "strawberry", "orange", "banana", "melon")
		// 4. list2의 원소의 개수를 계산하여 출력하라.
		// 5. list2의 마지막에 "durian"을 추가하라
		// list2 = ("pineapple", "strawberry", "orange", "banana", "melon", "durian")
		// 6. 세번째 원소인 "orange"를 "grape"로 변경하라
	