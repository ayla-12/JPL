import java.util.Scanner; // 스캐너 사용을 위한 임포트문

class Shape{ // 도형 클래스 선언
	private int x; // 멤버 변수 선언
	private int y;
	Scanner sc = new Scanner(System.in); // 클래스 내에서 사용할 스캐너 생성
	// 메서드 선언
	void setPoint() { // point를 입력받아 인스턴스 변수안에 넣어주는 메서드
		System.out.print("x = ");
		x = sc.nextInt();
		System.out.print("y = ");
		y = sc.nextInt();
	}
	void display() { // 포인트를 출력하는 메서드
		System.out.println("Point (x,y) = ("+x+","+y+")");
	}
}
class Circle extends Shape{ // 모양 클래스를 상속받아 원 클래스를 만듭니다.
	private int radius; // 추가 멤버 변수 선언
	// 메서드 선언
	void setPoint() { // point와 반지름을 입력받는 메서드
		super.setPoint(); // super을 이용해서 shape의 코드를 재활용합니다.
		System.out.print("r = "); // 반지름 요소를 입력받습니다.
		radius = sc.nextInt(); // 오버라이딩
		return;
	}
	void display() { // display메서드를 오버라이딩 합니다.
		super.display(); // point의 정보 뿐만 아니라
		System.out.println("Radius r = "+radius); // 반지름 정보도 함께 출력해줍니다.
 		return;
	}
}
class Rectangle extends Shape{ // 모양 클래스를 상속받아 직사각형 클래스를 만듭ㄴ디ㅏ.
	private int width; // 추가 멤버 변수 선언
	private int height;
	
	void setPoint() { // setPoint 메서드를 오버라이딩 합니다.
		super.setPoint(); // super을 통해 겹치는 코드를 재활용합니다.
		System.out.print("w = "); // 밑변의 길이를 받아줍니다.
		width = sc.nextInt();
		System.out.print("h = "); // 높이의 길이를 받아줍니다.
		height = sc.nextInt();
		return;
	}
	void display() { // display 메서드를 오버라이딩 합니다.
		super.display(); // point의 정보도 출력하고
		System.out.println("Width: "+width+", Height: "+height); // 밑변, 높이의 정보도 출력합니다.
		return;
	}
}

public class HW1_4_김가연 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
	    System.out.println("전공 : 사이버보안전공");
	    System.out.println("학번 : 2071060");
	    System.out.println("성명 : 김가연");
	    System.out.println("===================\n");
	    
	    Scanner sc = new Scanner(System.in); // 스캐너 사용을 위해서  스캐너 클래스를 생성합니다.
	    Shape[] MyShape = new Shape[10]; // 다형성을 활용하여 부모 클래스인 shape 클래스 배열을 생성합니다.
	    	    
	    for(int i = 0 ; i<10 ; i++) { // 배열의 칸이 전부 찰 때까지 반복문을 돌립니다.
	    	System.out.println("\n1.Circle   2.Rectangle   3.Show   4.Exit");
		    int sel = sc.nextInt();
	    	if(sel == 4) break; // 만약 선택지가 4라면 즉시 반복문을 종료합니다.
	    	else if(sel == 1) { // 선택지가 1이라면
	    		MyShape[i] = new Circle(); // 원 클래스를 생성합니다.
	    		MyShape[i].setPoint(); // 그리고 정보를 세팅합니다.
	    		continue;
	    	}
	    	else if(sel == 2) { // 만약 선택지가 2라면
	    		MyShape[i] = new Rectangle(); // 직사각형 클래스를 생성합니다.
	    		MyShape[i].setPoint(); // 그리고 정보를 세팅합니다.
	    		continue;
	    	} 
	    	else if(sel == 3) { // 선택지가 3이라면
	    		for(int j=0;j<i;j++) { // 지금까지 쌓인 데이터를 출력합니다.
	    			MyShape[j].display();
	    		}
	    		--i; // 이 선택지를 택하게 되면 배열에는 입력되지 않았기 때문에 i에서 1을 빼줍니다. 이대로 넘어가면 null 값이 남아 나중에 리스트를 출력할 때 오류가 발생합니다.
	    		continue;
	    	}
	    	else {
	    		System.out.println("Wrong Input"); // 만약 선택지에 없는 수를 입력받았다면 오류를 출력합니다.
	    	}
	    }
	    sc.close(); // 스캐너 사용이 끝났으므로 닫아줍니다.
	}

}
