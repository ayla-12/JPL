import java.io.*; // io ��Ű���� ����ϱ� ���� ����Ʈ��
import java.util.Scanner; // ��ĳ�� ����� ���� ����Ʈ��

class Pet implements Serializable{ // �ڽ� Ŭ�������� Serializable�� implements�Ϸ��� �θ� Ŭ������ �����ϰ� ������մϴ�.
	// �ν��Ͻ� ����
	private String name;
	private int age;
	private double weight;
	
	// �޼��� ���
	void setPet(String newName, int newAge, double newWeight) { // �ٸ� �޼��带 ���� Ŭ���� �� �ν��Ͻ� ������ �������ִ� ���� �޼���
		setName(newName);
		setAge(newAge);
		setWeight(newWeight);
	}
	void setName(String newName) { // �̸��� �����ϴ� ���� �޼���
		name = newName;
	}
	void setAge(int newAge) { // ���̸� �����ϴ� ���� �޼���
		age = newAge;
	}
	void setWeight(double newWeight) { // ���Ը� �����ϴ� ���� �޼���
		weight = newWeight;
	}
	String getName() { // �̸����� ������ �� �ֵ��� �����ִ� ���� �޼���
		return name;
	}
	int getAge() { // ���̿��� ������ �� �ֵ��� �����ִ� ���� �޼���
		return age;
	}
	double getWeight() { // ���Կ��� ������ �� �ֵ��� �����ִ� ���� �޼���
		return weight;
	}
}

class Dog extends Pet implements Serializable {
	// Dog Ŭ���� ������ ���Ǵ� �ν��Ͻ� ����
	private String breed;
	private boolean boosterShot;
	// ���� 5���� �޴� ������
	Dog(String name, int age, double weight, String breed, boolean boosterShot){
		setPet(name, age, weight);
		setBreed(breed);
		setBoosterShot(boosterShot);
	}
	// �޼��� ���
	void setBreed(String breed) { // ���� �����ϴ� ���� �޼���
		this.breed = breed;
	}
	void setBoosterShot(boolean boosterShot) { // ��� ���� ���θ� �����ϴ� ���� �޼���
		this.boosterShot = boosterShot;
	}
	String getBreed() { // ������ ������ �� �ֵ��� �����ִ� ���� �޼���
		return breed;
	}
	boolean getBoosterShot() { // ��� ���� ���ο��� ������ �� �ֵ��� �����ִ� ���� �޼���
		return boosterShot;
	}
	
	public String toString() { 
		// ���� ����� ���� �ʾҴٸ�, X�� ��µǴ� string
		if(getBoosterShot() == false) return String.format("%-8s%-8d%-8.1f%-12sX",getName(), getAge(), getWeight(), getBreed());
		// ����� �¾Ҵٸ� ��� ���� ���ΰ� O�� ��µǴ� string
		else return String.format("%-8s%-8d%-8.1f%-12sO",getName(), getAge(), getWeight(), getBreed());
	}
}


public class Week9_2_�谡�� {
	public static void main(String[] args) {
		//�̸� ���
		System.out.println("===================");
	    System.out.println("���� : ���̹���������");
	    System.out.println("�й� : 2071060");
	    System.out.println("���� : �谡��");
	    System.out.println("===================\n");
	    // �迭 ���� �� �迭 �ʱ�ȭ
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
	    
	    Scanner sc = new Scanner(System.in); // ��ĳ�� ����� ���� ��ĳ�ʸ� �������ݴϴ�.
	    System.out.println("Input File name to write Dog data");
	    String fileName = sc.next(); // ������ ���� �̸��� ��ĳ�ʸ� ���� �޾��ݴϴ�.
	    
	    try {
	    	ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName)); // ��� ��Ʈ���� �޾ƿ� ���� �̸����� ������ݴϴ�.
	    	outputStream.writeObject(myDog); // �迭�� �ִ� ������ object�� ���ϴ�.
	    	outputStream.close(); // ��½�Ʈ���� �ݾ��ݴϴ�.
	    }
	    catch(IOException e) { // ������ �߻��ϸ� ���� ����ó���� �߻��մϴ�.
	    	System.out.println("ERROR writing to file "+fileName+".");
	    	System.exit(0);
	    }
	    
	    try {
	    	System.out.printf("%-8s%-8s%-8s%-12s%-15s\n","Name","Age","Weight","Breed","BoosterShot");
	    	ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName)); // �Է½�Ʈ���� ���� �̸����� ������ݴϴ�.
	    	for(int i = 0 ; i < 10 ; i++) { // �ݺ����� 0���� 9���� 10�� �����ϴ�.
	    		System.out.println(myDog[i]);  // ������ ������ �ֿܼ� ����մϴ�.
	    	}
	    	inputStream.close(); // �Է½�Ʈ���� �ݾ��ݴϴ�.
	    }
	    catch(FileNotFoundException e) { // ������ ã�� �� ������ ���� ����ó���� �߻��մϴ�.
	    	System.out.println("File Not Found Exception\n");
	    }
	    catch(IOException e) { // ����� ���� ������ �߻��ϸ� ���� ����ó���� �߻��մϴ�.
	    	System.out.println("IO Exception\n");
	    }
	    catch(Exception e) { // �ٸ� ���� �߻��� ���� ����ó���� �߻��մϴ�.
	    	System.out.println("Exception\n");
	    }
	    
	    System.out.println("\nDogs older than 2 years and did not et the boosterShot.");
	    for(int i = 0 ; i < 10 ; i++) { // �ݺ����� 0���� 9���� 10�� �����ϴ�.
	    	if(myDog[i].getAge()>2 && !myDog[i].getBoosterShot()) // ���࿡ ���̰� 2 �ʰ�, boolean���� false�� ��쿡
    		System.out.printf("%-16s%-16s\n",myDog[i].getName(),myDog[i].getBreed()); // ���� ������ ����մϴ�.
    	}
	    System.out.println("\nProgram finished");
	}
}
