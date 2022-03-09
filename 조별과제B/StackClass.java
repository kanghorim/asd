package week_10;
import java.util.Scanner;

public class StackClass implements StackA {
   
   private int top;
   private int size;
   private Object arr [];

   public StackClass() {
      top = 10;
      size = 10;
      arr = new Object[size];
   }
   
   public void push(Object x) {
      if(top <= 0) {
         stackFull();
      } else {
         arr[--top] = x;
      }
   }
   
   public Object pop(int num) {
      
      Scanner input = new Scanner(System.in);
      
      while(true) {
      
         if ((num < 1) || (num > 10)) {
            System.out.println("1 ~ 10 ������ ��ȣ�� �ٽ� �Է��ϼ��� : ");
         } else if (num < top) {
            System.out.println("�����Ͻ� ��ȣ���� ���� �����ϴ�. ");
            System.out.println("��ȣ�� �ٽ� �Է��ϼ��� : ");
         } else {
            break;
         }
         num = input.nextInt();
      }
      
         Object tmp = arr[num];
      
         for(int i = num - 1; i >= top; i--) {
            arr[i+1] = arr[i];
         }
      
         arr[top++] = null;
      
         return tmp;
      }
   
   
   
   public void stackFull() {
      System.out.println("\n�������� �� á���ϴ�.");
   }
   
   public boolean isEmpty() {
      return top == 10;
   }
   
   public void print() {
      System.out.println();
      for (int i = size - 1; i >= 0; i--) {
         System.out.println("[" + (i + 1) + "] " + arr[i]);
      }
      
   }
   
}
