import java.util.Scanner; // 스캐너 사용을 위한 import 문
class Product { // 다형성을 적용하기 위해 Product 부모 클래스를 만들어줍니다.
	int price; // Product는 가격과
	int bonusPoint; // 보너스 포인트 인스턴스 변수를 포함합니다.
	Product(int price){ 
		this.price = price; // 가격을 인자로 받아 price 인스턴스 변수 내에 넣습니다.
		bonusPoint = (int)(price/10.0); // 보너스 포인트는 계산을 해서 저장합니다.
	}
}

class Tv extends Product { // Tv 자식 클래스를 만들어줍니다.
	Tv(){
		super(100); 
	}
	public String toString() {
		return "TV";
	}
}
class Computer extends Product { // 컴퓨터 자식 클래스를 만들어줍니다.
	Computer(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
class Video extends Product { // 비디오 자식 클래스를 만들어줍니다.
	Video(){
		super(110);
	}
	public String toString() {
		return "Video";
	}
}
class Audio extends Product { // 오디오 자식 클래스를 만들어줍니다.
	Audio(){
		super(50);
	}
	public String toString() {
		return "Audio";
	}
}
class NoteBook extends Product { // 노트북 자식 클래스를 만들어줍니다.
	NoteBook(){
		super(300);
	}
	public String toString() {
		return "NoteBook";
	}
}
// 수업시간에 썼던 코드를 활용하여 바이어 클래스를 작성해줍니다.
class Buyer{
	int money, i;
	int bonusPoint = 0;
	Product item[]=new Product[10];
	
	int buy(Product pd) { // 나중에 while문을 탈출하기 위해서 void 함수를 int 함수로 바꾸어줬습니다.
		if(pd.price > money) {
			System.out.println("Money is not enough.\n");
			return 0; // 만약 가진 돈이 가격보다 작다면 이 메서드는 0을 리턴하게 됩니다.
		}
		System.out.println("You bought "+pd+"("+pd.price+").");
		money = money - pd.price;
		bonusPoint = bonusPoint + pd.bonusPoint;
		item[i++] = pd;
		return 1; // 반대로 쓸수있는 돈이 충분하다면 위의 코드를 실행 한 뒤에 1을 리턴하게 됩니다.
	} // 이렇게 0과 1을 따로 리턴하여, 나중에 0이면 while문을 탈출하도록 코드를 작성해두었습니다.
	void summary() {
		System.out.print("\nSHOPPING LIST: ");
		for(int j=0;j<i;j++) {
			System.out.print(item[j]+" ");
		}
		System.out.println("\nMONEY LEFT: "+money);
		System.out.println("CURRENT BONUS POINT: "+bonusPoint);
	}
}


public class Week6_1_김가연 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
	    System.out.println("전공 : 사이버보안전공");
	    System.out.println("학번 : 2071060");
	    System.out.println("성명 : 김가연");
	    System.out.println("===================\n");
	    
	    Buyer Buyer = new Buyer(); // 바이어 클래스를 선언합니다.
	    Product pd[] = new Product[5]; // 상품 목록을 관리하기 위해 프로덕트 클래스 배열을 만들어줍니다.
	    
	    // 순서대로 클래스 배열에 상품들을 넣습니다. 즉, 클래스 선언을 해줍니다.
	    pd[0] = new Tv();
	    pd[1] = new Computer();
	    pd[2] = new Video();
	    pd[3] = new Audio();
	    pd[4] = new NoteBook();
	    Scanner sc = new Scanner(System.in); // 스캐너 사용을 위해 스캐너 클래스를 선언해줍니다.
	    
	    int select; // 상품 선택을 위한 변수를 선언해줍니다.
	    int money_left = 1; // 돈이 남았는지 안남았는지를 확인하여 while 문을 빠져나오기 위한 변수를 선언해줍니다.
	    
	    System.out.println("How much money do you have?");
	    Buyer.money = sc.nextInt(); // 스캐너를 통해 바이어 클래스의 인스턴스 변수인 money에 가지고 있는 돈을 저장합니다.
	    
	    while(true) {
	    	 System.out.println("What do you want to buy? Input 0 to quit.");
	    	 for(int i = 0; i < 5; i++ ) {
	    		 System.out.print((i+1)+". "+pd[i]+"("+pd[i].price+")     "); // 반복문과 배열을 통해 상품 리스트를 찍어줍니다.
	    	 }
	    	 System.out.println("");
	    	
	    	 select = sc.nextInt(); // 상품 선택을 위해 스캐너로 번호를 받습니다.
	    	 
	    	 if(select == 0) break; // 0을 선택하면 while문을 빠져나가게 됩니다.
	    	 // 1~5번을 고르면 클래스 배열에 있는 상품들을 선택할 수 있게 됩니다. 바이어 클래스 내에 buy 메소드를 실행시킵니다. 
	    	 else if(select == 1) {
	    		 money_left = Buyer.buy(pd[0]); // buy 메소드가 int로 리턴하는 값을 money_left 변수에 저장합니다.
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
	    	 else { // 1~5가 아닌 다른 수가 들어오면 이 문구를 출력해줍니다.
	    		 System.out.println("No such item."); 
	    	 }
	    	 // 여기서 아까 저장되었던 money_left를 보고 0이라면 while문을 빠져나옵니다.
	    	 if(money_left == 0) break;	    	 
	    }
	    Buyer.summary();   // while문을 빠져나오고 나서 지금까지 구매했던 리스트를 뽑아주는 서머리 메서드를 실행시켜줍니다.
	    sc.close(); // 스캐너를 닫아줍니다.
	}
}
