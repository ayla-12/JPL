import java.util.Scanner; // ��ĳ�� ����� ���� ����Ʈ��

class StudentInformation{ // �л� ������ �ִ� Ŭ���� ����
	// ��� ���� ����
	private String ID;
	private String name;
	// �޼��� ����
	void setID(String ID) { // ID�� �޾ƿ��� ����
		this.ID = ID;
	}
	String getID() { //private ������ ������ �� �ֵ��� �����ִ� ID ����
		return ID;
	}
	void setName(String name) { // �̸��� �޾ƿ��� ����
		this.name = name; 
	}
	String getName() { // private ������ ������ �� �ֵ��� �����ִ� name ����
		return name;
	}
	
	void display() { // �̸��� ID�� ����ϴ� �޼���
		System.out.printf("%-20s%-10s",getName(),getID()); // printf�� Ȱ���Ͽ� ������ ����մϴ�.
	}
}

class StudentScore extends StudentInformation{ // �θ�� ���� ��ӹ޾� StudentScore ������ ��� Ŭ���� ����
	private int korean, math, english; // ��� ���� ����
	// �޼��� ����
	void setKor(int korean) { // ���� ������ �޾ƿ��� ����
		this.korean = korean;
	}
	int getKor() { // private ������ ���� ������ �������ִ� ����
		return korean;
	}
	void setMath(int math) { // ���� ������ �޾ƿ��� ����
		this.math = math;
	}
	int getMath() { // private ������ ���� ������ �������ִ� ����
		return math;
	}
	void setEng(int english) { // ���� ������ �޾ƿ��� ����
		this.english = english;
	}
	int getEng() { // private ������ ���� ������ �������ִ� ����
		return english;
	}
	
	void display() { // �������� ������ִ� �޼���
		super.display(); // super�� �̿��Ͽ� �̸��� ID�� ������ݴϴ�.
		System.out.printf("%-8d%-8d%-8d%-8d%-8.2f\n",getKor(),getMath(),getEng(),getKor()+getMath()+getEng(),((float)(getKor()+getMath()+getEng())/3)); // ������ ���� �Ӹ� �ƴ϶� �հ�, ��յ� ������ݴϴ�.
	}
}

public class HW1_3_�谡�� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
	    System.out.println("���� : ���̹���������");
	    System.out.println("�й� : 2071060");
	    System.out.println("���� : �谡��");
	    System.out.println("===================\n");
	    
		Scanner sc = new Scanner(System.in); // ��ĳ�� ����� ���� ��ĳ�� Ŭ���� ����
		double korSum=0, mathSum=0, engSum=0; // ���߿� �հ�� ��տ� ���� ���� ���������� �������ݴϴ�.
		
		System.out.println("How many students are there?");
		int num = sc.nextInt(); // �󸶳� ���� �л��� �ִ����� ���� ���� ���� ���� num�� �����մϴ�.
		StudentScore stdList[] = new StudentScore[num]; // �׸��� ���� num ��ŭ StudentScore Ŭ���� �迭�� �����մϴ�.
		for(int i=0;i<num;i++) {
			stdList[i] = new StudentScore(); // �����ڸ� ���� �迭�� Ŭ������ �ʱ�ȭ�մϴ�.
		}
		System.out.println("Input the information"); 
		
		for(int i=0;i<num;i++) { // �Է� �޾Ҵ� �л� ����ŭ ������ �ִ� �ݺ����� �����ϴ�.
			sc.nextLine(); // ������ �ڵ尡 int ���� �Է¹޴� ������ �����Ƿ� ���۸� ����ִ� �ڵ带 �־��ݴϴ�.
			System.out.print("\nID:");
			stdList[i].setID(sc.nextLine());
			System.out.print("Name:");
			stdList[i].setName(sc.nextLine());
			System.out.print("Korean:");
			stdList[i].setKor(sc.nextInt());
			System.out.print("Math:");
			stdList[i].setMath(sc.nextInt());
			System.out.print("English:");
			stdList[i].setEng(sc.nextInt());
		}
		System.out.printf("\n%-20s%-10s%-8s%-8s%-8s%-8s%-8s\n", "NAME","ID","KOREAN","MATH","ENGLISH","SUM","AVG");  // ����� ����ϱ� �� ī�װ��� ���� ���� ������ݴϴ�.
		for(int i=0;i<num;i++) { // �ݺ����� ���� �迭�� �ִ� ������ ����մϴ�.
			stdList[i].display();
			korSum += stdList[i].getKor(); // ���߿� ����� ���ϱ� ���� �� ������ ������ ���� �������ݴϴ�.
			mathSum += stdList[i].getMath();
			engSum += stdList[i].getEng();
		}
		System.out.printf("%-30s%-8.2f%-8.2f%-8.2f\n\n","Subject Avg",korSum/num,mathSum/num,engSum/num); // ���� ����� ���ϱ� ���� �հ踦 �л����� �������ݴϴ�.
		System.out.println("<Students over the average>\n");
		System.out.println("Korean:");
		for(int i=0;i<num;i++) { // �迭 ��ü�� �˻��մϴ�.
			if(stdList[i].getKor() > korSum / num) { // ���� ��պ��� ���� ���� ������ �����ٸ�
				System.out.printf("%-20s",stdList[i].getName()); // �̸��� ����մϴ�.
			}
			else continue;
		}
		System.out.println("\nMath:"); 
		for(int i=0;i<num;i++) { // �迭 ��ü�� �˻��մϴ�.
			if(stdList[i].getMath() > mathSum / num) { // ���� ��պ��� ���� ���� ������ �����ٸ�
				System.out.printf("%-20s",stdList[i].getName()); // �̸��� ����մϴ�.
			}
			else continue;
		}
		System.out.println("\nEnglish:"); 
		for(int i=0;i<num;i++) { //�迭 ��ü�� �˻��մϴ�.
			if(stdList[i].getEng() > engSum / num) { // ���� ��պ��� ���� ���� ������ �����ٸ�
				System.out.printf("%-20s",stdList[i].getName()); // �̸��� ����մϴ�.
			}
			else continue;
		}
		sc.close(); // ��ĳ�� ����� �������Ƿ� �ݾ��ݴϴ�.
	}
}