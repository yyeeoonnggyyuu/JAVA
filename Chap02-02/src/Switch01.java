import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		if (num <100) {
			switch(num / 10) {
			case 10:

			case 9 :
				System.out.println("A학점");
				break;
				
			case 8:
				System.out.println("B학점");
				break;
				
			case 7 :
				System.out.println("C학점");
				break;
				
			case 6 :
				System.out.println("D학점");
				break;
			default :
				System.out.println("F학점");
				break;
			}
		}
	}

}
