import java.util.*; // 스캐너와 배열리스트 사용을 위한 임포트문
class Student{ // 학생클래스
	// 인스턴스 변수
	String name;
	String ID;
	int age;
	//생성자
	Student(String name, String ID, int age){
		this.name = name;
		this.ID = ID;
		this.age = age;
	}
	public String toString() {
		return String.format("%-8s%-8s%-8d\n",name,ID,age); // get을 사용했을 때 프린트 되는 형식
	}
}

public class Week10_1_김가연 {
	public static void main(String[] args) {
		//이름 출력
		System.out.println("===================");
	    System.out.println("전공 : 사이버보안전공");
		System.out.println("학번 : 2071060");
	    System.out.println("성명 : 김가연");
	    System.out.println("===================\n");
	    
	    Scanner sc = new Scanner(System.in); //스캐너 사용을 위한 스캐너 클래스 생성 
	    ArrayList <Student> stu = new ArrayList<Student>(); // 배열 리스트 생성
	    System.out.println("Input Student Name, ID, and age. 0 for name to quit");
	    
	    while(true) {
	    	// 학생의 이름, ID, 나이를 받는데, 0 이 들어오면 종료되는 무한 반복문을 돌립니다.
	    	String name = sc.next(); 
	    	if(name.equals("0")) break; // name 변수에 들어온 값이 0 이라면 반복문을 빠져나갑니다.
	    	String ID = sc.next();
	    	int age = sc.nextInt();
	    	stu.add(new Student(name,ID,age)); // 나이까지 전부 입력되면 add 메서드를 이용하여 이를 리스트에 추가합니다.
	    }
	    
	    System.out.printf("%-8s%-8s%-8s%-8s\n","NUMBER","NAME","ID","AGE");
	    printResult(stu); // 프린트 함수를 호출하여 학생 목록을 출력합니다.
	    
	    for(;;) {
	    	System.out.println("Choose the operation you want.");
		    System.out.println("1.add information 2.delete information 3.show list 4.Finish program");
		    int sel = sc.nextInt(); // sel 정수 변수에 선택지를 저장하여 분기점을 가릅니다.
		    if(sel == 4) break; // 만약 4가 들어갔다면 무한 반복문을 빠져나갑니다.
		    else if(sel==1) {
		    	addStudent(stu); // 선택지가 1이라면 addStudent 메서드를 호출합니다.
		    }
		    else if(sel==2) {
		    	deleteStudent(stu); // 선택지가 2라면 deleteStudent 메서드를 호출합니다.
		    }
		    else if(sel==3) {
		    	printResult(stu); // 선택지가 3이라면 printResult 메서드를 호출합니다.
		    }
		    else {
		    	System.out.println("Wrong input\n"); // 이외의 다른값이 들어왔다면 잘못된 입력이라는 문장을 출력해줍니다.
		    }
	    }
	}
	public static void printResult(List<Student> student) {
		for(int i=0;i<student.size();i++) { // size 메소드를 활용하여 배열리스트의 크기만큼 for문을 돌립니다.
			System.out.printf("%-8d",i+1);
			System.out.print(student.get(i)); // get 메서드를 통해 리스트에 저장된 값을 프린트합니다.
		}
		System.out.println("");
	}
	public static void deleteStudent(List<Student> Stu) {
		System.out.println("Input Student Number to delete");
		Scanner sc = new Scanner(System.in); // 입력을 받습니다.
		Stu.remove((sc.nextInt()-1)); // 그리고 특정위치에 있는 학생정보를 삭제합니다. 0번부터 시작되므로 입력되는 숫자에서 1을 빼야 원하는 목록을 지울 수 있습니다.
		printResult(Stu); // 작업이 끝난 뒤에는 목록을 출력해줍니다.
	}
	public static void addStudent(List<Student> Stu) {
		System.out.println("Input new Student Name, ID, and age, and the location");
		Scanner sc = new Scanner(System.in); //입력을 받습니다.
		String name = sc.next();
    	String ID = sc.next();
    	int age = sc.nextInt();
		int index = sc.nextInt() - 1; // index 넘버는 0부터 시작되므로 사용자가 입력한 숫자는 1 큽니다. 따라서 1을 빼서 저장해줍니다.
		Stu.add(index,new Student(name,ID,age)); // 특정 위치에 값을 추가합니다.
		printResult(Stu); // insert 이후 전체 리스트를 출력합니다.
	}
}
	
