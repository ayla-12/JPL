//2주차 예제 4

import java.util.Scanner;
public class TestOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String input = "Y";
		int number =0, even=0, odd =0, zero=0, digit;
		
		System.out.println("<정수를 구성하는 짝수, 홀수, 0의 수를 세는 프로그램>");
		while(input.equalsIgnoreCase("Y")) {
			System.out.println("양의정수 입력");
			number = s.nextInt();
			while(number<=0) {
				System.out.println("양의정수 입력");
				number = s.nextInt();
			}
			while(number>0) {
				digit = number %10;
				if(digit==0) zero++;
				else
				{
					if(digit%2==0) even++;
					else odd++;
				}
				number = number/10;
			}
			
			System.out.println("0의 수 : "+zero+"개");
			System.out.println("짝수의 수 : "+even+"개");
			System.out.println("홀수의 수 : "+odd+"개");
			even=0;	odd =0; zero=0; //출력 후 리셋 -> 하지 않으면 다른 숫자를 계속 출력할 때 거기에서 더해짐!!!!
			System.out.println("계속하시겠습니까?(Y/N)");
			s.nextLine(); //남아있는 엔터 먹어주기
			input = s.nextLine();
		}

	}

}
