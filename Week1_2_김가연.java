import java.util.Scanner; //스캐너를 쓰기 위한 import 문
public class Week1_2_김가연 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
		System.out.println("전공 : 사이버보안전공");
		System.out.println("학번 : 2071060");
		System.out.println("성명 : 김가연");
		System.out.println("===================");
		
		int n1, n2, n3; //정수 세 개 변수 선언
		
		
		Scanner scanner = new Scanner(System.in); //스캐너 사용을 위한 코드
		
		System.out.println("정수 세 개 입력");
		n1 = scanner.nextInt();
		n2 = scanner.nextInt();
		n3 = scanner.nextInt();   //정수 세 개를 nextInt를 통해 받아줍니다.
		
		float avr = (float)((float)( n1 + n2 + n3 ) / 3); //평균은 float형이고 받은 수는 int 형이기 때문에 형변환 코드를 통해 int를 float로 바꾸어줍니다.
		
		System.out.printf("평균 : %.2f", avr); //printf의 %.nf 를 이용하여 원하는 소수 자리까지 나타냅니다.
		
		
		
	}

}
