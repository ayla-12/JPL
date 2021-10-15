import java.util.Scanner; // 스캐너 사용을 위한 임포트문
interface Geometry{ // Geometry 인터페이스를 선언합니다.
	// 인터페이스에서 모든 멤버 변수는 public static final이어야함
	public static final double PI = 3.14159; // 상수 PI
	// 인터페이스에서 모든 메서드는 public abstract이어야함
	public abstract double area();
	public abstract double perimeter();
	
}

class Circle implements Geometry { // 인터페이스를 상속받아서 Circle을 만듭니다.
	private double myRadius; // 멤버 변수
	Circle() {} // 기본 생성자
	Circle(double radius){ // 반지름을 받는 생성자
		myRadius = radius; // 반지름을 받아 클래스 내 멤버 변수에 저장합니다.
	}
	public double area() { // 원의 넓이를 계산하여 리턴하는 메서드입니다.
		return myRadius * myRadius * PI;
	}
	public double perimeter() { // 원의 둘레를 계산하여 리턴하는 메서드입니다.
		return 2*myRadius*PI; 
	}
}
class Square implements Geometry{ // 인터페이스를 상속받아서 Square을 만듭니다.
	private double mySide; // 멤버 변수
	Square() {} // 기본 생성자
	Square(double side){ // 한 변의 길이를 받는 생성자
		mySide = side; // 받은 변의 길이를 클래스 내 멤버 변수에 저장합니다.
	}
	public double area() { // 정사각형의 넓이를 계산하여 리턴하는 메서드입니다.
		return mySide * mySide;
	}
	public double perimeter() { // 정사각형의 둘레를 계산하여 리턴하는 메서드입니다.
		return mySide * 4;
	}	
}
class Triangle implements Geometry { // 인터페이스를 상속받아 Triangle을 만듭니다.
	private double a,b,c; // 멤버 변수
	Triangle() {} // 기본 생성자
	Triangle(double a, double b, double c){ // 삼각형 세 변의 길이를 받는 생성자
		this.a = a; // 변 3개를 인자로 받아서 각자 저장합니다.
		this.b = b;
		this.c = c;
	}
	public double area() { // 삼각형의 넓이를 리턴하는 메서드
		double s = (a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	public double perimeter() { // 삼각형의 둘레를 리턴하는 메서드
		return a+b+c;
	}
}
public class Week7_2_김가연 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
	    System.out.println("전공 : 사이버보안전공");
	    System.out.println("학번 : 2071060");
	    System.out.println("성명 : 김가연");
	    System.out.println("===================\n");
	    
	    Scanner sc = new Scanner(System.in); // 스캐너 사용을 위해 스캐너 클래스를 생성합니다.
	    double a,b,c; // 삼각형 세 변의 길이를 받을 때 잠시 쓰이는 실수 변수 a,b,c
	    
		System.out.println("Input radius for a circle");
		Circle cl = new Circle(sc.nextDouble()); // 반지름의 길이를 바로 Circle 생성자로 넘겨서 클래스를 생성합니다.
		System.out.println("Input length for a square");
		Square sq = new Square(sc.nextDouble()); // 한 변의 길이를 바로 Square 생성자로 넘겨서 클래스를 생성합니다.
		System.out.println("Input a for a triangle");
		a = sc.nextDouble(); // 삼각형의 한 변의 길이를 받아 a에 저장합니다.
		System.out.println("Input b for a triangle");
		b = sc.nextDouble(); // 삼각형의 한 변의 길이를 받아 b에 저장힙니다.
		System.out.println("Input c for a triangle");
		c = sc.nextDouble(); // 삼각형의 한 변의 길이를 받아 c에 저장합니다.
		Triangle tri = new Triangle(a,b,c); // 받았던 길이들을 모두 Triangle 생성자로 넘겨서 클래스를 생성합니다.
		// 계산한거 출력하기!
		System.out.println("<Circle>");
		System.out.print("Area: "+cl.area()); // 원의 넓이를 클래스 메서드를 이용하여 출력해줍니다.
		System.out.print("\nCircumference: "+cl.perimeter()); // 원의 둘레를 클래스 메서드를 이용하여 출력해줍니다.
		System.out.println("\n<Square>");
		System.out.print("Area: "+sq.area()); // 정사각형의 넓이를 클래스 메서드를 이용하여 출력해줍니다.
		System.out.print("\nCircumference: "+sq.perimeter()); // 정사각형의 둘레를 클래스 메서드를 이용하여 출력해줍니다.
		System.out.println("\n<Triangle>");
		System.out.print("Area: "+tri.area()); // 삼각형의 넓이를 클래스 메서드를 이용하여 출력해줍니다.
		System.out.print("\nCircumference: "+tri.perimeter()); // 삼각형의 둘레를 클래스 메서드를 이용하여 출력해줍니다.

		sc.close(); // 스캐너 사용이 끝났으니 닫아줍니다.
	}

}