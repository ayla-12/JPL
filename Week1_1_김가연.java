import java.util.Scanner; //scanner�� ���� ���� import��

public class Week1_1_�谡�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
		System.out.println("���� : ���̹���������");
		System.out.println("�й� : 2071060");
		System.out.println("���� : �谡��");
		System.out.println("===================");
		
		Scanner scanner = new Scanner(System.in); //scanner ����
		int base, height; //base�� height ���� ������ ���ݴϴ�.
		
		System.out.print("Input base : ");
		base = scanner.nextInt(); //scanner�� ���� base ���� �޾��ݴϴ�.
		
		System.out.print("Input height : ");
		height = scanner.nextInt(); //scanner�� ���� height �� ���� �޾��ݴϴ�.
		
		float area = (float)((float)(base * height) / 2); //area�� float�̹Ƿ� ����ȯ �ڵ带 ���� ����(int)�� �Ǽ�(float) ���·� �ٲپ� �������ݴϴ�.
		
		System.out.println("The area : " + area ); //area ���� print ���ݴϴ�.
		
	}
}
