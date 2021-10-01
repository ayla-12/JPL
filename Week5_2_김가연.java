import java.util.Scanner; // ��ĳ�� ����� ���� ����Ʈ �ڵ�

class Pet{
	// �θ� Ŭ���� pet�� �ν��Ͻ� ���� ����
	private String name;
	private int age;
	private double weight;
	
	// �޼��� ����
	void writeOutput() { // ������ ������ִ� �޼��� -> ���߿� �������̵� ��!
		System.out.println("Name:"+getName());
		System.out.println("Age:"+getAge());
		System.out.println("Weight:"+getWeight());
	}
	void setPet(String name, int age, double weight) { // �̸�, ����, ���Ը� �޾� �ν��Ͻ� ������ �־��ִ� �޼ҵ�
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	void setName(String name) { // �̸��� �޾� �ν��Ͻ� ������ �־��ִ� �޼���
		this.name = name; // this�� Ȱ���Ͽ� �������ݴϴ�.
	}
	void setAge(int age) { // ���̸� �޾� �ν��Ͻ� ������ �־��ִ� �޼���
		this.age = age; 
	}
	void setWeight(double weight) { // ���Ը� �޾� �ν��Ͻ� ������ �־��ִ� �޼���
		this.weight = weight;
	}
	String getName(){ // name �ν��Ͻ� ������ private �̹Ƿ� �� �޼��带 ���� �������ݴϴ�.
		return name;
	}
	int getAge() { // age �ν��Ͻ� ������ private �̹Ƿ� �� �޼��带 ���� �������ݴϴ�.
		return age;
	}
	double getWeight() { // weight �ν��Ͻ� ������ private �̹Ƿ� �� �޼��带 ���� �������ݴϴ�.
		return weight;
	}
	void move() { // �θ� Ŭ���� move������ ������� ~ moves. �� ����մϴ�. ���� �������̵� �� �����Դϴ�.
		System.out.println(getName()+" moves.");
	}
}
class Dog extends Pet{ // �θ� Ŭ������ Pet�� ��ӹ޴� �ڽ� Ŭ���� Dog ����
	private boolean BoosterShot; // Dog �������� ���̴� �ν��Ͻ� ���� BoosterShot�� �����մϴ�.
	
	// �޼��� ����
	void writeOutput() { // ������ ������ִ� �޼��� -> Dog Ŭ���� �������� �̸�, ����, ���Կ� ��� ���� ���θ� ����մϴ�.
		super.writeOutput(); // super�� ����Ͽ� �ߺ��Ǵ� �ڵ带 ���� �ʰ� ��ӹ޾� ����մϴ�.
		// Boolean ���·� ����Ǿ������Ƿ� �̸� if������ ���մϴ�.
		if(getBoosterShot()) { // ����� boolean�� true�̸� 
			System.out.println("BoosterShot: O"); // �� ������ ����ϰ�,
		}
		else { // ����� boolean�� true�� �ƴϸ�, �� false�̸�
			System.out.println("BoosterShot: X"); // �� ������ ����ϴ� �޼����Դϴ�.
		}
	}
	void setBoosterShot(boolean BoosterShot) { // boolean ���� �޾� BoosterShot ������ �����ϴ� �޼����Դϴ�.
		this.BoosterShot = BoosterShot;
	}
	boolean getBoosterShot() { // BoosterShot�� private �����̹Ƿ� ������ �� �� �޼��带 ������ݴϴ�.
		return BoosterShot;
	}
	void move() { // Dog Ŭ���������� move �޼��带 ������ ���� �������̵� ���ݴϴ�.
		System.out.println(getName()+" walks and runs.\n"); // dog Ŭ�������� move�� ����ϰ� �Ǹ� ~ moves. �� �ƴ� ~ walks and runs. �� ��µǰ� �˴ϴ�.
	}
}
class Cat extends Pet{ // �θ� Ŭ������ Pet�� ��ӹ޴� �ڽ� Ŭ���� Cat ����
	private String color; // Cat Ŭ���� �������� ���Ǵ� �ν��Ͻ� ���� color�� �����մϴ�.
	
	// �޼��� ����
	void writeOutput() { // ������ ������ִ� �޼��� -> �������̵��� ���� Cat Ŭ���� �������� �̸�, ����, ���Կ� ���� ���� ������ ����մϴ�.
		super.writeOutput(); // super������Ͽ� �ߺ��Ǵ� �ڵ带 ���� �ʰ� ��ӹ޾� ����մϴ�.
		System.out.println("Color: "+getColor());
	}
	void setColor(String color) { // color�� ���� ������ �޾� �ν��Ͻ� ���� ���� �������ִ� �޼����Դϴ�.
		this.color = color;
	}
	String getColor() { // color�� private �����̹Ƿ� color�� ������ ���� �� �޼��带 ������ݴϴ�. 
		return color;
	} 
	void move() { // Cat Ŭ���������� move �޼��带 ������ ���� �������̵� �մϴ�.
		System.out.println(getName()+" creeps and jumps.\n"); // cat Ŭ�������� move�� ����ϰ� �Ǹ� ~ moves.�� �ƴ� ~ creeps and jumps. �� ��µǰ� �˴ϴ�.
	}
}

public class Week5_2_�谡�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
	    System.out.println("���� : ���̹���������");
	    System.out.println("�й� : 2071060");
	    System.out.println("���� : �谡��");
	    System.out.println("===================\n");
	    
