import java.util.Scanner; //��ĳ�ʸ� ����ϱ� ���� import��

public class Week1_3_�谡�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("===================");
		System.out.println("���� : ���̹���������");
		System.out.println("�й� : 2071060");
		System.out.println("���� : �谡��");
		System.out.println("===================");
		
		Scanner scanner = new Scanner(System.in); //��ĳ�� ���
		
		System.out.print("ȭ���µ� �Է� : ");
		int f = scanner.nextInt(); //���� ���� f�� ��ĳ�ʸ� ����Ͽ� ȭ���µ��� �޽��ϴ�.
		
		float c = (float)((float)5/9 * (f-32)); //�Ǽ� ���� c�� �����µ��� ����Ͽ� �ֽ��ϴ�. �� ��, f�� int ���̰� 5/9�� �׳� ����ϸ� int ���̹Ƿ� float�� ����ȯ�� ���ݴϴ�.
		
		System.out.println( "\nȭ���µ� : " + f); //Ż�⹮�ڸ� ���� �ٹٲ��� ���ݴϴ�.
		System.out.printf("�����µ� : %.1f ", c); //printf�� %.nf �� Ȱ���Ͽ� ���ϴ� �Ҽ� �ڸ����� ��Ÿ���ݴϴ�.
		
		
	}

}
