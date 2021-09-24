import java.util.Scanner;
class Facto{ // Facto 클래스를 선언합니다.
	static int result; // Facto 안의 인스턴스 변수
	static int factoVal(int x) { 
		if(x == 1) return 1; // 재귀가 끝날 조건
		else return x * factoVal(x-1); // 재귀를 이용하여 팩토리얼 함수를 구현하였습니다. 
	}
}
public class Week4_2_김가연 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
	    System.out.println("전공 : 사이버보안전공");
	    System.out.println("학번 : 2071060");
	    System.out.println("성명 : 김가연");
	    System.out.println("===================\n");
	      
		Scanner sc = new Scanner(System.in); // 스캐너 사용을 위해 스캐너 클래스를 불러와줍니다.
		int a,b; // 입력 받을 값인 정수 변수 두개를 선언합니다.
		Facto f1 = new Facto(); // 메서드 사용과 값 저장을 위해 Facto 클래스를 불러와줍니다.
		
		System.out.print("첫번째 원소 입력:"); a = sc.nextInt();
		System.out.print("두번째 원소 입력:"); b = sc.nextInt(); // 각각 a,b 변수에 스캐너를 통해 원소 값을 받습니다.
		
		f1.result = f1.factoVal(a) - f1.factoVal(b); // 아까 불러온 f1 안에 있는 메서드를 사용하여 인스턴스 변수안에 차를 저장합니다.
		
		System.out.println("Factorial("+a+") - Factorial("+b+") = "+f1.result); // 그리고 f1.result를 불러와 값을 찍어내줍니다.

		sc.close();
	}

}
