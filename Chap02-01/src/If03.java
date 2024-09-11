import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		
		Scanner s = new Scanner(System.in);
		int grade = s.nextInt();
		
		if(grade >= 90) {
			System.out.println(grade +"은 A학점입니다.");
			
			
		} else if (grade >= 80){
			System.out.println(grade +"은 B학점입니다.");
	
		}else if (grade >= 70){
			System.out.println(grade +"은 C학점입니다.");
	
		}else if (grade >= 60){
			System.out.println(grade +"은 D학점입니다.");
	
		}else {
			System.out.println(grade +"은 F학점입니다.");
	
		} 
		System.out.println("이 문장은 if문 밖에 있습니다.");
		
	}
	
}
