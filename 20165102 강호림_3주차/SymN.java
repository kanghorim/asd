package week_3;

public class SymN {
	public static int sumrec(int n) {
		if(n == 1) { //n�� 1�̸�
			return 1; //1 ����
		}
		int result = n + sumrec(n - 1); //�� ���
			return result; //result ����
		}
		// �ݺ����� ����Ͽ� ���
		public static int sumiter(int n) {
			
			int sumiter = 0;
			for(int i = 1; i<=n; i++) { // �ι��� ���
				sumiter=sumiter+i;
			} return sumiter;
		}
		public static void main(String[] args) {
		int n = 10; //n ����, 10���� �ʱ�ȭ
		System.out.println(sumrec(n));
		System.out.println(sumiter(n));//��� ���
		}
		}