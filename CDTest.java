package week_6;

public class CDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CDLinkedList<String> c = new CDLinkedList<String>();
		c.insert("���"); //����
		c.insertAfter("���", "��õ");
		c.insertAfter("��õ", "���տ��");
		c.insertAfter("���տ��", "�Ｚ");
		c.insertAfter("�Ｚ", "����");
		c.insertAfter("����", "����");
		c.insertAfter("����", "����");
		c.insertAfter("����", "����");
		c.insertAfter("����", "����");
		c.insertAfter("����", "���");
		c.insertAfter("���", "���");
		c.insertAfter("���", "������");
		c.insertAfter("������", "����� �Ա�");
		c.insertAfter("����� �Ա�", "��õ");
		c.insertAfter("��õ", "�Ÿ�");
		c.insertAfter("�Ÿ�", "�Ŵ��");
		c.insertAfter("�Ŵ��", "���ε����д���");
		c.insertAfter("���ε����д���", "�븲");
		c.insertAfter("�븲", "�ŵ���");
		c.insertAfter("�ŵ���", "����");
		c.insertAfter("����", "��������û");
		c.insertAfter("��������û", "���");
		c.insertAfter("���", "����");
		c.insertAfter("����", "ȫ���Ա�");
		c.insertAfter("ȫ���Ա�", "����");
		c.insertAfter("����", "�̴�");
		c.insertAfter("�̴�", "����");
		c.insertAfter("����", "������");
		c.insertAfter("������", "��û");
		c.insertAfter("��û", "�������Ա�");
		c.insertAfter("�������Ա�", "������3��");
		c.insertAfter("������3��", "������4��");
		c.insertAfter("������4��", "���빮 ���繮ȭ ����");
		c.insertAfter("���빮 ���繮ȭ ����", "�Ŵ�");
		c.insertAfter("�Ŵ�", "��սʸ�");
		c.insertAfter("��սʸ�", "�սʸ�");
		c.insertAfter("�սʸ�", "�Ѿ��");
		c.insertAfter("�Ѿ��", "�Ҽ�");
		c.insertAfter("�Ҽ�", "����");
		c.insertAfter("����", "�Ǵ��Ա�");
		c.insertAfter("�Ǵ��Ա�", "����");
		c.insertAfter("����", "����");
		c.insertAfter("����", "��ǳ���");
		c.printAll();
		c.numberOfStation("���", "�սʸ�");
		c.remove("���");
		c.printAll();
		c.insertAfter("���", "����");
		c.printAll();
		c.countTotalStation();
		System.out.println("\n��ü���� ������:" + c.countTotalStation());
		/*c.insertAfter("��", "��"); //�� ������ �� ����
		//c.printAll();
		c.insertPrevious("��", "ȭ"); // �� ������ ȭ ����
		c.printAll();
		c.insertLast("��"); // �������� �� �߰�
		c.printAll();
		c.insertFront("��"); // ó���� �� �߰� 
		c.printAll();
		c.removeAfter("��"); // �� ������ �ִ� �� ���� 
		c.printAll();
		c.removePrevious("��"); // ����ϳ� �տ� �ִ� �� ����
		c.printAll();
		c.removePrevious("��"); // ���߿����̱� ������ �� �տ� �ִ�(������ ��)
		// �� ������ 
		c.printAll();
		c.removePrevious("��"); // �Ȱ��� �� �տ������� ������ �ڿ��ִ� ȭ�� ����
		c.printAll();
		c.removePrevious("��"); 
		c.printAll();*/
	}

}
