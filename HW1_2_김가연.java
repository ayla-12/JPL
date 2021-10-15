import java.util.Scanner; // 스캐너 사용을 위한 임포트문

class DiceGame{ // DiceGame 클래스 선언
	// 멤버 변수 선언
	private int diceFace; 
	private int userGuess;
	// 메서드 선언
	private int rollDice() { // 주사위를 굴리는 메서드
		System.out.println("Dice is rolled!!!");
		diceFace = ((int)(Math.random()*6 + 1)); // 랜덤으로 1에서부터 6까지 추출
		return diceFace; // 추출한 수를 반환합니다.
	}
	
	private int getUserInput() { // 사용자로부터 입력을 받기위한 메서드
		Scanner sc1 = new Scanner(System.in); // 입력을 받기위해 메서드 내에서 스캐너 클래스를 생성합니다.
		int userInput=0; // 지역변수를 초기화 시켜줍니다. 
		System.out.println("Guess the number! What do you think?");
		while(true) { // 범위에 맞는 값이 들어올때까지 반복하는 while문
			userInput = sc1.nextInt(); // 받은 값을 userInput 변수에 저장합니다.
			if(userInput>=1 & userInput<=6) { // 만약 입력받은 수가 1~6 사이라면,
				this.userGuess = userInput; // 입력받은 값을 클래스 내의 변수에 저장합니다.
				break; // 반복문을 빠져나옵니다.
			}
			System.out.println("Input number between 1~6."); // 범위 밖이라면 오류를 출력하고 다시 돌아갑니다.
		}
		sc1.close(); // 스캐너 사용이 끝났으므로 닫아줍니다.
		return userGuess; // while문을 빠져나오면 userGuess 값을 반환합니다.
	}
	private void checkUserGuess(int a) { // 추출한 수와 사용자가 입력한 값을 비교하는 메서드
		if(a == getUserInput()) { // 만약에 맞췄다면
			System.out.println("Bingo!!!"); // 맞췄다는 멘트를 출력합니다.
		}
		else { //만약에 틀렸다면
			System.out.println("Wrong! ...."); // 틀렸다는 멘트를 출력하고
			System.out.printf("The face was %d\n",a); // 원래 값을 알려줍니다.
		}
	}
	void startPlaying() { // 게임을 실행하는 메서드
		System.out.println("<< GAME START >>");
		checkUserGuess(rollDice()); // rollDice에서 넘겨준 리턴값을 checkUserGuess 메서드에 넣어 메서드들을 실행합니다.
		
	}
	
}

public class HW1_2_김가연 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
	    System.out.println("전공 : 사이버보안전공");
	    System.out.println("학번 : 2071060");
	    System.out.println("성명 : 김가연");
	    System.out.println("===================\n");
	    
		Scanner sc = new Scanner(System.in); // 스캐너 사용을 위한 스캐너 클래스 생성
		DiceGame dg = new DiceGame(); // 게임을 하기 위한 클래스 생성
		
		do { // do-while을 통해 한번은 꼭 실행되는 반복문을 만듭니다.
			dg.startPlaying();
			System.out.println("Try again?(y/n)");
			if(sc.nextLine().equalsIgnoreCase("n")) break; // 만약 n이나 N을 입력하면 코드를 종료합니다.
			
		}
		while(true);
		sc.close(); // 스캐너 사용이 끝났으므로 닫아줍니다.
		
	}

}
