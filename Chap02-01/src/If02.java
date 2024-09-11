import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num +"은 짝수입니다.");
			
			
		} else {
			System.out.println(num + "은 홀수입니다.");
	
		}
		System.out.println("이 문장은 if문 밖에 있습니다.");
		
	}
	
}
