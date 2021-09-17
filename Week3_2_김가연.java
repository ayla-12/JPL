import java.util.Scanner;

class Circle {
	//인스턴스 변수
	final double PI = 3.14159; //상수 선언
	private double radius; //private로 보호해줍니다.
	
	//메서드
	void setRadius(double radius) {
		this.radius = radius; //지역변수를 인스턴스 변수에 넣어 저장합니다.
	}
	double getRadius() {
		return radius; //반지름을 가져오는 메서드
	}
	double perimeter() {
		return PI * 2 * radius; //둘레를 계산해주는 메서드
	}
	double area() {
		return PI * radius * radius; //넓이를 계산해주는 메서드
	}
	void circleInfo() {
		System.out.printf("원둘레:%.2f", perimeter());
		System.out.printf("\n원넓이:%.2f", area());
	}
	
	//printf를 이용해서 값을 계산하여 출력할 때 소수점 2자리에서 끊기도록 해줍니다.
}



public class Week3_2_김가연 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
		System.out.println("전공 : 사이버보안전공");
		System.out.println("학번 : 2071060");
		System.out.println("성명 : 김가연");
		System.out.println("===================");
		
		//circle 인스턴스 1개와 스캐너 사용을 위한 선언을 해줍니다.
		Circle c1 = new Circle();
		Scanner sc = new Scanner(System.in);
		
		//반지름을 지역변수에 입력받습니다.
		System.out.print("반지름입력:");
		c1.setRadius(sc.nextDouble()); //입력을 받아서 인스턴스 변수에 집어넣습니다.
		System.out.println("반지름:"+c1.getRadius()); //반지름을 출력해줍니다.
		c1.circleInfo(); //원의 정보를 불러옵니다.
		
		sc.close(); //스캐너를 닫아줍니다.
	}

}
