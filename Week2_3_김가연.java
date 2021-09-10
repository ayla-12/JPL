import java.util.Scanner;

public class Week2_3_김가연 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
		System.out.println("전공 : 사이버보안전공");
		System.out.println("학번 : 2071060");
		System.out.println("성명 : 김가연");
		System.out.println("===================");
		
		Scanner sc = new Scanner(System.in); //스캐너 사용
		 
		System.out.println("Factorial을 계산할 정수 입력");
		int num = sc.nextInt(); //팩토리얼 계산할 정수를 입력받습니다
		int fac = 1; //팩토리얼 계산 값이 저장될 변수 fac을 선언합니다.
		
		while(true) {
			if(num <= 10 && num>= 1) { //조건을 만족할 시에 아래의 코드를 실행합니다.
				int temp = num; //입력 받은 정수를 temp에 복사하여 팩토리얼 계산할 때 활용합니다.
				System.out.print(num+"! = "+ num);
				for(int i = 1;i<num;i++) { //num에 대해서 위에서 한번 찍었으므로 num-1만큼 코드가 반복되도록 조건을 만들어줍니다.
					fac *= temp; //팩토리얼 계산 값이 저장되는 fac에 temp를 곱해줍니다.
					temp--; //fac에 한번 곱했으니 1을 빼줍니다. 반복문을 돌아 다음 fac *= temp를 만났을 때 제대로 된 계산이 이루어질 수 있도록!
					System.out.print(" X "+temp); //계산 과정을 출력해줍니다.
				}
				System.out.print(" = "+fac); //for 문을 나와서 계산이 완료된 fac을 출력합니다.
				break;	//무한루프 while을 탈출합니다.
			}
			else { // 입력한 정수가 1~10 사이의 수가 아닐 때에 정수를 재입력 받고 다시 반복문 상단으로 돌아가 입력 받은 정수가 1~10 사이인지 확인합니다.
				System.out.println("정수 재입력 (1~10) :");
				num = sc.nextInt();
			}
		}
			

		
		
		
		sc.close();
	}

}
