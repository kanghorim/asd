package week_3;
import java.util.Scanner;
public class Factorial {
		public static int faciter(int n) {
			
			int faciter = 1;
			for (int i = n; i > 0; i--) { // 두번쨰 방법
				faciter=faciter*i;
			} return faciter;
		}
		public static void main(String[] args) {
		int n = 10; //n 생성, 10으로 초기화
		System.out.println(faciter(n));//결과 출력
		}
		}
