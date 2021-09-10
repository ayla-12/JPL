//2주차 예제 5
public class ArrayMix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = new int[10];
		int i, n, temp;
		System.out.println("<Original Array>");
		for(i=0;i<10;i++) {
			number[i]=i;
			System.out.print(number[i]+" ");
		}
		System.out.println();
		for(i=0; i<100; i++) {
			n = (int)(Math.random()*10); //0~9 수를 n에 대입
			temp = number[0]; //배열 0의 수를 temp에 옮겨둠
			number[0] = number[n]; //빈 배열 0에 배열 n에 있던 수를 넣음
			number[n] = temp; //빈 배열 n에 temp에 옮겨뒀던 수를 넣음
			
		}
		System.out.println("\n<Mixed Array>");
		for(i=0;i<10;i++)
			System.out.print(number[i]+" ");
	}

}
