import java.util.Scanner; // 스캐너 사용을 위한 임포트문

class StudentInformation{ // 학생 정보가 있는 클래스 선언
	// 멤버 변수 선언
	private String ID;
	private String name;
	// 메서드 선언
	void setID(String ID) { // ID를 받아오는 세터
		this.ID = ID;
	}
	String getID() { //private 변수에 접근할 수 있도록 도와주는 ID 게터
		return ID;
	}
	void setName(String name) { // 이름을 받아오는 세터
		this.name = name; 
	}
	String getName() { // private 변수에 접근할 수 있도록 도와주는 name 세터
		return name;
	}
	
	void display() { // 이름과 ID를 출력하는 메서드
		System.out.printf("%-20s%-10s",getName(),getID()); // printf를 활용하여 열맞춰 출력합니다.
	}
}

class StudentScore extends StudentInformation{ // 부모로 부터 상속받아 StudentScore 정보가 담긴 클래스 선언
	private int korean, math, english; // 멤버 변수 선언
	// 메서드 선언
	void setKor(int korean) { // 국어 점수를 받아오는 세터
		this.korean = korean;
	}
	int getKor() { // private 변수인 국어 점수를 리턴해주는 게터
		return korean;
	}
	void setMath(int math) { // 수학 점수를 받아오는 세터
		this.math = math;
	}
	int getMath() { // private 변수인 수학 점수를 리턴해주는 게터
		return math;
	}
	void setEng(int english) { // 영어 점수를 받아오는 세터
		this.english = english;
	}
	int getEng() { // private 변수인 영어 점수를 리턴해주는 게터
		return english;
	}
	
	void display() { // 정보들을 출력해주는 메서드
		super.display(); // super을 이용하여 이름과 ID를 출력해줍니다.
		System.out.printf("%-8d%-8d%-8d%-8d%-8.2f\n",getKor(),getMath(),getEng(),getKor()+getMath()+getEng(),((float)(getKor()+getMath()+getEng())/3)); // 과목의 점수 뿐만 아니라 합계, 평균도 출력해줍니다.
	}
}

public class HW1_3_김가연 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
	    System.out.println("전공 : 사이버보안전공");
	    System.out.println("학번 : 2071060");
	    System.out.println("성명 : 김가연");
	    System.out.println("===================\n");
	    
		Scanner sc = new Scanner(System.in); // 스캐너 사용을 위해 스캐너 클래스 생성
		double korSum=0, mathSum=0, engSum=0; // 나중에 합계와 평균에 쓰기 위해 지역변수를 선언해줍니다.
		
		System.out.println("How many students are there?");
		int num = sc.nextInt(); // 얼마나 많은 학생이 있는지에 대한 값을 정수 변수 num에 저장합니다.
		StudentScore stdList[] = new StudentScore[num]; // 그리고 받은 num 만큼 StudentScore 클래스 배열을 생성합니다.
		for(int i=0;i<num;i++) {
			stdList[i] = new StudentScore(); // 생성자를 통해 배열에 클래스를 초기화합니다.
		}
		System.out.println("Input the information"); 
		
		for(int i=0;i<num;i++) { // 입력 받았던 학생 수만큼 정보를 넣는 반복문을 돌립니다.
			sc.nextLine(); // 마지막 코드가 int 값을 입력받는 것으로 끝나므로 버퍼를 비워주는 코드를 넣어줍니다.
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
		System.out.printf("\n%-20s%-10s%-8s%-8s%-8s%-8s%-8s\n", "NAME","ID","KOREAN","MATH","ENGLISH","SUM","AVG");  // 목록을 출력하기 전 카테고리도 열에 맞춰 출력해줍니다.
		for(int i=0;i<num;i++) { // 반복문을 통해 배열에 있는 정보를 출력합니다.
			stdList[i].display();
			korSum += stdList[i].getKor(); // 나중에 평균을 구하기 위해 각 과목의 점수의 합을 저장해줍니다.
			mathSum += stdList[i].getMath();
			engSum += stdList[i].getEng();
		}
		System.out.printf("%-30s%-8.2f%-8.2f%-8.2f\n\n","Subject Avg",korSum/num,mathSum/num,engSum/num); // 과목 평균을 구하기 위해 합계를 학생수로 나누어줍니다.
		System.out.println("<Students over the average>\n");
		System.out.println("Korean:");
		for(int i=0;i<num;i++) { // 배열 전체를 검사합니다.
			if(stdList[i].getKor() > korSum / num) { // 만약 평균보다 높은 국어 점수를 가졌다면
				System.out.printf("%-20s",stdList[i].getName()); // 이름을 출력합니다.
			}
			else continue;
		}
		System.out.println("\nMath:"); 
		for(int i=0;i<num;i++) { // 배열 전체를 검사합니다.
			if(stdList[i].getMath() > mathSum / num) { // 만약 평균보다 높은 수학 점수를 가졌다면
				System.out.printf("%-20s",stdList[i].getName()); // 이름을 출력합니다.
			}
			else continue;
		}
		System.out.println("\nEnglish:"); 
		for(int i=0;i<num;i++) { //배열 전체를 검사합니다.
			if(stdList[i].getEng() > engSum / num) { // 만약 평균보다 높은 영어 점수를 가졌다면
				System.out.printf("%-20s",stdList[i].getName()); // 이름을 출력합니다.
			}
			else continue;
		}
		sc.close(); // 스캐너 사용이 끝났으므로 닫아줍니다.
	}
}