	    Scanner sc = new Scanner(System.in); // ��ĳ�� ����� ���� ��ĳ�� Ŭ���� ����
	    Dog[] dog = new Dog[3]; // �ν��Ͻ� �迭 ����
	    for(int i=0;i<3;i++) { // �ݺ����� ���ؼ� �����ڸ� �ҷ��ݴϴ�.
	    	dog[i] = new Dog();
	    }
	    Cat[] cat = new Cat[3]; // �ν��Ͻ� cat �迭 ����
	    for(int i = 0;i<3;i++) { // �� ���� �ݺ����� ���� �����ڸ� �ҷ��ݴϴ�.
	    	cat[i] = new Cat();
	    }
	    
	    String yn; // ���߿� boolean ������ ���� �� Ȱ��Ǵ� �����Դϴ�.
	    
	    for (int i=0; i<3;i++) { // �ݺ����� ���� Dog �� ���� ������ �޽��ϴ�.
	    	System.out.printf("\n<<Dog %d>> \n",i+1); // printf�� Ȱ���Ͽ� �ݺ����� ���� ���ڰ� �ϳ��� �ö� �� �ֵ��� ����մϴ�.
	    	System.out.print("Name :");
	    	dog[i].setName(sc.nextLine());
	    	System.out.print("Age :");
	    	dog[i].setAge(sc.nextInt());
	    	System.out.print("Weight :");
	    	dog[i].setWeight(sc.nextDouble());
	    	sc.nextLine();
	    	System.out.print("BoosterShot(y/n) :"); // y/n���� ���ڸ� �����Ƿ�, �̸� ����� ���� String yn �ȿ� ���ڸ� �����մϴ�.
	    	yn = sc.nextLine();
	    	if (yn.equalsIgnoreCase("Y")) { // �׸��� equalsIgnoreCase�� �̿��Ͽ� Y,y�̸� boolean ������ true�� �����ϰ�,
	    		dog[i].setBoosterShot(true);
	    	} 
	    	else { // �ƴҽÿ��� boolean ������ false�� �����մϴ�.
	    		dog[i].setBoosterShot(false);
	    	}
	    }
	    
	    for (int i=0; i<3;i++) { // �ݺ����� ���� Cat �� ���� ������ �޽��ϴ�.
	    	System.out.printf("\n<<Cat %d>> \n",i+1); // �� ���� ���� Dog �ݺ����� ���� printf���� Ȱ���߽��ϴ�.
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
	    
	    System.out.println("\n<<Dog List>>"); // �ݺ����� ���ؼ� Dog List�� ����մϴ�.
	    for(int i=0;i<3;i++) {
	    	dog[i].writeOutput(); // ���� Dog�� ������ ����մϴ�.
	    	dog[i].move(); // ���� Dog�� �����̴� �޼��带 ����մϴ�.
	    }
	    
	    System.out.println("\n<<Cat List>>"); // �ݺ����� ���ؼ� Cat List�� ����մϴ�.
	    for(int i=0;i<3;i++) { 
	    	cat[i].writeOutput(); // ���� Cat�� ������ ����մϴ�.
	    	cat[i].move(); // ���� Cat�� �����̴� �޼��带 ����մϴ�.
	    }
	    
	    System.out.println("\n* Dogs older than 2 years and no boostershot are...");
	    for(int i = 0;i<3;i++) { // �ݺ����� ���� �ν��Ͻ� �迭 �� ����� ������ ���մϴ�.
	    	if (dog[i].getAge()>2 && dog[i].getBoosterShot() == false) { // if���� ���� ������ ������Ű�� ���� ������
	    		System.out.print(dog[i].getName()+" "); // �������� �̸��� ����մϴ�.
	    	}
	    }
	    System.out.println("\n* Black cats weights more than 3Kg are..."); 
	    for(int i = 0;i<3;i++) { // �ݺ����� ���� �ν��Ͻ� �迭 �� ����� ������ ���մϴ�.
	    	if (cat[i].getWeight()>=3 && cat[i].getColor().equalsIgnoreCase("black")) { // if���� ���� ������ ������Ű�� ���� ������
	    		System.out.print(cat[i].getName()+" "); // ������� �̸��� ����մϴ�.
	    	}
	    }
	}

}
