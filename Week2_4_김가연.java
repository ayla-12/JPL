import java.util.Scanner;
public class Week2_4_�谡�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
		System.out.println("���� : ���̹���������");
		System.out.println("�й� : 2071060");
		System.out.println("���� : �谡��");
		System.out.println("===================");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the height of the triangle : "); 
		int num = sc.nextInt(); // �ﰢ���� ���̸� ��ĳ�ʷ� �޾��ݴϴ�.
		int i,j,k; // ��ø for���� ���̴� ������ �����մϴ�.
		
		
		for(i=1; i<=num; i++) { //i�� ��ü for ���� ������ �����Դϴ�. �Է¹��� num�� ���Ͽ� num ��ŭ ���� ����ϴ�.
			for(j=1; j<=num-i; j++) { //j�� �� �ٿ� ���� ���⸦ ����ϴ�. �Է¹��� num���� �� ���� i�� ���� �� �ٿ� ��� ���⸦ ������ �����ϰ�, ����ϴ�.
				System.out.print(" ");
			}
			
			for(k=1; k<=2*i-1; k++) { //k�� �� �ٿ� ���� ���� ����ϴ�. �� ���� i�� ���� 2i-1 ���� ���� ����ݴϴ�.
				System.out.print("*");
			}
		System.out.println(""); //�ٹٲ��� ������ �ϰ� �ֽ��ϴ�.
		
		}
	}

}
