import java.util.Scanner;
class Facto{ // Facto Ŭ������ �����մϴ�.
	static int result; // Facto ���� �ν��Ͻ� ����
	static int factoVal(int x) { 
		if(x == 1) return 1; // ��Ͱ� ���� ����
		else return x * factoVal(x-1); // ��͸� �̿��Ͽ� ���丮�� �Լ��� �����Ͽ����ϴ�. 
	}
}
public class Week4_2_�谡�� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
	    System.out.println("���� : ���̹���������");
	    System.out.println("�й� : 2071060");
	    System.out.println("���� : �谡��");
	    System.out.println("===================\n");
	      
		Scanner sc = new Scanner(System.in); // ��ĳ�� ����� ���� ��ĳ�� Ŭ������ �ҷ����ݴϴ�.
		int a,b; // �Է� ���� ���� ���� ���� �ΰ��� �����մϴ�.
		Facto f1 = new Facto(); // �޼��� ���� �� ������ ���� Facto Ŭ������ �ҷ����ݴϴ�.
		
		System.out.print("ù��° ���� �Է�:"); a = sc.nextInt();
		System.out.print("�ι�° ���� �Է�:"); b = sc.nextInt(); // ���� a,b ������ ��ĳ�ʸ� ���� ���� ���� �޽��ϴ�.
		
		f1.result = f1.factoVal(a) - f1.factoVal(b); // �Ʊ� �ҷ��� f1 �ȿ� �ִ� �޼��带 ����Ͽ� �ν��Ͻ� �����ȿ� ���� �����մϴ�.
		
		System.out.println("Factorial("+a+") - Factorial("+b+") = "+f1.result); // �׸��� f1.result�� �ҷ��� ���� ���ݴϴ�.

		sc.close();
	}

}
