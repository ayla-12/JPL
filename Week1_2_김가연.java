import java.util.Scanner; //��ĳ�ʸ� ���� ���� import ��
public class Week1_2_�谡�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
		System.out.println("���� : ���̹���������");
		System.out.println("�й� : 2071060");
		System.out.println("���� : �谡��");
		System.out.println("===================");
		
		int n1, n2, n3; //���� �� �� ���� ����
		
		
		Scanner scanner = new Scanner(System.in); //��ĳ�� ����� ���� �ڵ�
		
		System.out.println("���� �� �� �Է�");
		n1 = scanner.nextInt();
		n2 = scanner.nextInt();
		n3 = scanner.nextInt();   //���� �� ���� nextInt�� ���� �޾��ݴϴ�.
		
		float avr = (float)((float)( n1 + n2 + n3 ) / 3); //����� float���̰� ���� ���� int ���̱� ������ ����ȯ �ڵ带 ���� int�� float�� �ٲپ��ݴϴ�.
		
		System.out.printf("��� : %.2f", avr); //printf�� %.nf �� �̿��Ͽ� ���ϴ� �Ҽ� �ڸ����� ��Ÿ���ϴ�.
		
		
		
	}

}
