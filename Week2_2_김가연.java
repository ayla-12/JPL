import java.util.Scanner;
public class Week2_2_김가연 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
		System.out.println("전공 : 사이버보안전공");
		System.out.println("학번 : 2071060");
		System.out.println("성명 : 김가연");
		System.out.println("===================");
		
		double Degree_C; 
		int Degree_F;
		String input_yn = "Y";
		String input_cf = "C";
		// 코드에서 쓰이는 섭씨, 화씨의 변수와 입력 분기점을 결정하는 y/n c/f 문자열을 만들어줍니다.
		
		Scanner sc = new Scanner(System.in); // 스캐너 사용
		

		while(input_yn.equalsIgnoreCase("Y")) { //input_yn에 들어온 값이 Y 혹은 y이면 while문을 계속 돌립니다. Y나 y가 아닐경우에는 반복문을 멈춥니다.
			System.out.print("섭씨의 경우 'C', 화씨의 경우 'F'를 입력하세요 : ");
			input_cf = sc.nextLine();
			if (input_cf.equalsIgnoreCase("C")) {
				System.out.print("섭씨온도 입력 : ");
				Degree_C = sc.nextDouble();
				Degree_F = (int)(9*(Degree_C)/5) + 32; //Degree_C는 double이고 Degree_F는 int이므로 형변환을 해줍니다.
				System.out.println("현재온도는 섭씨 "+Degree_C+"도, 화씨 "+Degree_F+"도 입니다.");
			}
			else if (input_cf.equalsIgnoreCase("F")) {
				System.out.print("화씨온도 입력 : ");
				Degree_F = sc.nextInt();
				Degree_C = (double)(5*(Degree_F-32))/9; //제대로 된 온도 표기를 위해 int인 Degree_F를 double로 형변환 해줍니다.
				System.out.printf("현재온도는 화씨 "+Degree_F+"도, 섭씨 %.1f 도 입니다.\n", Degree_C); //소수점 한자리 수 까지 나타내도록 printf와 %.1f를 활용했습니다.
			}
			else {
				System.out.println("잘못된 입력");
				System.out.print("계속하시겠습니까?(y/n)");
				input_yn = sc.nextLine();
				if(input_yn.equalsIgnoreCase("Y")) continue;
				else break;
			}
			sc.nextLine(); //섭씨, 화씨 계산을 할 때 엔터를 먹어주는 역할을 하지만 잘못된 입력을 받았을 때는 필요가 없어 위에 따로 탈출문 코드를 넣어줬습니다.
			System.out.print("계속하시겠습니까?(y/n)");
			input_yn = sc.nextLine();
		}
		System.out.println("프로그램 종료");
		
		sc.close();
	}

}
