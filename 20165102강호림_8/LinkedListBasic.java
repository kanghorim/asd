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
		alist.add("pineapple"); // ���ο� ���� �߰�
		alist.add("apple");
		alist.add("strawberry");
		alist.add("orange");
		alist.add("banana");
		alist.add("melon"); 
		System.out.println(alist);
		alist.remove(1);//2������ ����
		int numberOfItems = alist.size();
		System.out.println(numberOfItems);//���� ���� ���
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
		// ���ο� �����߰��϶�
		// 2. list2 = ("pineapple", "apple", "strawberry", "orange", "banana", "melon")
		// ������
		// �ι�° ���Ҹ� �����϶�.
		// 3. list2 = ("pineapple", "strawberry", "orange", "banana", "melon")
		// 4. list2�� ������ ������ ����Ͽ� ����϶�.
		// 5. list2�� �������� "durian"�� �߰��϶�
		// list2 = ("pineapple", "strawberry", "orange", "banana", "melon", "durian")
		// 6. ����° ������ "orange"�� "grape"�� �����϶�
	