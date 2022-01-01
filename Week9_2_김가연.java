import java.io.*; // io 패키지를 사용하기 위한 임포트문
import java.util.Scanner; // 스캐너 사용을 위한 임포트문

class Pet implements Serializable{ // 자식 클래스에서 Serializable을 implements하려면 부모 클래스도 동일하게 해줘야합니다.
	// 인스턴스 변수
	private String name;
	private int age;
	private double weight;
	
	// 메서드 목록
	void setPet(String newName, int newAge, double newWeight) { // 다른 메서드를 통해 클래스 내 인스턴스 변수를 설정해주는 세터 메서드
		setName(newName);
		setAge(newAge);
		setWeight(newWeight);
	}
	void setName(String newName) { // 이름을 설정하는 세터 메서드
		name = newName;
	}
	void setAge(int newAge) { // 나이를 설정하는 세터 메서드
		age = newAge;
	}
	void setWeight(double newWeight) { // 무게를 설정하는 세터 메서드
		weight = newWeight;
	}
	String getName() { // 이름에게 접근할 수 있도록 도와주는 게터 메서드
		return name;
	}
	int getAge() { // 나이에게 접근할 수 있도록 도와주는 게터 메서드
		return age;
	}
	double getWeight() { // 무게에게 접근할 수 있도록 도와주는 게터 메서드
		return weight;
	}
}

class Dog extends Pet implements Serializable {
	// Dog 클래스 내에서 사용되는 인스턴스 변수
	private String breed;
	private boolean boosterShot;
	// 변수 5개를 받는 생성자
	Dog(String name, int age, double weight, String breed, boolean boosterShot){
		setPet(name, age, weight);
		setBreed(breed);
		setBoosterShot(boosterShot);
	}
	// 메서드 목록
	void setBreed(String breed) { // 종을 설정하는 세터 메서드
		this.breed = breed;
	}
	void setBoosterShot(boolean boosterShot) { // 백신 접종 여부를 설정하는 세터 메서드
		this.boosterShot = boosterShot;
	}
	String getBreed() { // 종에게 접근할 수 있도록 도와주는 게터 메서드
		return breed;
	}
	boolean getBoosterShot() { // 백신 접종 여부에게 접근할 수 있도록 도와주는 게터 메서드
		return boosterShot;
	}
	
	public String toString() { 
		// 만약 백신을 맞지 않았다면, X로 출력되는 string
		if(getBoosterShot() == false) return String.format("%-8s%-8d%-8.1f%-12sX",getName(), getAge(), getWeight(), getBreed());
		// 백신을 맞았다면 백신 접종 여부가 O로 출력되는 string
		else return String.format("%-8s%-8d%-8.1f%-12sO",getName(), getAge(), getWeight(), getBreed());
	}
}


public class Week9_2_김가연 {
	public static void main(String[] args) {
		//이름 출력
		System.out.println("===================");
	    System.out.println("전공 : 사이버보안전공");
	    System.out.println("학번 : 2071060");
	    System.out.println("성명 : 김가연");
	    System.out.println("===================\n");
	    // 배열 선언 및 배열 초기화
	    Dog[] myDog = new Dog[10];
	    myDog[0] = new Dog("Merry", 3, 2.5, "Bulldog", false);
	    myDog[1] = new Dog("JJong", 5, 5.5, "Mix", false);
	    myDog[2] = new Dog("Kong", 4, 3, "Poodle", true);
	    myDog[3] = new Dog("Apple", 2, 2.5, "Collie", true);
	    myDog[4] = new Dog("Candy", 5, 5.5, "Coca", false);
	    myDog[5] = new Dog("Cutie", 7, 2.5, "Chiwawa", true);
	    myDog[6] = new Dog("Peace", 3, 2.5, "Huskey", false);
	    myDog[7] = new Dog("Lion", 9, 1.5, "Shepard", true);
	    myDog[8] = new Dog("Windy", 2, 9, "Jindo", true);
	    myDog[9] = new Dog("Sweetie", 1, 2.5, "Maltiz", false);
	    
	    Scanner sc = new Scanner(System.in); // 스캐너 사용을 위해 스캐너를 선언해줍니다.
	    System.out.println("Input File name to write Dog data");
	    String fileName = sc.next(); // 생성할 파일 이름을 스캐너를 통해 받아줍니다.
	    
	    try {
	    	ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName)); // 출력 스트림을 받아온 파일 이름으로 만들어줍니다.
	    	outputStream.writeObject(myDog); // 배열에 있는 값으로 object를 씁니다.
	    	outputStream.close(); // 출력스트림을 닫아줍니다.
	    }
	    catch(IOException e) { // 오류가 발생하면 다음 예외처리가 발생합니다.
	    	System.out.println("ERROR writing to file "+fileName+".");
	    	System.exit(0);
	    }
	    
	    try {
	    	System.out.printf("%-8s%-8s%-8s%-12s%-15s\n","Name","Age","Weight","Breed","BoosterShot");
	    	ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName)); // 입력스트림을 파일 이름으로 만들어줍니다.
	    	for(int i = 0 ; i < 10 ; i++) { // 반복문을 0부터 9까지 10번 돌립니다.
	    		System.out.println(myDog[i]);  // 돌려서 정보를 콘솔에 출력합니다.
	    	}
	    	inputStream.close(); // 입력스트림을 닫아줍니다.
	    }
	    catch(FileNotFoundException e) { // 파일을 찾을 수 없으면 다음 예외처리가 발생합니다.
	    	System.out.println("File Not Found Exception\n");
	    }
	    catch(IOException e) { // 입출력 관련 오류가 발생하면 다음 예외처리가 발생합니다.
	    	System.out.println("IO Exception\n");
	    }
	    catch(Exception e) { // 다른 오류 발생시 다음 예외처리가 발생합니다.
	    	System.out.println("Exception\n");
	    }
	    
	    System.out.println("\nDogs older than 2 years and did not et the boosterShot.");
	    for(int i = 0 ; i < 10 ; i++) { // 반복문을 0부터 9까지 10번 돌립니다.
	    	if(myDog[i].getAge()>2 && !myDog[i].getBoosterShot()) // 만약에 나이가 2 초과, boolean값이 false인 경우에
    		System.out.printf("%-16s%-16s\n",myDog[i].getName(),myDog[i].getBreed()); // 다음 정보를 출력합니다.
    	}
	    System.out.println("\nProgram finished");
	}
}
