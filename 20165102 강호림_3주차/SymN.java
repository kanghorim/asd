package week_3;

public class SymN {
	public static int sumrec(int n) {
		if(n == 1) { //n이 1이면
			return 1; //1 리턴
		}
		int result = n + sumrec(n - 1); //식 계산
			return result; //result 리턴
		}
		// 반복문을 사용하여 계산
		public static int sumiter(int n) {
			
			int sumiter = 0;
			for(int i = 1; i<=n; i++) { // 두번쨰 방법
				sumiter=sumiter+i;
			} return sumiter;
		}
		public static void main(String[] args) {
		int n = 10; //n 생성, 10으로 초기화
		System.out.println(sumrec(n));
		System.out.println(sumiter(n));//결과 출력
		}
		}