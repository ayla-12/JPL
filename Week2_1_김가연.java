import java.util.Scanner;
public class Week2_1_김가연 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
		System.out.println("전공 : 사이버보안전공");
		System.out.println("학번 : 2071060");
		System.out.println("성명 : 김가연");
		System.out.println("===================");
		
		Scanner sc = new Scanner(System.in); //스캐너 사용
		
		System.out.print("월 입력 : ");
		int month = sc.nextInt(); //스캐너를 통해 월(정수)를 받습니다.
		
		switch(month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 : System.out.println(month+"월에는 31일이 있습니다."); break; //1,3,5,7,8,10,12월일 때 31일이 있다고 안내하는 문장을 출력합니다.
		case 4 :
		case 6 :
		case 9 :
		case 11 : System.out.println(month+"월에는 30일이 있습니다."); break; //4,6,9,11월 일 때 30일이 있다고 안내하는 문장을 출력합니다.
		case 2 : System.out.println(month+"월에는 28일이 있습니다."); break; //2월에는 28일이 있다고 안내하는 문장을 출력합니다.
		default : System.out.println("입력 오류"); break; // 1-12가 아닌 경우, 입력 오류를 디폴트 값으로 출력하도록 합니다.
		}
		
		//switch-case를 통해 월별로 며칠이 있는지를 만들어보았습니다.
		
		sc.close();
		
	}

}
