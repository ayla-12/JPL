import java.util.Scanner; // ��ĳ�� ����� ���� ����Ʈ��
abstract class Pet{ // �߻�Ŭ���� Pet ����
	String species; 
	String name;
	int age;
	// �߻� �޼��� ����
	public abstract void move();
}

class Dog extends Pet{
	Dog(){ // ������! Dog Ŭ������ ������ ���� ������ Dog�� ��ϵ�
		species = "Dog";
	}
	public void move() { // �߻� �޼��带 �����ͼ� �����θ� �ϼ���
		System.out.println("run"); 
	}
}
class Cat extends Pet{
	Cat(){ // ������! Cat Ŭ������ ������ ���� ������ Cat���� ��ϵ�
		species = "Cat";
	}
	public void move() {
		System.out.println("jump"); // �߻� �޼��带 �����ͼ� �����θ� �ϼ���
	}
}
class Bird extends Pet{
	Bird(){ // ������! Bird Ŭ������ ������ ���� ������ Bird�� ��ϵ�
		species = "Bird";
	}
	public void move() {
		System.out.println("fly"); // �߻� �޼��带 �����ͼ� �����θ� �ϼ���
	}
}
class Snake extends Pet{
	Snake(){ // ������! Snake Ŭ������ ������ ���� ������ Snake�� ��ϵ�
		species = "Snake";
	}
	public void move() {
		System.out.println("crawl"); // �߻� �޼��带 �����ͼ� �����θ� �ϼ���
	}
}

public class Week7_1_�谡�� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
	    System.out.println("���� : ���̹���������");
	    System.out.println("�й� : 2071060");
	    System.out.println("���� : �谡��");
	    System.out.println("===================\n");
	    
	    Scanner sc = new Scanner(System.in); // ��ĳ�� ����� ���� ��ĳ�� Ŭ���� ����
	    Pet petList[] = new Pet[10]; // Pet Ŭ������ �����ϴ� �������� �迭�� ����
	    int num=0; // �迭 �ѹ��� �����ϱ� ���� ���� ���� num ����
	    
	    while(true) { // break�� ������������ �������� �ݺ��Ǵ� while���� �������ݴϴ�.
	    	System.out.println("\n���ϴ� �۾��� �����Դϱ�?");
	    	System.out.println("1. New input  2. Output  3. Exit");
	    	int select = sc.nextInt();
		    // select ���� ���� ���� �������� �޶������� if-else���� ����մϴ�.
		    if (select == 3) break; // ���� 3���� �����ϸ� ��� �ݺ����� �����մϴ�.
		    //�������� 1,2���̶�� �� �б������� �� �ڵ带 �����մϴ�.
		    else if(select == 1) {
		    	while(true) { // ���� �����ϵ��� break�� ������������ �ݺ��Ǵ� while���� �������ݴϴ�.
		    		System.out.println("���� �����Դϱ�?");
			    	System.out.println("1. Dog  2. Cat  3. Snake 4. Bird");
			    	int sel = sc.nextInt();
			    	sc.nextLine(); // �ڿ� nextLine�� ���� �� ���ۿ� �����ִ� ���͸� ����� �ʵ��� ���۸� ����ݴϴ�.
			    	if (sel == 1) { //���� 1���̶��, 
			    		Dog dog = new Dog(); // Dog Ŭ������ �������ݴϴ�.
			    		System.out.print("Name:"); // �׸��� �� Ŭ���� ���� �̸���
			    		dog.name = sc.nextLine();
			    		System.out.print("Age:"); // ���̸� �Է¹޾� �־��ݴϴ�.
			    		dog.age = sc.nextInt();
			    		petList[num++] = dog; //num ���ڸ� �ϳ��� �÷����� ������ Ŭ������ Ŭ���� �迭�� �����մϴ�.
			    		break; // ������ �������� ó�� �������� ���ư��� ���� ���� ��ø �ݺ����� �����մϴ�.
			    	}
			    	else if(sel == 2) { // ���� 2���̶��,
			    		Cat cat = new Cat(); // Cat Ŭ������ �������ݴϴ�.
			    		System.out.print("Name:"); // �׸��� �� Ŭ���� ���� �̸���
		    			cat.name = sc.nextLine();
		    			System.out.print("Age:"); // ���̸� �Է¹޾� �־��ݴϴ�.
		    			cat.age = sc.nextInt();
		    			petList[num++] = cat; // num ���ڸ� �ϳ��� �÷����� ������ Ŭ������ Ŭ���� �迭�� �����մϴ�.
		    			break;// ������ �������� ó�� �������� ���ư��� ���� ���� ��ø �ݺ����� �����մϴ�.
			    	}
			    	else if(sel == 3) { // ���� 3���̶��,
			    		Snake snake = new Snake(); // Snake Ŭ������ �������ݴϴ�.
			    		System.out.print("Name:"); // �׸��� �� Ŭ���� ���� �̸���
		    			snake.name = sc.nextLine();
		    			System.out.print("Age:"); // ���̸� �Է¹޾� �־��ݴϴ�.
		    			snake.age = sc.nextInt();
		    			petList[num++] = snake; // num ���ڸ� �ϳ��� �÷����� ������ Ŭ������ Ŭ���� �迭�� �����մϴ�.
		    			break; // ������ �������� ó�� �������� ���ư��� ���� ���� ��ø �ݺ����� �����մϴ�.
			    	}
			    	else if(sel == 4) { // ���� 4���̶��, 
			    		Bird bird = new Bird(); // Bird Ŭ������ �������ݴϴ�.
			    		System.out.print("Name:"); // �׸��� �� Ŭ���� ���� �̸���
		    			bird.name = sc.nextLine();
		    			System.out.print("Age:"); // ���̸� �Է¹޾� �־��ݴϴ�.
		    			bird.age = sc.nextInt();
		    			petList[num++] = bird; // num ���ڸ� �ϳ��� �÷����� ������ Ŭ������ Ŭ���� �迭�� �����մϴ�.
		    			break; // ������ �������� ó�� �������� ���ư��� ���� ���� ��ø �ݺ����� �����մϴ�.
			    	}
			    	else { // ���� �������� ���� ���ڸ� �Է½�,
			    		System.out.println("�߸��� �Է�"); // �߸��� �Է��̶�� ������ ������ݴϴ�.
			    	}
		    	}
		    }
		    else if(select == 2) { // 2���� ���ý� ����Ʈ�� ������ݴϴ�.
		    	System.out.printf("\n%-10s%-10s%-10s%-10s\n","Species","Name","Age","Movement"); // printf�� �̿��ؼ� �� ���� ��ҵ��� ������ݴϴ�.
				for(int j = 0 ; petList[j] != null ; j++) { // �ݺ����� ���� �迭 �ȿ� �ִ� ��ҵ��� ���ʴ�� ������ݴϴ�. 
					System.out.printf("%-10s%-10s%-10s",petList[j].species,petList[j].name,petList[j].age);
					petList[j].move();
				}
		    }
		    else { // �߸��� ���� �Է� �� �߸��� �Է��̶�� ������ ������ݴϴ�.
		    	System.out.println("�߸��� �Է�");
		    }
	    
	    }
	    System.out.println("����"); // ���� ���� �ݺ����� ���� ������, ������ ���� ������ݴϴ�.
	    sc.close(); // ��ĳ�� ����� �������� �ݾ��ݴϴ�.
	}
}
