import java.util.Scanner; // ��ĳ�� ����� ���� import��

class Game{
	//Ŭ���� ������ ���Ǵ� �ν��Ͻ� ������ �����մϴ�.
	private int comWin, userWin, userInput, comInput;
	private String user, com;
	// �޼��� ���
	void play(){ // ������ �����ϴ� �޼����Դϴ�.
		System.out.println("���������� ������ �����մϴ�.");
		while(!(comWin == 3 || userWin == 3)) { // comWin�� userWin�� ���� 3�̵Ǹ�, �� ����ڳ� ��ǻ�Ͱ� �� �� �̱�� �Ǹ� ����Ǵ� while���� ����ϴ�.
			input(); // input() �޼��带 �ݺ��մϴ�.
		}
		System.out.printf("\nYou(%d)   Com(%d)\n",userWin,comWin); // �ݺ����� ����Ǹ� ����� ������ݴϴ�.
		if(comWin == 3) System.out.println("��ǻ�Ͱ� �̰���ϴ�."); // ���� ��ǻ�Ͱ� �̰�ٸ� ��ǻ�Ͱ� �̰�ٴ� ��¹���,
		else System.out.println("����� �̰���ϴ�."); // ����ڰ� �̰�ٸ� ����ڰ� �̰�ٴ� ������ ������ݴϴ�.
		System.out.println("������ �����մϴ�."); 
	}
	
	void input() { // ������� �Է��� �ް� ��ǻ���� ���� �������ִ� �޼����Դϴ�.
		Scanner sc = new Scanner(System.in); // �޼��� ������ ���Ǵ� ��ĳ�ʸ� �����մϴ�.
		try // ���� ó���� ���� try-catch���� Ȱ���մϴ�.
		{
			System.out.printf("\n����� ������?(You(%d) - Com(%d))\n",userWin, comWin); // ���� ����ڿ� ��ǻ���� �¸� ���� ǥ�����ݴϴ�.
			System.out.println("����(1) ����(2) ��(3)");
			userInput = sc.nextInt(); // userInput ������ ��ĳ�ʸ� ���� �Է¹޽��ϴ�.
			
			if (userInput > 3 || userInput < 1) // ���� �߸��� ���� �ްԵǸ�,
				throw new Exception("������ �߸��Ǿ����ϴ�."); // ������ �߻���Ű�� �޽����� ���ݴϴ�.
			
			//������ �߻����� ������ �Ʒ��� �ڵ带 �����մϴ�.
			comInput = (int)(Math.random() * 3 + 1); // ��ǻ�� �Է°��� ���� �Լ��� ���� �־��ݴϴ�.
			// �Է� ���� ���� user ���ڿ� ������ �ùٸ� ���� �־��ݴϴ�.
			if(userInput == 1) user = "����"; 
			else if(userInput == 2) user = "����";
			else if(userInput == 3) user = "��";
			// com ���ڿ� ���� ���� ���� ���� �Է� ���� ���� �ùٸ� ���� �־��ݴϴ�.
			if(comInput == 1) com = "����";
			else if(comInput == 2) com = "����";
			else if(comInput == 3) com = "��";
			writeOutput(); // writeOutput() �޼��带 ���� ����� ����մϴ�.
		}
		catch(Exception e) // ������ �߻��ϸ� ����� ���Ե˴ϴ�.
		{
			System.out.println(e.getMessage()); // ������ �߻���ų �� ���� �޽������� �ҷ��� ������ݴϴ�.
		}
	}
	
	void writeOutput() { // ����� ������ִ� �޼����Դϴ�.
		System.out.printf("%-8s%-8s\n","<You>","<Com>");
		System.out.printf("%-8s%-8s\n",user,com);
		switch(userInput - comInput) { // �Է°��� ������ �޾�����, �̸� ���Ͽ� switch-case�� ���� ���и� �����߽��ϴ�.
			case 1, -2 :  // userInput���� comInput�� �� ���� 1, -2�� ���� ���� (����, ��), (��, ����), (����, ����) �� ����Դϴ�.
				System.out.println("��� ��");  // ���� ����ڰ� �¸��ߴٴ� ������ ������ְ�,
				userWin++; // ������� �¸����� 1 �ø��ϴ�.
				break; // ����ġ���� �������ɴϴ�.
			case 0 :  // userInput���� comInput�� �� ���� 0�� ���� (����, ����), (����,����), (��,��)�� ����Դϴ�.
				System.out.println("���"); // ���� ���ٴ� ������ ������ְ�,
				break; // ����ġ���� �������ɴϴ�.
			case 2,-1 : // userInput���� comInput�� �� ���� 2,-1�� ���� ���� (����, ����), (����, ��), (��, ����) �� ����Դϴ�.
				System.out.println("��ǻ�� ��");  // ���� ��ǻ�Ͱ� �¸��ߴٴ� ������ ������ְ�,
				comWin++; // ��ǻ���� �¸����� 1 �ø��ϴ�.
				break; // ����ġ���� �������ɴϴ�.
		}
	}
}

public class Week8_�谡�� {
	public static void main(String[] args) {
		// �̸��� ����ϴ� �κ��Դϴ�.
		System.out.println("===================");
	    System.out.println("���� : ���̹���������");
	    System.out.println("�й� : 2071060");
	    System.out.println("���� : �谡��");
	    System.out.println("===================\n");
	    
		Game g = new Game(); // ���ο� ���� Ŭ������ ������ݴϴ�.
		g.play(); // ������ �����մϴ�.
	}

}
