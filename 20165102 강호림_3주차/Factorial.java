package week_3;
import java.util.Scanner;
public class Factorial {
		public static int faciter(int n) {
			
			int faciter = 1;
			for (int i = n; i > 0; i--) { // �ι��� ���
				faciter=faciter*i;
			} return faciter;
		}
		public static void main(String[] args) {
		int n = 10; //n ����, 10���� �ʱ�ȭ
		System.out.println(faciter(n));//��� ���
		}
		}
