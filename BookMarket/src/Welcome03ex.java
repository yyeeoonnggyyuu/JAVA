import java.util.Scanner;

public class Welcome03ex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("당신의 이름을 입력하세요.");
		String userName =input.nextLine();
		
		System.out.println("연락처를 입력하세요");
		int phoneNumber = input.nextInt();
		
		String greeting = "Welcome to Shooping Mall!";
		String tagline = "Welcome to Book Market!";
		String menu1 = " 1. 고객 정보 확인학기 ";
		String menu2 = " 2. 장바구니 상품 목록보기 ";
		String menu3 = " 3. 장바구니 비우기 ";
		String menu4 = " \t4. 바구니에 항목 추가하기";
		String menu5 = " \t5. 장바구니의 항목 수량 줄이기";
		String menu6 = " \t6. 장바구니의 항목 삭제하기";
		String menu7 = " 7. 영수증 표시하기 ";
		String menu8 = " \t8. 종료";
		
		System.out.println("*****************************************************");
		System.out.println("\t"+greeting);
		System.out.println("\t"+tagline);
		System.out.println("*****************************************************");
		
		System.out.println(menu1 + menu4);
		System.out.println(menu2 + menu5);
		System.out.println(menu3 + menu6);
		System.out.println(menu7 + menu8);
	
		System.out.println("*****************************************************"); 
		
		System.out.println("메뉴 번호를 선택해주세요.");
		int n = input.nextInt();
		System.out.println(n +"번을 선택했습니다..");
		
		System.out.println("*****************************************************"); 
		System.out.println(" 당신의 이름은 : " + userName + "\n 당신의 연락처는 : " + phoneNumber + "\n 당신은 " + n + "번 메뉴를 선택했습니다.");
		

	}

}
