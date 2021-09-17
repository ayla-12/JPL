import java.util.Scanner;

class MenuOrder{
	// 인스턴스 변수
	int cokePrice;
	int lemonadePrice;
	int coffeePrice;
	int inputMoney;
	String drinkSelected;
	
	//메서드 목록
	//가격을 설정하는 메서드입니다. 메뉴 이름에 따라서 if문으로 다르게 분리했습니다.
	void setPrice(String menu, int price) {
		if (menu == "Coke") {
			cokePrice = price;
		}
		else if (menu == "Lemonade") {
			lemonadePrice = price;
		}
		else {
			coffeePrice = price;
		}
	}
	//받은 가격들을 출력해주는 메서드입니다.
	void showMenu() {
		System.out.println("1. Coke :"+cokePrice);
		System.out.println("2. Lemonade :"+lemonadePrice);
		System.out.println("3. Coffee :"+coffeePrice);
	}
	//결과를 보여주는 메서드입니다. 
	//input 번호에 따라서 분기점이 3개로 갈리고, 그 안에서도 입력받은 가격과 음료 가격의 차에 따라 말이 달라집니다.
	void showResult(int input) {
		if (input == 1) { // 1번을 선택하면 coke로 들어가게됩니다.
			System.out.println("Coke를 선택하셨습니다.");
			if (inputMoney > cokePrice) {
				System.out.println("잔돈은 "+ (inputMoney - cokePrice) +"입니다.");
				System.out.println("맛있게드세요."); //맛있게 드세요~ 라는 말을 추가해봤습니다.
				inputMoney = 0; // 잔돈을 내놓으면 기계에는 돈이 남지 않기 때문에 0으로 초기화해줍니다.
			}
			else if(inputMoney < cokePrice) {
				System.out.println((cokePrice - inputMoney)+"원 더 넣어주세요."); //돈이 부족하면 더 넣어달라고 합니다. 여기서는 초기화를 해주지 않습니다.
			}
			else if(inputMoney == cokePrice){
				System.out.println("맛있게드세요.");  // 딱맞게 떨어지면 잔돈도 없고 더 받을 돈도 없기 때문에, 맛있게 드세요~ 로 끝냅니다.
				inputMoney = 0;
			}
		}
		
		//아래는 똑같은 과정으로 진행됩니다.
		else if (input == 2) { // 2번을 선택하면 lemonade로 들어가게 됩니다.
			System.out.println("Lemonade를 선택하셨습니다."); 
			if (inputMoney > lemonadePrice) {
				System.out.println("잔돈은 "+ (inputMoney - lemonadePrice) +"입니다.");
				inputMoney = 0;
			}
			else if(inputMoney < lemonadePrice) {
				System.out.println((lemonadePrice - inputMoney)+"원 더 넣어주세요.");
			}
		}
		else if (input == 3) { // 3번을 선택하면 coffee로 들어가게 됩니다.
			System.out.println("Coffee를 선택하셨습니다.");
			if (inputMoney > coffeePrice) {
				System.out.println("잔돈은 "+ (inputMoney - coffeePrice) +"입니다.");
				inputMoney = 0;
			}
			else if(inputMoney < coffeePrice) {
				System.out.println((coffeePrice - inputMoney)+"원 더 넣어주세요.");
			}
		}
		else {
			System.out.println("없는 메뉴를 선택하셨습니다."); // input에 1~3번 값이 들어오지 않았으면 없는 메뉴라는 말을 출력합니다. 
		}
		
	}
}

public class Week3_4_김가연 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
		System.out.println("전공 : 사이버보안전공");
		System.out.println("학번 : 2071060");
		System.out.println("성명 : 김가연");
		System.out.println("===================");
		
		// 메뉴오더 인스턴스 생성과 스캐너 사용을 위해 선언해줍니다.		
		MenuOrder myCafe = new MenuOrder();
		Scanner sc = new Scanner(System.in);
		
		// 가격 설정
		System.out.print("Coke 가격: ");
		myCafe.setPrice("Coke", sc.nextInt());
		System.out.print("Lemonade 가격: ");
		myCafe.setPrice("Lemonade", sc.nextInt());
		System.out.print("Coffee 가격: ");
		myCafe.setPrice("Coffee", sc.nextInt());
		
		// 계속 진행할건지에 대한 정보를 저장하는 변수와 선택지 변수를 만들어줍니다.
		String order_yn = "Y";
		int select ;
		
		// 자판기 시작 ! 반복문의 시작이라는 뜻
		while (true) { //break를 사용하여 반복문 탈출을 위해 true 값을 넣습니다.
			if (order_yn.equalsIgnoreCase("Y")) {
				System.out.println("\n--- 돈을 넣으세요 ---");
				myCafe.inputMoney += sc.nextInt();
				System.out.println("--- 음료를 선택하세요 ---");
				myCafe.showMenu();
				select = sc.nextInt();
				myCafe.showResult(select);
				sc.nextLine();
				System.out.println("계속하시겠습니까? (y/n)");
				order_yn = sc.nextLine();

			}
			else {
				break; //y, Y 가 아니면 break를 통해 반복문을 탈출합니다.
			}
		}
		

	}

}
