import java.util.Scanner; // 스캐너 사용을 위한 import문
class Car{ // 부모 클래스 Car를 만들어줍니다.
	// 인스턴스 변수 선언
	private String emgType;
	private int number;
	private String carType;
	private String reqPerson;
	// 생성자를 선언합니다. 변수를 다음과 같이 4개를 받아옵니다.
	Car(String emgType, int number, String carType, String reqPerson){
		// 받아온 인자를 인스턴스 변수에 넣어 저장합니다.
		this.emgType = emgType;
		this.number = number;
		this.carType = carType;
		this.reqPerson = reqPerson;
	}
	// 메서드 선언
	// 게터와 세터 선언하기!
	// 게터
	String getEmgType() { // private 변수에 접근하기 위해 get 메서드를 만들어 접근을 할 수 있도록 합니다.
		return emgType;	}
	int getNumber() {
		return number;	}
	String getCarType() {
		return carType;	}
	String getReqPerson() {
		return reqPerson;	}
	String getStr() {
		return getEmgType() + getNumber() + getCarType() + getReqPerson();	}
	// 세터 (현재 여기서는 쓰지는 않음)
	void setEmgType(String emgType) {
		this.emgType = emgType;	}
	void setNumber(int number) {
		this.number = number;	}
	void setCarType(String carType) {
		this.carType = carType;	}
	void setReqPerson(String reqPerson) {
		this.reqPerson = reqPerson;	}
}
// 자식 클래스 만들기
class FireEngine extends Car{ // Car의 자식 클래스인 FireEngine을 만들어줍니다.
	FireEngine(){
		super("Fire",119,"FireEngine","FireFighter"); // super을 이용해 생성자를 만들어줍니다.
	}
	public String toString() {
		return getStr();
	}
}
class Ambulance extends Car{ // Car의 자식 클래스인 Ambulance를 만들어줍니다.
	Ambulance(){
		super("Patient",119,"Ambulcance","Doctor"); // super을 이용해 생성자를 만들어줍니다.
	}
	public String toString() {
		return getStr();
	}
}
class PoliceCar extends Car{ // Car의 자식 클래스인 PoliceCar를 만들어줍니다.
	PoliceCar(){
		super("Thief",112,"PoliceCar","PoliceOfficer"); // super을 이용해 생성자를 만들어줍니다.
	}
	public String toString() {
		return getStr();
	}
}
class Emergency{ // Emergency 클래스 생성
	Car emgList[] = new Car[10]; // 클래스 배열을 선언해줍니다.
	int i=0; // 배열에 입력하기 위한 정수 변수 i를 선언해줍니다.
	// 메서드 선언
	void EM_Call(Car car) {  // Car 클래스를 인자로 받는 EM_Call 메서드를 생성합니다.
		System.out.println("Call "+car.getNumber()); // 인자로 받은 클래스 안의 number을 받아와 Call과 함께 출력해줍니다.
		emgList[i++] = car; //i 숫자를 하나씩 늘려가며 들어오는 클래스를 클래스 배열에 저장합니다.
	}
	void EM_record() { // 기록을 출력해주는 EM_record 메서드 생성합니다.
		System.out.printf("%-20s%-20s%-20s%-20s\n","Emergency","Number","Car_Type","Requird"); // printf를 이용해서 줄 맞춰 요소들을 출력해줍니다.
		for(int j = 0 ; emgList[j] != null ; j++) { // 반복문을 통해 배열 안에 있는 요소들을 차례대로 출력해줍니다. 
			System.out.printf("%-20s%-20s%-20s%-20s\n",emgList[j].getEmgType(),emgList[j].getNumber(),emgList[j].getCarType(),emgList[j].getReqPerson());
		}
	}
}
public class Week6_2_김가연 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
	    System.out.println("전공 : 사이버보안전공");
	    System.out.println("학번 : 2071060");
	    System.out.println("성명 : 김가연");
	    System.out.println("===================\n");
	    
	    Emergency em = new Emergency(); // emergency 클래스 선언
	    // 사용되는 자동차 3개 클래스 선언
	    FireEngine fe = new FireEngine(); 
	    Ambulance am = new Ambulance();
	    PoliceCar pc = new PoliceCar();
	    // 스캐너 사용을 위한 클래스 선언
	    Scanner sc = new Scanner(System.in);
	    int select=0; // 선택지를 저장하기 위한 정수 변수 select를 선언해줍니다.
	    
	    while(true) { // while을 통해 무한 반복문을 만들어줍니다. break를 만나기 전까지 계속 실행됩니다. 
	    	System.out.println("What kind of Emergency?");
	    	System.out.println("1.Fire  2.Patient  3.Thief  4.Record  5.End");
		    select = sc.nextInt(); // 스캐너를 통해 선택지를 select 변수에 저장해줍니다.
		    
		    if (select == 5) break; // 만약 5번을 선택하면 즉시 반복문을 종료합니다.
		    //선택지가 1,2,3번이라면 각 자동차에 따라 EM_Call 메서드를 실행시킵니다.
		    else if(select == 1) {
		    	em.EM_Call(fe);
		    }
		    else if(select == 2) {
		    	em.EM_Call(am);
		    }
		    else if(select == 3) {
		    	em.EM_Call(pc);
		    }
		    //선택지가 4번이라면 EM_record 메서드를 실행시켜 지금까지 저장된 자동차들의 정보를 배열에서 불러옵니다.
		    else if(select == 4) {
		    	em.EM_record();
		    }
		    else { // 잘못된 숫자 입력 시 Wrong Input이라는 오류를 출력해줍니다.
		    	System.out.println("Wrong Input");
		    }
	    }
	    System.out.println("Finished"); // while문 탈출 시 끝났다고 이 문장을 출력해줍니다.
	    sc.close(); // 사용한 스캐너를 닫아줍니다.
	}
}