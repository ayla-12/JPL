import java.util.Scanner; // 스캐너 사용을 위한 임포트 코드

class Pet{
	// 부모 클래스 pet의 인스턴스 변수 선언
	private String name;
	private int age;
	private double weight;
	
	// 메서드 선언
	void writeOutput() { // 정보를 출력해주는 메서드 -> 나중에 오버라이딩 됨!
		System.out.println("Name:"+getName());
		System.out.println("Age:"+getAge());
		System.out.println("Weight:"+getWeight());
	}
	void setPet(String name, int age, double weight) { // 이름, 나이, 무게를 받아 인스턴스 변수에 넣어주는 메소드
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	void setName(String name) { // 이름을 받아 인스턴스 변수에 넣어주는 메서드
		this.name = name; // this를 활용하여 구분해줍니다.
	}
	void setAge(int age) { // 나이를 받아 인스턴스 변수에 넣어주는 메서드
		this.age = age; 
	}
	void setWeight(double weight) { // 무게를 받아 인스턴스 변수에 넣어주는 메서드
		this.weight = weight;
	}
	String getName(){ // name 인스턴스 변수가 private 이므로 이 메서드를 통해 접근해줍니다.
		return name;
	}
	int getAge() { // age 인스턴스 변수가 private 이므로 이 메서드를 통해 접근해줍니다.
		return age;
	}
	double getWeight() { // weight 인스턴스 변수가 private 이므로 이 메서드를 통해 접근해줍니다.
		return weight;
	}
	void move() { // 부모 클래스 move에서는 문제대로 ~ moves. 로 출력합니다. 이후 오버라이딩 될 예정입니다.
		System.out.println(getName()+" moves.");
	}
}
class Dog extends Pet{ // 부모 클래스인 Pet을 상속받는 자식 클래스 Dog 선언
	private boolean BoosterShot; // Dog 내에서만 쓰이는 인스턴스 변수 BoosterShot을 선언합니다.
	
	// 메서드 선언
	void writeOutput() { // 정보를 출력해주는 메서드 -> Dog 클래스 내에서는 이름, 나이, 무게와 백신 접종 여부를 출력합니다.
		super.writeOutput(); // super을 사용하여 중복되는 코드를 쓰지 않고 상속받아 사용합니다.
		// Boolean 형태로 저장되어있으므로 이를 if문으로 비교합니다.
		if(getBoosterShot()) { // 저장된 boolean이 true이면 
			System.out.println("BoosterShot: O"); // 이 문장을 출력하고,
		}
		else { // 저장된 boolean이 true가 아니면, 즉 false이면
			System.out.println("BoosterShot: X"); // 이 문장을 출력하는 메서드입니다.
		}
	}
	void setBoosterShot(boolean BoosterShot) { // boolean 값을 받아 BoosterShot 변수에 저장하는 메서드입니다.
		this.BoosterShot = BoosterShot;
	}
	boolean getBoosterShot() { // BoosterShot은 private 변수이므로 접근할 때 이 메서드를 사용해줍니다.
		return BoosterShot;
	}
	void move() { // Dog 클래스에서는 move 메서드를 다음과 같이 오버라이딩 해줍니다.
		System.out.println(getName()+" walks and runs.\n"); // dog 클래스에서 move를 사용하게 되면 ~ moves. 가 아닌 ~ walks and runs. 가 출력되게 됩니다.
	}
}
class Cat extends Pet{ // 부모 클래스인 Pet을 상속받는 자식 클래스 Cat 선언
	private String color; // Cat 클래스 내에서만 사용되는 인스턴스 변수 color를 선언합니다.
	
	// 메서드 선언
	void writeOutput() { // 정보를 출력해주는 메서드 -> 오버라이딩을 통해 Cat 클래스 내에서는 이름, 나이, 무게와 색에 대한 정보를 출력합니다.
		super.writeOutput(); // super을사용하여 중복되는 코드를 쓰지 않고 상속받아 사용합니다.
		System.out.println("Color: "+getColor());
	}
	void setColor(String color) { // color에 대한 정보를 받아 인스턴스 변수 내에 저장해주는 메서드입니다.
		this.color = color;
	}
	String getColor() { // color은 private 변수이므로 color에 접근할 때는 이 메서드를 사용해줍니다. 
		return color;
	} 
	void move() { // Cat 클래스에서는 move 메서드를 다음과 같이 오버라이딩 합니다.
		System.out.println(getName()+" creeps and jumps.\n"); // cat 클래스에서 move를 사용하게 되면 ~ moves.가 아닌 ~ creeps and jumps. 가 출력되게 됩니다.
	}
}

public class Week5_2_김가연 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
	    System.out.println("전공 : 사이버보안전공");
	    System.out.println("학번 : 2071060");
	    System.out.println("성명 : 김가연");
	    System.out.println("===================\n");
	    
