package week_3;

public class BinaryConversion {
	
	static void decToBin(int num, int base) {
		if (num>0) {
			decToBin(num/base, base);
			System.out.print(num%base);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int decNo = 20;
		System.out.print("������ " + decNo +"�� �������� ��ȯ -> ");
		decToBin(decNo, 2);
		System.out.println();
	}

}
