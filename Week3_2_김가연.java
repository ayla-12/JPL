import java.util.Scanner;

class Circle {
	//�ν��Ͻ� ����
	final double PI = 3.14159; //��� ����
	private double radius; //private�� ��ȣ���ݴϴ�.
	
	//�޼���
	void setRadius(double radius) {
		this.radius = radius; //���������� �ν��Ͻ� ������ �־� �����մϴ�.
	}
	double getRadius() {
		return radius; //�������� �������� �޼���
	}
	double perimeter() {
		return PI * 2 * radius; //�ѷ��� ������ִ� �޼���
	}
	double area() {
		return PI * radius * radius; //���̸� ������ִ� �޼���
	}
	void circleInfo() {
		System.out.printf("���ѷ�:%.2f", perimeter());
		System.out.printf("\n������:%.2f", area());
	}
	
	//printf�� �̿��ؼ� ���� ����Ͽ� ����� �� �Ҽ��� 2�ڸ����� ���⵵�� ���ݴϴ�.
}



public class Week3_2_�谡�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
		System.out.println("���� : ���̹���������");
		System.out.println("�й� : 2071060");
		System.out.println("���� : �谡��");
		System.out.println("===================");
		
		//circle �ν��Ͻ� 1���� ��ĳ�� ����� ���� ������ ���ݴϴ�.
		Circle c1 = new Circle();
		Scanner sc = new Scanner(System.in);
		
		//�������� ���������� �Է¹޽��ϴ�.
		System.out.print("�������Է�:");
		c1.setRadius(sc.nextDouble()); //�Է��� �޾Ƽ� �ν��Ͻ� ������ ����ֽ��ϴ�.
		System.out.println("������:"+c1.getRadius()); //�������� ������ݴϴ�.
		c1.circleInfo(); //���� ������ �ҷ��ɴϴ�.
		
		sc.close(); //��ĳ�ʸ� �ݾ��ݴϴ�.
	}

}
