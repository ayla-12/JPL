import java.util.Scanner;

class MenuOrder{
	// �ν��Ͻ� ����
	int cokePrice;
	int lemonadePrice;
	int coffeePrice;
	int inputMoney;
	String drinkSelected;
	
	//�޼��� ���
	//������ �����ϴ� �޼����Դϴ�. �޴� �̸��� ���� if������ �ٸ��� �и��߽��ϴ�.
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
	//���� ���ݵ��� ������ִ� �޼����Դϴ�.
	void showMenu() {
		System.out.println("1. Coke :"+cokePrice);
		System.out.println("2. Lemonade :"+lemonadePrice);
		System.out.println("3. Coffee :"+coffeePrice);
	}
	//����� �����ִ� �޼����Դϴ�. 
	//input ��ȣ�� ���� �б����� 3���� ������, �� �ȿ����� �Է¹��� ���ݰ� ���� ������ ���� ���� ���� �޶����ϴ�.
	void showResult(int input) {
		if (input == 1) { // 1���� �����ϸ� coke�� ���Ե˴ϴ�.
			System.out.println("Coke�� �����ϼ̽��ϴ�.");
			if (inputMoney > cokePrice) {
				System.out.println("�ܵ��� "+ (inputMoney - cokePrice) +"�Դϴ�.");
				System.out.println("���ְԵ弼��."); //���ְ� �弼��~ ��� ���� �߰��غý��ϴ�.
				inputMoney = 0; // �ܵ��� �������� ��迡�� ���� ���� �ʱ� ������ 0���� �ʱ�ȭ���ݴϴ�.
			}
			else if(inputMoney < cokePrice) {
				System.out.println((cokePrice - inputMoney)+"�� �� �־��ּ���."); //���� �����ϸ� �� �־�޶�� �մϴ�. ���⼭�� �ʱ�ȭ�� ������ �ʽ��ϴ�.
			}
			else if(inputMoney == cokePrice){
				System.out.println("���ְԵ弼��.");  // ���°� �������� �ܵ��� ���� �� ���� ���� ���� ������, ���ְ� �弼��~ �� �����ϴ�.
				inputMoney = 0;
			}
		}
		
		//�Ʒ��� �Ȱ��� �������� ����˴ϴ�.
		else if (input == 2) { // 2���� �����ϸ� lemonade�� ���� �˴ϴ�.
			System.out.println("Lemonade�� �����ϼ̽��ϴ�."); 
			if (inputMoney > lemonadePrice) {
				System.out.println("�ܵ��� "+ (inputMoney - lemonadePrice) +"�Դϴ�.");
				inputMoney = 0;
			}
			else if(inputMoney < lemonadePrice) {
				System.out.println((lemonadePrice - inputMoney)+"�� �� �־��ּ���.");
			}
		}
		else if (input == 3) { // 3���� �����ϸ� coffee�� ���� �˴ϴ�.
			System.out.println("Coffee�� �����ϼ̽��ϴ�.");
			if (inputMoney > coffeePrice) {
				System.out.println("�ܵ��� "+ (inputMoney - coffeePrice) +"�Դϴ�.");
				inputMoney = 0;
			}
			else if(inputMoney < coffeePrice) {
				System.out.println((coffeePrice - inputMoney)+"�� �� �־��ּ���.");
			}
		}
		else {
			System.out.println("���� �޴��� �����ϼ̽��ϴ�."); // input�� 1~3�� ���� ������ �ʾ����� ���� �޴���� ���� ����մϴ�. 
		}
		
	}
}

public class Week3_4_�谡�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
		System.out.println("���� : ���̹���������");
		System.out.println("�й� : 2071060");
		System.out.println("���� : �谡��");
		System.out.println("===================");
		
		// �޴����� �ν��Ͻ� ������ ��ĳ�� ����� ���� �������ݴϴ�.		
		MenuOrder myCafe = new MenuOrder();
		Scanner sc = new Scanner(System.in);
		
		// ���� ����
		System.out.print("Coke ����: ");
		myCafe.setPrice("Coke", sc.nextInt());
		System.out.print("Lemonade ����: ");
		myCafe.setPrice("Lemonade", sc.nextInt());
		System.out.print("Coffee ����: ");
		myCafe.setPrice("Coffee", sc.nextInt());
		
		// ��� �����Ұ����� ���� ������ �����ϴ� ������ ������ ������ ������ݴϴ�.
		String order_yn = "Y";
		int select ;
		
		// ���Ǳ� ���� ! �ݺ����� �����̶�� ��
		while (true) { //break�� ����Ͽ� �ݺ��� Ż���� ���� true ���� �ֽ��ϴ�.
			if (order_yn.equalsIgnoreCase("Y")) {
				System.out.println("\n--- ���� �������� ---");
				myCafe.inputMoney += sc.nextInt();
				System.out.println("--- ���Ḧ �����ϼ��� ---");
				myCafe.showMenu();
				select = sc.nextInt();
				myCafe.showResult(select);
				sc.nextLine();
				System.out.println("����Ͻðڽ��ϱ�? (y/n)");
				order_yn = sc.nextLine();

			}
			else {
				break; //y, Y �� �ƴϸ� break�� ���� �ݺ����� Ż���մϴ�.
			}
		}
		

	}

}
