import java.util.Scanner; // 스캐너 사용을 위한 import문

class Game{
	//클래스 내에서 사용되는 인스턴스 변수를 선언합니다.
	private int comWin, userWin, userInput, comInput;
	private String user, com;
	// 메서드 목록
	void play(){ // 게임을 시작하는 메서드입니다.
		System.out.println("가위바위보 게임을 시작합니다.");
		while(!(comWin == 3 || userWin == 3)) { // comWin과 userWin의 값이 3이되면, 즉 사용자나 컴퓨터가 세 번 이기게 되면 종료되는 while문을 만듭니다.
			input(); // input() 메서드를 반복합니다.
		}
		System.out.printf("\nYou(%d)   Com(%d)\n",userWin,comWin); // 반복문이 종료되면 결과를 출력해줍니다.
		if(comWin == 3) System.out.println("컴퓨터가 이겼습니다."); // 만약 컴퓨터가 이겼다면 컴퓨터가 이겼다는 출력문을,
		else System.out.println("당신이 이겼습니다."); // 사용자가 이겼다면 사용자가 이겼다는 문장을 출력해줍니다.
		System.out.println("게임을 종료합니다."); 
	}
	
	void input() { // 사용자의 입력을 받고 컴퓨터의 값도 지정해주는 메서드입니다.
		Scanner sc = new Scanner(System.in); // 메서드 내에서 사용되는 스캐너를 선언합니다.
		try // 예외 처리를 위해 try-catch문을 활용합니다.
		{
			System.out.printf("\n당신의 선택은?(You(%d) - Com(%d))\n",userWin, comWin); // 현재 사용자와 컴퓨터의 승리 수를 표시해줍니다.
			System.out.println("가위(1) 바위(2) 보(3)");
			userInput = sc.nextInt(); // userInput 변수에 스캐너를 통해 입력받습니다.
			
			if (userInput > 3 || userInput < 1) // 만약 잘못된 값을 받게되면,
				throw new Exception("범위가 잘못되었습니다."); // 에러를 발생시키고 메시지를 써줍니다.
			
			//에러가 발생하지 않으면 아래의 코드를 실행합니다.
			comInput = (int)(Math.random() * 3 + 1); // 컴퓨터 입력값을 랜덤 함수를 통해 넣어줍니다.
			// 입력 값에 따라서 user 문자열 변수에 올바른 값을 넣어줍니다.
			if(userInput == 1) user = "가위"; 
			else if(userInput == 2) user = "바위";
			else if(userInput == 3) user = "보";
			// com 문자열 변수 또한 위와 같이 입력 값에 따라 올바른 값을 넣어줍니다.
			if(comInput == 1) com = "가위";
			else if(comInput == 2) com = "바위";
			else if(comInput == 3) com = "보";
			writeOutput(); // writeOutput() 메서드를 통해 결과를 출력합니다.
		}
		catch(Exception e) // 에러가 발생하면 여기로 오게됩니다.
		{
			System.out.println(e.getMessage()); // 에러를 발생시킬 때 넣은 메시지값을 불러와 출력해줍니다.
		}
	}
	
	void writeOutput() { // 결과를 출력해주는 메서드입니다.
		System.out.printf("%-8s%-8s\n","<You>","<Com>");
		System.out.printf("%-8s%-8s\n",user,com);
		switch(userInput - comInput) { // 입력값을 정수로 받았으니, 이를 비교하여 switch-case를 통해 승패를 구현했습니다.
			case 1, -2 :  // userInput에서 comInput을 뺀 값이 1, -2가 나온 경우는 (가위, 보), (보, 바위), (바위, 가위) 인 경우입니다.
				System.out.println("당신 승");  // 따라서 사용자가 승리했다는 문장을 출력해주고,
				userWin++; // 사용자의 승리수를 1 올립니다.
				break; // 스위치문을 빠져나옵니다.
			case 0 :  // userInput에서 comInput을 뺀 값이 0인 경우는 (가위, 가위), (바위,바위), (보,보)인 경우입니다.
				System.out.println("비김"); // 따라서 비겼다는 문장을 출력해주고,
				break; // 스위치문을 빠져나옵니다.
			case 2,-1 : // userInput에서 comInput을 뺀 값이 2,-1가 나온 경우는 (가위, 바위), (바위, 보), (보, 가위) 인 경우입니다.
				System.out.println("컴퓨터 승");  // 따라서 컴퓨터가 승리했다는 문장을 출력해주고,
				comWin++; // 컴퓨터의 승리수를 1 올립니다.
				break; // 스위치문을 빠져나옵니다.
		}
	}
}

public class Week8_김가연 {
	public static void main(String[] args) {
		// 이름을 출력하는 부분입니다.
		System.out.println("===================");
	    System.out.println("전공 : 사이버보안전공");
	    System.out.println("학번 : 2071060");
	    System.out.println("성명 : 김가연");
	    System.out.println("===================\n");
	    
		Game g = new Game(); // 새로운 게임 클래스를 만들어줍니다.
		g.play(); // 게임을 시작합니다.
	}

}