	    Scanner sc = new Scanner(System.in); // 스캐너 사용을 위한 스캐너 클래스 선언
	    Dog[] dog = new Dog[3]; // 인스턴스 배열 선언
	    for(int i=0;i<3;i++) { // 반복문을 통해서 생성자를 불러줍니다.
	    	dog[i] = new Dog();
	    }
	    Cat[] cat = new Cat[3]; // 인스턴스 cat 배열 선언
	    for(int i = 0;i<3;i++) { // 이 또한 반복문을 통해 생성자를 불러줍니다.
	    	cat[i] = new Cat();
	    }
	    
	    String yn; // 나중에 boolean 정보를 받을 때 활용되는 변수입니다.
	    
	    for (int i=0; i<3;i++) { // 반복문을 통해 Dog 에 대한 정보를 받습니다.
	    	System.out.printf("\n<<Dog %d>> \n",i+1); // printf를 활용하여 반복문을 통해 숫자가 하나씩 올라갈 수 있도록 출력합니다.
	    	System.out.print("Name :");
	    	dog[i].setName(sc.nextLine());
	    	System.out.print("Age :");
	    	dog[i].setAge(sc.nextInt());
	    	System.out.print("Weight :");
	    	dog[i].setWeight(sc.nextDouble());
	    	sc.nextLine();
	    	System.out.print("BoosterShot(y/n) :"); // y/n으로 문자를 받으므로, 미리 만들어 놓은 String yn 안에 문자를 저장합니다.
	    	yn = sc.nextLine();
	    	if (yn.equalsIgnoreCase("Y")) { // 그리고 equalsIgnoreCase를 이용하여 Y,y이면 boolean 정보에 true를 저장하고,
	    		dog[i].setBoosterShot(true);
	    	} 
	    	else { // 아닐시에는 boolean 정보에 false를 저장합니다.
	    		dog[i].setBoosterShot(false);
	    	}
	    }
	    
	    for (int i=0; i<3;i++) { // 반복문을 통해 Cat 에 대한 정보를 받습니다.
	    	System.out.printf("\n<<Cat %d>> \n",i+1); // 이 또한 위의 Dog 반복문과 같이 printf문을 활용했습니다.
	    	System.out.print("Name :");
	    	cat[i].setName(sc.nextLine());
	    	System.out.print("Age :");
	    	cat[i].setAge(sc.nextInt());
	    	System.out.print("Weight :");
	    	cat[i].setWeight(sc.nextDouble());
	    	sc.nextLine();
	    	System.out.print("Color :");
	    	cat[i].setColor(sc.nextLine());
	    }
	    
	    System.out.println("\n<<Dog List>>"); // 반복문을 통해서 Dog List를 출력합니다.
	    for(int i=0;i<3;i++) {
	    	dog[i].writeOutput(); // 각각 Dog의 정보를 출력합니다.
	    	dog[i].move(); // 각각 Dog가 움직이는 메서드를 출력합니다.
	    }
	    
	    System.out.println("\n<<Cat List>>"); // 반복문을 통해서 Cat List를 출력합니다.
	    for(int i=0;i<3;i++) { 
	    	cat[i].writeOutput(); // 각각 Cat의 정보를 출력합니다.
	    	cat[i].move(); // 각각 Cat이 움직이는 메서드를 출력합니다.
	    }
	    
	    System.out.println("\n* Dogs older than 2 years and no boostershot are...");
	    for(int i = 0;i<3;i++) { // 반복문을 통해 인스턴스 배열 내 저장된 정보를 비교합니다.
	    	if (dog[i].getAge()>2 && dog[i].getBoosterShot() == false) { // if문을 통해 조건을 만족시키는 값이 있으면
	    		System.out.print(dog[i].getName()+" "); // 강아지의 이름을 출력합니다.
	    	}
	    }
	    System.out.println("\n* Black cats weights more than 3Kg are..."); 
	    for(int i = 0;i<3;i++) { // 반복문을 통해 인스턴스 배열 내 저장된 정보를 비교합니다.
	    	if (cat[i].getWeight()>=3 && cat[i].getColor().equalsIgnoreCase("black")) { // if문을 통해 조건을 만족시키는 값이 있으면
	    		System.out.print(cat[i].getName()+" "); // 고양이의 이름을 출력합니다.
	    	}
	    }
	}

}
