import java.util.Scanner;
public class Week2_2_�谡�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
		System.out.println("���� : ���̹���������");
		System.out.println("�й� : 2071060");
		System.out.println("���� : �谡��");
		System.out.println("===================");
		
		double Degree_C; 
		int Degree_F;
		String input_yn = "Y";
		String input_cf = "C";
		// �ڵ忡�� ���̴� ����, ȭ���� ������ �Է� �б����� �����ϴ� y/n c/f ���ڿ��� ������ݴϴ�.
		
		Scanner sc = new Scanner(System.in); // ��ĳ�� ���
		

		while(input_yn.equalsIgnoreCase("Y")) { //input_yn�� ���� ���� Y Ȥ�� y�̸� while���� ��� �����ϴ�. Y�� y�� �ƴҰ�쿡�� �ݺ����� ����ϴ�.
			System.out.print("������ ��� 'C', ȭ���� ��� 'F'�� �Է��ϼ��� : ");
			input_cf = sc.nextLine();
			if (input_cf.equalsIgnoreCase("C")) {
				System.out.print("�����µ� �Է� : ");
				Degree_C = sc.nextDouble();
				Degree_F = (int)(9*(Degree_C)/5) + 32; //Degree_C�� double�̰� Degree_F�� int�̹Ƿ� ����ȯ�� ���ݴϴ�.
				System.out.println("����µ��� ���� "+Degree_C+"��, ȭ�� "+Degree_F+"�� �Դϴ�.");
			}
			else if (input_cf.equalsIgnoreCase("F")) {
				System.out.print("ȭ���µ� �Է� : ");
				Degree_F = sc.nextInt();
				Degree_C = (double)(5*(Degree_F-32))/9; //����� �� �µ� ǥ�⸦ ���� int�� Degree_F�� double�� ����ȯ ���ݴϴ�.
				System.out.printf("����µ��� ȭ�� "+Degree_F+"��, ���� %.1f �� �Դϴ�.\n", Degree_C); //�Ҽ��� ���ڸ� �� ���� ��Ÿ������ printf�� %.1f�� Ȱ���߽��ϴ�.
			}
			else {
				System.out.println("�߸��� �Է�");
				System.out.print("����Ͻðڽ��ϱ�?(y/n)");
				input_yn = sc.nextLine();
				if(input_yn.equalsIgnoreCase("Y")) continue;
				else break;
			}
			sc.nextLine(); //����, ȭ�� ����� �� �� ���͸� �Ծ��ִ� ������ ������ �߸��� �Է��� �޾��� ���� �ʿ䰡 ���� ���� ���� Ż�⹮ �ڵ带 �־�����ϴ�.
			System.out.print("����Ͻðڽ��ϱ�?(y/n)");
			input_yn = sc.nextLine();
		}
		System.out.println("���α׷� ����");
		
		sc.close();
	}

}
