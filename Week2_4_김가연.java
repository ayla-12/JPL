import java.util.Scanner;
public class Week2_4_김가연 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================");
		System.out.println("전공 : 사이버보안전공");
		System.out.println("학번 : 2071060");
		System.out.println("성명 : 김가연");
		System.out.println("===================");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the height of the triangle : "); 
		int num = sc.nextInt(); // 삼각형의 높이를 스캐너로 받아줍니다.
		int i,j,k; // 중첩 for문에 쓰이는 변수를 선언합니다.
		
		
		for(i=1; i<=num; i++) { //i는 전체 for 문을 돌리는 변수입니다. 입력받은 num과 비교하여 num 만큼 줄을 찍습니다.
			for(j=1; j<=num-i; j++) { //j는 한 줄에 들어가는 띄어쓰기를 찍습니다. 입력받은 num에서 줄 수인 i를 빼서 한 줄에 몇개의 띄어쓰기를 찍을지 결정하고, 찍습니다.
				System.out.print(" ");
			}
			
			for(k=1; k<=2*i-1; k++) { //k는 한 줄에 들어가는 별을 찍습니다. 줄 수인 i에 따라 2i-1 개의 별을 찍어줍니다.
				System.out.print("*");
			}
		System.out.println(""); //줄바꿈의 역할을 하고 있습니다.
		
		}
	}

}
