import java.util.Scanner; //scanner을 쓰기 위한 import문

public class Week1_1_김가연 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
		System.out.println("전공 : 사이버보안전공");
		System.out.println("학번 : 2071060");
		System.out.println("성명 : 김가연");
		System.out.println("===================");
		
		Scanner scanner = new Scanner(System.in); //scanner 선언
		int base, height; //base와 height 변수 선언을 해줍니다.
		
		System.out.print("Input base : ");
		base = scanner.nextInt(); //scanner로 정수 base 값을 받아줍니다.
		
		System.out.print("Input height : ");
		height = scanner.nextInt(); //scanner로 정수 height 값 또한 받아줍니다.
		
		float area = (float)((float)(base * height) / 2); //area는 float이므로 형변환 코드를 통해 정수(int)를 실수(float) 형태로 바꾸어 저장해줍니다.
		
		System.out.println("The area : " + area ); //area 값을 print 해줍니다.
		
	}
}
