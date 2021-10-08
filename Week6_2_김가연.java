import java.util.Scanner; // ��ĳ�� ����� ���� import��
class Car{ // �θ� Ŭ���� Car�� ������ݴϴ�.
	// �ν��Ͻ� ���� ����
	private String emgType;
	private int number;
	private String carType;
	private String reqPerson;
	// �����ڸ� �����մϴ�. ������ ������ ���� 4���� �޾ƿɴϴ�.
	Car(String emgType, int number, String carType, String reqPerson){
		// �޾ƿ� ���ڸ� �ν��Ͻ� ������ �־� �����մϴ�.
		this.emgType = emgType;
		this.number = number;
		this.carType = carType;
		this.reqPerson = reqPerson;
	}
	// �޼��� ����
	// ���Ϳ� ���� �����ϱ�!
	// ����
	String getEmgType() { // private ������ �����ϱ� ���� get �޼��带 ����� ������ �� �� �ֵ��� �մϴ�.
		return emgType;	}
	int getNumber() {
		return number;	}
	String getCarType() {
		return carType;	}
	String getReqPerson() {
		return reqPerson;	}
	String getStr() {
		return getEmgType() + getNumber() + getCarType() + getReqPerson();	}
	// ���� (���� ���⼭�� ������ ����)
	void setEmgType(String emgType) {
		this.emgType = emgType;	}
	void setNumber(int number) {
		this.number = number;	}
	void setCarType(String carType) {
		this.carType = carType;	}
	void setReqPerson(String reqPerson) {
		this.reqPerson = reqPerson;	}
}
// �ڽ� Ŭ���� �����
class FireEngine extends Car{ // Car�� �ڽ� Ŭ������ FireEngine�� ������ݴϴ�.
	FireEngine(){
		super("Fire",119,"FireEngine","FireFighter"); // super�� �̿��� �����ڸ� ������ݴϴ�.
	}
	public String toString() {
		return getStr();
	}
}
class Ambulance extends Car{ // Car�� �ڽ� Ŭ������ Ambulance�� ������ݴϴ�.
	Ambulance(){
		super("Patient",119,"Ambulcance","Doctor"); // super�� �̿��� �����ڸ� ������ݴϴ�.
	}
	public String toString() {
		return getStr();
	}
}
class PoliceCar extends Car{ // Car�� �ڽ� Ŭ������ PoliceCar�� ������ݴϴ�.
	PoliceCar(){
		super("Thief",112,"PoliceCar","PoliceOfficer"); // super�� �̿��� �����ڸ� ������ݴϴ�.
	}
	public String toString() {
		return getStr();
	}
}
class Emergency{ // Emergency Ŭ���� ����
	Car emgList[] = new Car[10]; // Ŭ���� �迭�� �������ݴϴ�.
	int i=0; // �迭�� �Է��ϱ� ���� ���� ���� i�� �������ݴϴ�.
	// �޼��� ����
	void EM_Call(Car car) {  // Car Ŭ������ ���ڷ� �޴� EM_Call �޼��带 �����մϴ�.
		System.out.println("Call "+car.getNumber()); // ���ڷ� ���� Ŭ���� ���� number�� �޾ƿ� Call�� �Բ� ������ݴϴ�.
		emgList[i++] = car; //i ���ڸ� �ϳ��� �÷����� ������ Ŭ������ Ŭ���� �迭�� �����մϴ�.
	}
	void EM_record() { // ����� ������ִ� EM_record �޼��� �����մϴ�.
		System.out.printf("%-20s%-20s%-20s%-20s\n","Emergency","Number","Car_Type","Requird"); // printf�� �̿��ؼ� �� ���� ��ҵ��� ������ݴϴ�.
		for(int j = 0 ; emgList[j] != null ; j++) { // �ݺ����� ���� �迭 �ȿ� �ִ� ��ҵ��� ���ʴ�� ������ݴϴ�. 
			System.out.printf("%-20s%-20s%-20s%-20s\n",emgList[j].getEmgType(),emgList[j].getNumber(),emgList[j].getCarType(),emgList[j].getReqPerson());
		}
	}
}
public class Week6_2_�谡�� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
	    System.out.println("���� : ���̹���������");
	    System.out.println("�й� : 2071060");
	    System.out.println("���� : �谡��");
	    System.out.println("===================\n");
	    
	    Emergency em = new Emergency(); // emergency Ŭ���� ����
	    // ���Ǵ� �ڵ��� 3�� Ŭ���� ����
	    FireEngine fe = new FireEngine(); 
	    Ambulance am = new Ambulance();
	    PoliceCar pc = new PoliceCar();
	    // ��ĳ�� ����� ���� Ŭ���� ����
	    Scanner sc = new Scanner(System.in);
	    int select=0; // �������� �����ϱ� ���� ���� ���� select�� �������ݴϴ�.
	    
	    while(true) { // while�� ���� ���� �ݺ����� ������ݴϴ�. break�� ������ ������ ��� ����˴ϴ�. 
	    	System.out.println("What kind of Emergency?");
	    	System.out.println("1.Fire  2.Patient  3.Thief  4.Record  5.End");
		    select = sc.nextInt(); // ��ĳ�ʸ� ���� �������� select ������ �������ݴϴ�.
		    
		    if (select == 5) break; // ���� 5���� �����ϸ� ��� �ݺ����� �����մϴ�.
		    //�������� 1,2,3���̶�� �� �ڵ����� ���� EM_Call �޼��带 �����ŵ�ϴ�.
		    else if(select == 1) {
		    	em.EM_Call(fe);
		    }
		    else if(select == 2) {
		    	em.EM_Call(am);
		    }
		    else if(select == 3) {
		    	em.EM_Call(pc);
		    }
		    //�������� 4���̶�� EM_record �޼��带 ������� ���ݱ��� ����� �ڵ������� ������ �迭���� �ҷ��ɴϴ�.
		    else if(select == 4) {
		    	em.EM_record();
		    }
		    else { // �߸��� ���� �Է� �� Wrong Input�̶�� ������ ������ݴϴ�.
		    	System.out.println("Wrong Input");
		    }
	    }
	    System.out.println("Finished"); // while�� Ż�� �� �����ٰ� �� ������ ������ݴϴ�.
	    sc.close(); // ����� ��ĳ�ʸ� �ݾ��ݴϴ�.
	}
}