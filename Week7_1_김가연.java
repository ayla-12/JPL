import java.util.Scanner; // 스캐너 사용을 위한 임포트문
abstract class Pet{ // 추상클래스 Pet 정의
	String species; 
	String name;
	int age;
	// 추상 메서드 정의
	public abstract void move();
}

class Dog extends Pet{
	Dog(){ // 생성자! Dog 클래스를 생성시 종은 무조건 Dog로 기록됨
		species = "Dog";
	}
	public void move() { // 추상 메서드를 가져와서 구현부를 완성함
		System.out.println("run"); 
	}
}
class Cat extends Pet{
	Cat(){ // 생성자! Cat 클래스를 생성시 종은 무조건 Cat으로 기록됨
		species = "Cat";
	}
	public void move() {
		System.out.println("jump"); // 추상 메서드를 가져와서 구현부를 완성함
	}
}
class Bird extends Pet{
	Bird(){ // 생성자! Bird 클래스를 생성시 종은 무조건 Bird로 기록됨
		species = "Bird";
	}
	public void move() {
		System.out.println("fly"); // 추상 메서드를 가져와서 구현부를 완성함
	}
}
class Snake extends Pet{
	Snake(){ // 생성자! Snake 클래스를 생성시 종은 무조건 Snake로 기록됨
		species = "Snake";
	}
	public void move() {
		System.out.println("crawl"); // 추상 메서드를 가져와서 구현부를 완성함
	}
}

public class Week7_1_김가연 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
	    System.out.println("전공 : 사이버보안전공");
	    System.out.println("학번 : 2071060");
	    System.out.println("성명 : 김가연");
	    System.out.println("===================\n");
	    
	    Scanner sc = new Scanner(System.in); // 스캐너 사용을 위해 스캐너 클래스 생성
	    Pet petList[] = new Pet[10]; // Pet 클래스를 저장하는 참조변수 배열을 생성
	    int num=0; // 배열 넘버를 지정하기 위해 정수 변수 num 선언
	    
	    while(true) { // break를 만나기전까지 무한으로 반복되는 while문을 선언해줍니다.
	    	System.out.println("\n원하는 작업은 무엇입니까?");
	    	System.out.println("1. New input  2. Output  3. Exit");
	    	int select = sc.nextInt();
		    // select 안의 수에 따라 선택지가 달라지도록 if-else문을 사용합니다.
		    if (select == 3) break; // 만약 3번을 선택하면 즉시 반복문을 종료합니다.
		    //선택지가 1,2번이라면 각 분기점으로 들어가 코드를 실행합니다.
		    else if(select == 1) {
		    	while(true) { // 종을 선택하도록 break를 만나기전까지 반복되는 while문을 선언해줍니다.
		    		System.out.println("종은 무엇입니까?");
			    	System.out.println("1. Dog  2. Cat  3. Snake 4. Bird");
			    	int sel = sc.nextInt();
			    	sc.nextLine(); // 뒤에 nextLine이 나올 때 버퍼에 남아있는 엔터를 들고가지 않도록 버퍼를 비워줍니다.
			    	if (sel == 1) { //만약 1번이라면, 
			    		Dog dog = new Dog(); // Dog 클래스를 생성해줍니다.
			    		System.out.print("Name:"); // 그리고 그 클래스 내에 이름과
			    		dog.name = sc.nextLine();
			    		System.out.print("Age:"); // 나이를 입력받아 넣어줍니다.
			    		dog.age = sc.nextInt();
			    		petList[num++] = dog; //num 숫자를 하나씩 늘려가며 들어오는 클래스를 클래스 배열에 저장합니다.
			    		break; // 저장이 끝났으니 처음 질문으로 돌아가기 위해 안쪽 중첩 반복문을 종료합니다.
			    	}
			    	else if(sel == 2) { // 만약 2번이라면,
			    		Cat cat = new Cat(); // Cat 클래스를 생성해줍니다.
			    		System.out.print("Name:"); // 그리고 그 클래스 내에 이름과
		    			cat.name = sc.nextLine();
		    			System.out.print("Age:"); // 나이를 입력받아 넣어줍니다.
		    			cat.age = sc.nextInt();
		    			petList[num++] = cat; // num 숫자를 하나씩 늘려가며 들어오는 클래스를 클래스 배열에 저장합니다.
		    			break;// 저장이 끝났으니 처음 질문으로 돌아가기 위해 안쪽 중첩 반복문을 종료합니다.
			    	}
			    	else if(sel == 3) { // 만약 3번이라면,
			    		Snake snake = new Snake(); // Snake 클래스를 생성해줍니다.
			    		System.out.print("Name:"); // 그리고 그 클래스 내에 이름과
		    			snake.name = sc.nextLine();
		    			System.out.print("Age:"); // 나이를 입력받아 넣어줍니다.
		    			snake.age = sc.nextInt();
		    			petList[num++] = snake; // num 숫자를 하나씩 늘려가며 들어오는 클래스를 클래스 배열에 저장합니다.
		    			break; // 저장이 끝났으니 처음 질문으로 돌아가기 위해 안쪽 중첩 반복문을 종료합니다.
			    	}
			    	else if(sel == 4) { // 만약 4번이라면, 
			    		Bird bird = new Bird(); // Bird 클래스를 생성해줍니다.
			    		System.out.print("Name:"); // 그리고 그 클래스 내에 이름과
		    			bird.name = sc.nextLine();
		    			System.out.print("Age:"); // 나이를 입력받아 넣어줍니다.
		    			bird.age = sc.nextInt();
		    			petList[num++] = bird; // num 숫자를 하나씩 늘려가며 들어오는 클래스를 클래스 배열에 저장합니다.
		    			break; // 저장이 끝났으니 처음 질문으로 돌아가기 위해 안쪽 중첩 반복문을 종료합니다.
			    	}
			    	else { // 만약 선택지에 없는 숫자를 입력시,
			    		System.out.println("잘못된 입력"); // 잘못된 입력이라는 오류를 출력해줍니다.
			    	}
		    	}
		    }
		    else if(select == 2) { // 2번을 선택시 리스트를 출력해줍니다.
		    	System.out.printf("\n%-10s%-10s%-10s%-10s\n","Species","Name","Age","Movement"); // printf를 이용해서 줄 맞춰 요소들을 출력해줍니다.
				for(int j = 0 ; petList[j] != null ; j++) { // 반복문을 통해 배열 안에 있는 요소들을 차례대로 출력해줍니다. 
					System.out.printf("%-10s%-10s%-10s",petList[j].species,petList[j].name,petList[j].age);
					petList[j].move();
				}
		    }
		    else { // 잘못된 숫자 입력 시 잘못된 입력이라는 오류를 출력해줍니다.
		    	System.out.println("잘못된 입력");
		    }
	    
	    }
	    System.out.println("종료"); // 만약 무한 반복문이 종료 됐을시, 종료라는 말을 출력해줍니다.
	    sc.close(); // 스캐너 사용이 끝났으니 닫아줍니다.
	}
}
