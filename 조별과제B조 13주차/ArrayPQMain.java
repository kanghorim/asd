package 우선순위큐;

public class ArrayPQMain {
	public static void main(String[] args) {
		PriorityQ arrayPQ = new PriorityQ(5);
		// what do you know about the priority queue at this point?
		arrayPQ.insert(30);
		arrayPQ.insert(50);
		arrayPQ.insert(10);
		arrayPQ.insert(40);
		arrayPQ.insert(20);
		arrayPQ.insert(190);
		arrayPQ.insert(230);
		arrayPQ.insert(210);

		while (!arrayPQ.isEmpty()) {
			long item = arrayPQ.remove();
			System.out.print(item + " "); // 10, 20, 30, 40, 50 Note: ORDERED!
		} // end while
		System.out.println("");
	} // end main()
}

//priorityQ.java
// 배열에는 큰수에서 작은 수로 정렬되어 있음.
class PriorityQ { // array in sorted order, from max at 0 to min at nitems-1
	private int maxSize;
	private long[] queArray;
	private int nItems;

	public PriorityQ(int s) { 
		maxSize = s;
		queArray = new long[maxSize];
		nItems = 0;
	}

	public void insert(long item) {
		int j;
		if (isFull()) {
			resize();
		}
		if (nItems == 0)
			queArray[nItems++] = item;
		else {
			for (j = nItems - 1; j >= 0; j--)
				if (item > queArray[j]) // item보다 작은 원소는 한칸씩 뒤로 이동
					queArray[j + 1] = queArray[j];
				else
					break;
			// end for
			queArray[j + 1] = item;
			nItems++;
			// increment number of items in the pqueue.
		} // end else (nItems > 0) // Note value of j when we leave the for loop!
			// queArray[j+ 1 is correct. ===============================================
	} // end insert()

	public long remove() {
		return queArray[--nItems];
	}

	public long peekMin() // peek at minimum item
	{
		return queArray[nItems - 1];
	}

	public boolean isEmpty() // true if queue is empty Very straightforward.
	{
		return (nItems == 0);
	}
	//***채워라
	public int size(){ //우선순위큐에 저장된 원소의 갯수를 리턴
		return (maxSize);
	}
	public boolean isFull() // true if queue is full
	{
		return (nItems == maxSize);
	}
	public void resize() {
		long[] tmpqueArray = new long[maxSize+5];
		for(int i =0; i<maxSize;i++) {
			tmpqueArray[i]=queArray[i];
		}
		maxSize=maxSize+5;
		queArray=tmpqueArray;
	}
} // end class PriorityQ`
