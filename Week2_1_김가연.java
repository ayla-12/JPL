import java.util.Scanner;
public class Week2_1_�谡�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
		System.out.println("���� : ���̹���������");
		System.out.println("�й� : 2071060");
		System.out.println("���� : �谡��");
		System.out.println("===================");
		
		Scanner sc = new Scanner(System.in); //��ĳ�� ���
		
		System.out.print("�� �Է� : ");
		int month = sc.nextInt(); //��ĳ�ʸ� ���� ��(����)�� �޽��ϴ�.
		
		switch(month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 : System.out.println(month+"������ 31���� �ֽ��ϴ�."); break; //1,3,5,7,8,10,12���� �� 31���� �ִٰ� �ȳ��ϴ� ������ ����մϴ�.
		case 4 :
		case 6 :
		case 9 :
		case 11 : System.out.println(month+"������ 30���� �ֽ��ϴ�."); break; //4,6,9,11�� �� �� 30���� �ִٰ� �ȳ��ϴ� ������ ����մϴ�.
		case 2 : System.out.println(month+"������ 28���� �ֽ��ϴ�."); break; //2������ 28���� �ִٰ� �ȳ��ϴ� ������ ����մϴ�.
		default : System.out.println("�Է� ����"); break; // 1-12�� �ƴ� ���, �Է� ������ ����Ʈ ������ ����ϵ��� �մϴ�.
		}
		
		//switch-case�� ���� ������ ��ĥ�� �ִ����� �����ҽ��ϴ�.
		
		sc.close();
		
	}

}
