import java.util.Scanner;

public class Week2_3_�谡�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
		System.out.println("���� : ���̹���������");
		System.out.println("�й� : 2071060");
		System.out.println("���� : �谡��");
		System.out.println("===================");
		
		Scanner sc = new Scanner(System.in); //��ĳ�� ���
		 
		System.out.println("Factorial�� ����� ���� �Է�");
		int num = sc.nextInt(); //���丮�� ����� ������ �Է¹޽��ϴ�
		int fac = 1; //���丮�� ��� ���� ����� ���� fac�� �����մϴ�.
		
		while(true) {
			if(num <= 10 && num>= 1) { //������ ������ �ÿ� �Ʒ��� �ڵ带 �����մϴ�.
				int temp = num; //�Է� ���� ������ temp�� �����Ͽ� ���丮�� ����� �� Ȱ���մϴ�.
				System.out.print(num+"! = "+ num);
				for(int i = 1;i<num;i++) { //num�� ���ؼ� ������ �ѹ� ������Ƿ� num-1��ŭ �ڵ尡 �ݺ��ǵ��� ������ ������ݴϴ�.
					fac *= temp; //���丮�� ��� ���� ����Ǵ� fac�� temp�� �����ݴϴ�.
					temp--; //fac�� �ѹ� �������� 1�� ���ݴϴ�. �ݺ����� ���� ���� fac *= temp�� ������ �� ����� �� ����� �̷���� �� �ֵ���!
					System.out.print(" X "+temp); //��� ������ ������ݴϴ�.
				}
				System.out.print(" = "+fac); //for ���� ���ͼ� ����� �Ϸ�� fac�� ����մϴ�.
				break;	//���ѷ��� while�� Ż���մϴ�.
			}
			else { // �Է��� ������ 1~10 ������ ���� �ƴ� ���� ������ ���Է� �ް� �ٽ� �ݺ��� ������� ���ư� �Է� ���� ������ 1~10 �������� Ȯ���մϴ�.
				System.out.println("���� ���Է� (1~10) :");
				num = sc.nextInt();
			}
		}
			

		
		
		
		sc.close();
	}

}
