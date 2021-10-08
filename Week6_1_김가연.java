import java.util.Scanner; // ��ĳ�� ����� ���� import ��
class Product { // �������� �����ϱ� ���� Product �θ� Ŭ������ ������ݴϴ�.
	int price; // Product�� ���ݰ�
	int bonusPoint; // ���ʽ� ����Ʈ �ν��Ͻ� ������ �����մϴ�.
	Product(int price){ 
		this.price = price; // ������ ���ڷ� �޾� price �ν��Ͻ� ���� ���� �ֽ��ϴ�.
		bonusPoint = (int)(price/10.0); // ���ʽ� ����Ʈ�� ����� �ؼ� �����մϴ�.
	}
}

class Tv extends Product { // Tv �ڽ� Ŭ������ ������ݴϴ�.
	Tv(){
		super(100); 
	}
	public String toString() {
		return "TV";
	}
}
class Computer extends Product { // ��ǻ�� �ڽ� Ŭ������ ������ݴϴ�.
	Computer(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
class Video extends Product { // ���� �ڽ� Ŭ������ ������ݴϴ�.
	Video(){
		super(110);
	}
	public String toString() {
		return "Video";
	}
}
class Audio extends Product { // ����� �ڽ� Ŭ������ ������ݴϴ�.
	Audio(){
		super(50);
	}
	public String toString() {
		return "Audio";
	}
}
class NoteBook extends Product { // ��Ʈ�� �ڽ� Ŭ������ ������ݴϴ�.
	NoteBook(){
		super(300);
	}
	public String toString() {
		return "NoteBook";
	}
}
// �����ð��� ��� �ڵ带 Ȱ���Ͽ� ���̾� Ŭ������ �ۼ����ݴϴ�.
class Buyer{
	int money, i;
	int bonusPoint = 0;
	Product item[]=new Product[10];
	
	int buy(Product pd) { // ���߿� while���� Ż���ϱ� ���ؼ� void �Լ��� int �Լ��� �ٲپ�����ϴ�.
		if(pd.price > money) {
			System.out.println("Money is not enough.\n");
			return 0; // ���� ���� ���� ���ݺ��� �۴ٸ� �� �޼���� 0�� �����ϰ� �˴ϴ�.
		}
		System.out.println("You bought "+pd+"("+pd.price+").");
		money = money - pd.price;
		bonusPoint = bonusPoint + pd.bonusPoint;
		item[i++] = pd;
		return 1; // �ݴ�� �����ִ� ���� ����ϴٸ� ���� �ڵ带 ���� �� �ڿ� 1�� �����ϰ� �˴ϴ�.
	} // �̷��� 0�� 1�� ���� �����Ͽ�, ���߿� 0�̸� while���� Ż���ϵ��� �ڵ带 �ۼ��صξ����ϴ�.
	void summary() {
		System.out.print("\nSHOPPING LIST: ");
		for(int j=0;j<i;j++) {
			System.out.print(item[j]+" ");
		}
		System.out.println("\nMONEY LEFT: "+money);
		System.out.println("CURRENT BONUS POINT: "+bonusPoint);
	}
}


public class Week6_1_�谡�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
	    System.out.println("���� : ���̹���������");
	    System.out.println("�й� : 2071060");
	    System.out.println("���� : �谡��");
	    System.out.println("===================\n");
	    
	    Buyer Buyer = new Buyer(); // ���̾� Ŭ������ �����մϴ�.
	    Product pd[] = new Product[5]; // ��ǰ ����� �����ϱ� ���� ���δ�Ʈ Ŭ���� �迭�� ������ݴϴ�.
	    
	    // ������� Ŭ���� �迭�� ��ǰ���� �ֽ��ϴ�. ��, Ŭ���� ������ ���ݴϴ�.
	    pd[0] = new Tv();
	    pd[1] = new Computer();
	    pd[2] = new Video();
	    pd[3] = new Audio();
	    pd[4] = new NoteBook();
	    Scanner sc = new Scanner(System.in); // ��ĳ�� ����� ���� ��ĳ�� Ŭ������ �������ݴϴ�.
	    
	    int select; // ��ǰ ������ ���� ������ �������ݴϴ�.
	    int money_left = 1; // ���� ���Ҵ��� �ȳ��Ҵ����� Ȯ���Ͽ� while ���� ���������� ���� ������ �������ݴϴ�.
	    
	    System.out.println("How much money do you have?");
	    Buyer.money = sc.nextInt(); // ��ĳ�ʸ� ���� ���̾� Ŭ������ �ν��Ͻ� ������ money�� ������ �ִ� ���� �����մϴ�.
	    
	    while(true) {
	    	 System.out.println("What do you want to buy? Input 0 to quit.");
	    	 for(int i = 0; i < 5; i++ ) {
	    		 System.out.print((i+1)+". "+pd[i]+"("+pd[i].price+")     "); // �ݺ����� �迭�� ���� ��ǰ ����Ʈ�� ����ݴϴ�.
	    	 }
	    	 System.out.println("");
	    	
	    	 select = sc.nextInt(); // ��ǰ ������ ���� ��ĳ�ʷ� ��ȣ�� �޽��ϴ�.
	    	 
	    	 if(select == 0) break; // 0�� �����ϸ� while���� ���������� �˴ϴ�.
	    	 // 1~5���� ���� Ŭ���� �迭�� �ִ� ��ǰ���� ������ �� �ְ� �˴ϴ�. ���̾� Ŭ���� ���� buy �޼ҵ带 �����ŵ�ϴ�. 
	    	 else if(select == 1) {
	    		 money_left = Buyer.buy(pd[0]); // buy �޼ҵ尡 int�� �����ϴ� ���� money_left ������ �����մϴ�.
	    	 }
	    	 else if(select == 2) {
	    		 money_left = Buyer.buy(pd[1]);
	    	 }
	    	 else if(select == 3) {
	    		 money_left = Buyer.buy(pd[2]);
	    	 }
	    	 else if(select == 4) {
	    		 money_left = Buyer.buy(pd[3]);
	    	 }
	    	 else if(select == 5) {
	    		 money_left = Buyer.buy(pd[4]);
	    	 }
	    	 else { // 1~5�� �ƴ� �ٸ� ���� ������ �� ������ ������ݴϴ�.
	    		 System.out.println("No such item."); 
	    	 }
	    	 // ���⼭ �Ʊ� ����Ǿ��� money_left�� ���� 0�̶�� while���� �������ɴϴ�.
	    	 if(money_left == 0) break;	    	 
	    }
	    Buyer.summary();   // while���� ���������� ���� ���ݱ��� �����ߴ� ����Ʈ�� �̾��ִ� ���Ӹ� �޼��带 ��������ݴϴ�.
	    sc.close(); // ��ĳ�ʸ� �ݾ��ݴϴ�.
	}
}
