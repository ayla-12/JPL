import java.util.Scanner; // ��ĳ�� ����� ���� ����Ʈ��
interface Geometry{ // Geometry �������̽��� �����մϴ�.
	// �������̽����� ��� ��� ������ public static final�̾����
	public static final double PI = 3.14159; // ��� PI
	// �������̽����� ��� �޼���� public abstract�̾����
	public abstract double area();
	public abstract double perimeter();
	
}

class Circle implements Geometry { // �������̽��� ��ӹ޾Ƽ� Circle�� ����ϴ�.
	private double myRadius; // ��� ����
	Circle() {} // �⺻ ������
	Circle(double radius){ // �������� �޴� ������
		myRadius = radius; // �������� �޾� Ŭ���� �� ��� ������ �����մϴ�.
	}
	public double area() { // ���� ���̸� ����Ͽ� �����ϴ� �޼����Դϴ�.
		return myRadius * myRadius * PI;
	}
	public double perimeter() { // ���� �ѷ��� ����Ͽ� �����ϴ� �޼����Դϴ�.
		return 2*myRadius*PI; 
	}
}
class Square implements Geometry{ // �������̽��� ��ӹ޾Ƽ� Square�� ����ϴ�.
	private double mySide; // ��� ����
	Square() {} // �⺻ ������
	Square(double side){ // �� ���� ���̸� �޴� ������
		mySide = side; // ���� ���� ���̸� Ŭ���� �� ��� ������ �����մϴ�.
	}
	public double area() { // ���簢���� ���̸� ����Ͽ� �����ϴ� �޼����Դϴ�.
		return mySide * mySide;
	}
	public double perimeter() { // ���簢���� �ѷ��� ����Ͽ� �����ϴ� �޼����Դϴ�.
		return mySide * 4;
	}	
}
class Triangle implements Geometry { // �������̽��� ��ӹ޾� Triangle�� ����ϴ�.
	private double a,b,c; // ��� ����
	Triangle() {} // �⺻ ������
	Triangle(double a, double b, double c){ // �ﰢ�� �� ���� ���̸� �޴� ������
		this.a = a; // �� 3���� ���ڷ� �޾Ƽ� ���� �����մϴ�.
		this.b = b;
		this.c = c;
	}
	public double area() { // �ﰢ���� ���̸� �����ϴ� �޼���
		double s = (a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	public double perimeter() { // �ﰢ���� �ѷ��� �����ϴ� �޼���
		return a+b+c;
	}
}
public class Week7_2_�谡�� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
	    System.out.println("���� : ���̹���������");
	    System.out.println("�й� : 2071060");
	    System.out.println("���� : �谡��");
	    System.out.println("===================\n");
	    
	    Scanner sc = new Scanner(System.in); // ��ĳ�� ����� ���� ��ĳ�� Ŭ������ �����մϴ�.
	    double a,b,c; // �ﰢ�� �� ���� ���̸� ���� �� ��� ���̴� �Ǽ� ���� a,b,c
	    
		System.out.println("Input radius for a circle");
		Circle cl = new Circle(sc.nextDouble()); // �������� ���̸� �ٷ� Circle �����ڷ� �Ѱܼ� Ŭ������ �����մϴ�.
		System.out.println("Input length for a square");
		Square sq = new Square(sc.nextDouble()); // �� ���� ���̸� �ٷ� Square �����ڷ� �Ѱܼ� Ŭ������ �����մϴ�.
		System.out.println("Input a for a triangle");
		a = sc.nextDouble(); // �ﰢ���� �� ���� ���̸� �޾� a�� �����մϴ�.
		System.out.println("Input b for a triangle");
		b = sc.nextDouble(); // �ﰢ���� �� ���� ���̸� �޾� b�� �������ϴ�.
		System.out.println("Input c for a triangle");
		c = sc.nextDouble(); // �ﰢ���� �� ���� ���̸� �޾� c�� �����մϴ�.
		Triangle tri = new Triangle(a,b,c); // �޾Ҵ� ���̵��� ��� Triangle �����ڷ� �Ѱܼ� Ŭ������ �����մϴ�.
		// ����Ѱ� ����ϱ�!
		System.out.println("<Circle>");
		System.out.print("Area: "+cl.area()); // ���� ���̸� Ŭ���� �޼��带 �̿��Ͽ� ������ݴϴ�.
		System.out.print("\nCircumference: "+cl.perimeter()); // ���� �ѷ��� Ŭ���� �޼��带 �̿��Ͽ� ������ݴϴ�.
		System.out.println("\n<Square>");
		System.out.print("Area: "+sq.area()); // ���簢���� ���̸� Ŭ���� �޼��带 �̿��Ͽ� ������ݴϴ�.
		System.out.print("\nCircumference: "+sq.perimeter()); // ���簢���� �ѷ��� Ŭ���� �޼��带 �̿��Ͽ� ������ݴϴ�.
		System.out.println("\n<Triangle>");
		System.out.print("Area: "+tri.area()); // �ﰢ���� ���̸� Ŭ���� �޼��带 �̿��Ͽ� ������ݴϴ�.
		System.out.print("\nCircumference: "+tri.perimeter()); // �ﰢ���� �ѷ��� Ŭ���� �޼��带 �̿��Ͽ� ������ݴϴ�.

		sc.close(); // ��ĳ�� ����� �������� �ݾ��ݴϴ�.
	}

}