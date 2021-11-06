import java.util.*; // ��ĳ�ʿ� �迭����Ʈ ����� ���� ����Ʈ��
class Student{ // �л�Ŭ����
	// �ν��Ͻ� ����
	String name;
	String ID;
	int age;
	//������
	Student(String name, String ID, int age){
		this.name = name;
		this.ID = ID;
		this.age = age;
	}
	public String toString() {
		return String.format("%-8s%-8s%-8d\n",name,ID,age); // get�� ������� �� ����Ʈ �Ǵ� ����
	}
}

public class Week10_1_�谡�� {
	public static void main(String[] args) {
		//�̸� ���
		System.out.println("===================");
	    System.out.println("���� : ���̹���������");
		System.out.println("�й� : 2071060");
	    System.out.println("���� : �谡��");
	    System.out.println("===================\n");
	    
	    Scanner sc = new Scanner(System.in); //��ĳ�� ����� ���� ��ĳ�� Ŭ���� ���� 
	    ArrayList <Student> stu = new ArrayList<Student>(); // �迭 ����Ʈ ����
	    System.out.println("Input Student Name, ID, and age. 0 for name to quit");
	    
	    while(true) {
	    	// �л��� �̸�, ID, ���̸� �޴µ�, 0 �� ������ ����Ǵ� ���� �ݺ����� �����ϴ�.
	    	String name = sc.next(); 
	    	if(name.equals("0")) break; // name ������ ���� ���� 0 �̶�� �ݺ����� ���������ϴ�.
	    	String ID = sc.next();
	    	int age = sc.nextInt();
	    	stu.add(new Student(name,ID,age)); // ���̱��� ���� �ԷµǸ� add �޼��带 �̿��Ͽ� �̸� ����Ʈ�� �߰��մϴ�.
	    }
	    
	    System.out.printf("%-8s%-8s%-8s%-8s\n","NUMBER","NAME","ID","AGE");
	    printResult(stu); // ����Ʈ �Լ��� ȣ���Ͽ� �л� ����� ����մϴ�.
	    
	    for(;;) {
	    	System.out.println("Choose the operation you want.");
		    System.out.println("1.add information 2.delete information 3.show list 4.Finish program");
		    int sel = sc.nextInt(); // sel ���� ������ �������� �����Ͽ� �б����� �����ϴ�.
		    if(sel == 4) break; // ���� 4�� ���ٸ� ���� �ݺ����� ���������ϴ�.
		    else if(sel==1) {
		    	addStudent(stu); // �������� 1�̶�� addStudent �޼��带 ȣ���մϴ�.
		    }
		    else if(sel==2) {
		    	deleteStudent(stu); // �������� 2��� deleteStudent �޼��带 ȣ���մϴ�.
		    }
		    else if(sel==3) {
		    	printResult(stu); // �������� 3�̶�� printResult �޼��带 ȣ���մϴ�.
		    }
		    else {
		    	System.out.println("Wrong input\n"); // �̿��� �ٸ����� ���Դٸ� �߸��� �Է��̶�� ������ ������ݴϴ�.
		    }
	    }
	}
	public static void printResult(List<Student> student) {
		for(int i=0;i<student.size();i++) { // size �޼ҵ带 Ȱ���Ͽ� �迭����Ʈ�� ũ�⸸ŭ for���� �����ϴ�.
			System.out.printf("%-8d",i+1);
			System.out.print(student.get(i)); // get �޼��带 ���� ����Ʈ�� ����� ���� ����Ʈ�մϴ�.
		}
		System.out.println("");
	}
	public static void deleteStudent(List<Student> Stu) {
		System.out.println("Input Student Number to delete");
		Scanner sc = new Scanner(System.in); // �Է��� �޽��ϴ�.
		Stu.remove((sc.nextInt()-1)); // �׸��� Ư����ġ�� �ִ� �л������� �����մϴ�. 0������ ���۵ǹǷ� �ԷµǴ� ���ڿ��� 1�� ���� ���ϴ� ����� ���� �� �ֽ��ϴ�.
		printResult(Stu); // �۾��� ���� �ڿ��� ����� ������ݴϴ�.
	}
	public static void addStudent(List<Student> Stu) {
		System.out.println("Input new Student Name, ID, and age, and the location");
		Scanner sc = new Scanner(System.in); //�Է��� �޽��ϴ�.
		String name = sc.next();
    	String ID = sc.next();
    	int age = sc.nextInt();
		int index = sc.nextInt() - 1; // index �ѹ��� 0���� ���۵ǹǷ� ����ڰ� �Է��� ���ڴ� 1 Ů�ϴ�. ���� 1�� ���� �������ݴϴ�.
		Stu.add(index,new Student(name,ID,age)); // Ư�� ��ġ�� ���� �߰��մϴ�.
		printResult(Stu); // insert ���� ��ü ����Ʈ�� ����մϴ�.
	}
}
	
