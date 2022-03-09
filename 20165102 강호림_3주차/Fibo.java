package week_3;


public class Fibo {
	public static int fiboRec(int n) {
		if (n ==0) {
			return 1;
		}
		if(n == 1){
			return 1;
		}
		return fiboRec(n-1)+ fiboRec(n-2);
	}
	public static int fiboIter(int n) {
		int[] fibArray = new int [n+1];
		fibArray[0]=1; fibArray[1]=1;
		for(int i = 2; i<n; i++) {
			fibArray[i]=fibArray[i-1]+fibArray[i-2];
		}
		return fibArray[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n = 40;
			long start = System.currentTimeMillis();
			System.out.println("Hello");
			System.out.println("fibIter("+n+")="+fiboRec(n));
			long end = System.currentTimeMillis();
			long diff = end - start;
			System.out.println("Difference=" +  diff);
		}catch(Exception e) {
			System.out.println("Den");
		}
	}

}
