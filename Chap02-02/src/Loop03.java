import java.util.Scanner;

public class Loop03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("10보다 큰 숫자를 입력하세요.");
		
		int x = s.nextInt();
		int sum = 0;
		
		if(x >=10)
		
		do {
			sum += x;
			x--;
		}while(x>=10);
		System.out.println("합계: " + sum);
		System.out.println("모든 숫자를 확인했습니다.");
	}

}
