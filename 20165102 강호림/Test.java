package week_7;
public class Test {
    public static void main(String[] args) {
        //���׽� A �����
        Polynomial A = new Polynomial();
        A.insertNode(4, 3);
        A.insertNode(3, 2);
        A.insertNode(5, 1);
        A.print();
 
        //���׽� B �����
        Polynomial B = new Polynomial();
        B.insertNode(3, 4);
        B.insertNode(1, 3);
        B.insertNode(2, 1);
        B.insertNode(1, 0);
        B.print();
 
        Polynomial C = AddPolynomial(A, B);
        C.print();
    }
 
    static Polynomial AddPolynomial(Polynomial A, Polynomial B){
        ListNode a = A.head;
        ListNode b = B.head;
        Polynomial C = new Polynomial();
 
        //A�� B �� �� �ϳ��� ��� �׿� ���� ������ ������ ��� while ����
        while(a!=null && b!=null){
            //B�� ������ A�� �������� ū ���
            if(a.expo<b.expo){
                C.insertNode(b.coef, b.expo);
                b = b.next;
            }
            //A�� ������ B�� �������� ū ���
            else if(a.expo>b.expo){
                C.insertNode(a.coef, a.expo);
                a = a.next;
            }
            //A�� ������ B�� ������ ���� ���
            else{
                C.insertNode(a.coef+b.coef, a.expo);
                a = a.next;
                b = b.next;
            }
        }    
        
        //A�� ���� ���� �ִ� ��� C�� �߰�
        while(a!=null){
            C.insertNode(a.coef, a.expo);
            a = a.next;
        }
        
        //B�� ���� ���� �մ� ��� B�� �߰�
        while(b!=null){
            C.insertNode(b.coef, b.expo);
            b = b.next;
        }
        
        return C;
    }
}

