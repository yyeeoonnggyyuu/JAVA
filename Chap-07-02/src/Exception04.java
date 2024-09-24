import java.util.Scanner;

public class Exception04 {
	
	static void check(int num) throws NumberFormatException{
		if(num < 0)
			throw new NumberFormatException("0보다 작습니다.");
		else 
			System.out.println("입력하신 숫자는 : " + num );
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = s.nextInt();
		
		try {
			check(num);
		}
		catch(NumberFormatException e) {
			System.out.println("예외 발생 " + e);
		}
		finally{
		 System.out.println("finally는 항상 실행됩니다.");
		}
	}
}
