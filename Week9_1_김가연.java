import java.io.*; // io 패키지를 사용하기 위한 임포트문
import java.util.Scanner; // 스캐너 사용을 위한 임포트문

public class Week9_1_김가연 {
	public static void main(String[] args) {
		//이름 출력
		System.out.println("===================");
	    System.out.println("전공 : 사이버보안전공");
	    System.out.println("학번 : 2071060");
	    System.out.println("성명 : 김가연");
	    System.out.println("===================\n");
	    
		Scanner sc = new Scanner(System.in); // 스캐너를 사용하기 위해 스캐너 객체 선언
		System.out.println("File name for input:");
		String fileName = sc.next(); // 읽어올 파일 이름을 스캐너로 받아옵니다.
		sc.nextLine(); // 엔터가 남아있을 수 있으니 버퍼를 비워줍니다.
		System.out.println("File name for output:");  
		String outputFileName = sc.next(); // 결과 값을 저장할 파일 이름을 스캐너로 받아옵니다.
		
		try {
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName)); // 입력 스트림을 생성합니다.
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(outputFileName)); // 출력 스트림을 생성합니다.
			System.out.println("The numbers in File, "+fileName);
			try {
				while(true) {
					int anInteger = inputStream.readInt(); // 입력 스트림을 통해 수를 읽어오고,
					outputStream .writeInt(anInteger*2); // 읽어온 수를 출력스트림을 통해 출력 파일에 씁니다.
					System.out.println(anInteger); //콘솔에 출력도 해줍니다.
				}
			}
			catch(EOFException e) { //다 읽었으면 다음 구문이 실행됩니다.
				System.out.println("End of reading from file, "+fileName); // 파일에 있는 내용을 모두 읽어왔다는 뜻입니다.
			}
			inputStream.close(); // 입력 스트림을 닫아줍니다.
			outputStream.close(); // 출력 스트림을 닫아줍니다.
			System.out.println(outputFileName +" is generated.\n");
		}
		catch(FileNotFoundException e) { // 파일을 찾을 수 없으면 다음 예외처리가 실행됩니다.
			System.out.println("Cannot find file "+fileName);
		}
		catch(IOException e) { // 파일에 문제가 있으면 다음 예외처리가 실행됩니다.
			System.out.println("Problem with input from file "+fileName);
		}
		
		try {
			System.out.println("The numbers in new File, "+ outputFileName); // 새로 생성한 파일을 불러옵니다.
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(outputFileName)); // 새로운 입력 스트림을 만들어줍니다.
			try {
				while(true) {
					int anInteger = inputStream.readInt(); // 입력 스트림을 통해 안에 있는 값을 불러옵니다.
					System.out.println(anInteger); // 콘솔에 출력도 해줍니다.
				}
			}
			catch(EOFException e) { // 다 읽었으면 다음 예외처리가 발생합니다.
				System.out.println("End of reading from 2nd file, "+ outputFileName);
			}
			inputStream.close(); // 입력스트림을 닫아줍니다.
		}
		catch(FileNotFoundException e) { // 파일을 찾을 수 없으면 다음 예외처리가 실행됩니다.
			System.out.println("Cannot find file "+fileName);
		}
		catch(IOException e) { // 파일에 문제가 있으면 다음 예외처리가 실행됩니다.
			System.out.println("Problem with input from file "+fileName);
		}
	}
}
