import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		System.out.println("3개의 숫자를 입력하세요");
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		
		if (x > y) {
			if (x > z) {
				System.out.println(x + "는 가장 큰 정수입니다.");
			}
			else {
				
				System.out.println(x + "는 가장 큰 정수가 아닙니다.");
			}	
			
		}
		else {
			System.out.println(x + "는 가장 큰 정수가 아닙니다.");
	} 

	}
	
}
