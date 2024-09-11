import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		System.out.println("당신의 나이를 입력하세요");
		
		Scanner s =new Scanner(System.in);
		int age = s.nextInt();
		
		if(age >= 18) {
			System.out.println("당신의 나이는 18세 이상입니다.");
			System.out.println("당신은 투표할 자격이 있습니다.");
			
		} else {
			System.out.println("당신은 18세 미만입니다");1
			System.out.println("당신은 투표할 자격이 없습니다.");
		}
		System.out.println("이 문장은 if문 밖에 있습니다.");
		
	}
	
}
