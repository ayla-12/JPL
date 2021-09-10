import java.util.Scanner; //스캐너를 사용하기 위한 import문

public class Week1_3_김가연 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("===================");
		System.out.println("전공 : 사이버보안전공");
		System.out.println("학번 : 2071060");
		System.out.println("성명 : 김가연");
		System.out.println("===================");
		
		Scanner scanner = new Scanner(System.in); //스캐너 사용
		
		System.out.print("화씨온도 입력 : ");
		int f = scanner.nextInt(); //정수 변수 f에 스캐너를 사용하여 화씨온도를 받습니다.
		
		float c = (float)((float)5/9 * (f-32)); //실수 변수 c에 섭씨온도를 계산하여 넣습니다. 이 때, f는 int 형이고 5/9도 그냥 계산하면 int 형이므로 float로 형변환을 해줍니다.
		
		System.out.println( "\n화씨온도 : " + f); //탈출문자를 통해 줄바꿈을 해줍니다.
		System.out.printf("섭씨온도 : %.1f ", c); //printf와 %.nf 를 활용하여 원하는 소수 자리까지 나타내줍니다.
		
		
	}

}
