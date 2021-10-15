import java.util.Scanner; // ��ĳ�� ����� ���� ����Ʈ��

class DiceGame{ // DiceGame Ŭ���� ����
	// ��� ���� ����
	private int diceFace; 
	private int userGuess;
	// �޼��� ����
	private int rollDice() { // �ֻ����� ������ �޼���
		System.out.println("Dice is rolled!!!");
		diceFace = ((int)(Math.random()*6 + 1)); // �������� 1�������� 6���� ����
		return diceFace; // ������ ���� ��ȯ�մϴ�.
	}
	
	private int getUserInput() { // ����ڷκ��� �Է��� �ޱ����� �޼���
		Scanner sc1 = new Scanner(System.in); // �Է��� �ޱ����� �޼��� ������ ��ĳ�� Ŭ������ �����մϴ�.
		int userInput=0; // ���������� �ʱ�ȭ �����ݴϴ�. 
		System.out.println("Guess the number! What do you think?");
		while(true) { // ������ �´� ���� ���ö����� �ݺ��ϴ� while��
			userInput = sc1.nextInt(); // ���� ���� userInput ������ �����մϴ�.
			if(userInput>=1 & userInput<=6) { // ���� �Է¹��� ���� 1~6 ���̶��,
				this.userGuess = userInput; // �Է¹��� ���� Ŭ���� ���� ������ �����մϴ�.
				break; // �ݺ����� �������ɴϴ�.
			}
			System.out.println("Input number between 1~6."); // ���� ���̶�� ������ ����ϰ� �ٽ� ���ư��ϴ�.
		}
		sc1.close(); // ��ĳ�� ����� �������Ƿ� �ݾ��ݴϴ�.
		return userGuess; // while���� ���������� userGuess ���� ��ȯ�մϴ�.
	}
	private void checkUserGuess(int a) { // ������ ���� ����ڰ� �Է��� ���� ���ϴ� �޼���
		if(a == getUserInput()) { // ���࿡ ����ٸ�
			System.out.println("Bingo!!!"); // ����ٴ� ��Ʈ�� ����մϴ�.
		}
		else { //���࿡ Ʋ�ȴٸ�
			System.out.println("Wrong! ...."); // Ʋ�ȴٴ� ��Ʈ�� ����ϰ�
			System.out.printf("The face was %d\n",a); // ���� ���� �˷��ݴϴ�.
		}
	}
	void startPlaying() { // ������ �����ϴ� �޼���
		System.out.println("<< GAME START >>");
		checkUserGuess(rollDice()); // rollDice���� �Ѱ��� ���ϰ��� checkUserGuess �޼��忡 �־� �޼������ �����մϴ�.
		
	}
	
}

public class HW1_2_�谡�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
	    System.out.println("���� : ���̹���������");
	    System.out.println("�й� : 2071060");
	    System.out.println("���� : �谡��");
	    System.out.println("===================\n");
	    
		Scanner sc = new Scanner(System.in); // ��ĳ�� ����� ���� ��ĳ�� Ŭ���� ����
		DiceGame dg = new DiceGame(); // ������ �ϱ� ���� Ŭ���� ����
		
		do { // do-while�� ���� �ѹ��� �� ����Ǵ� �ݺ����� ����ϴ�.
			dg.startPlaying();
			System.out.println("Try again?(y/n)");
			if(sc.nextLine().equalsIgnoreCase("n")) break; // ���� n�̳� N�� �Է��ϸ� �ڵ带 �����մϴ�.
			
		}
		while(true);
		sc.close(); // ��ĳ�� ����� �������Ƿ� �ݾ��ݴϴ�.
		
	}

}
