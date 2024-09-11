import java.util.Scanner;

public class Welcome04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("당신의 이름을 입력하세요.");
		String userName =input.nextLine();
		
		System.out.println("연락처를 입력하세요");
		int phoneNumber = input.nextInt();
		
		String greeting = "Welcome to Shooping Mall!";
		String tagline = "Welcome to Book Market!";
		boolean quit = false;
		
		while (!quit) {
			System.out.println("*****************************************************");
			System.out.println("\t"+greeting);
			System.out.println("\t"+tagline);
			System.out.println("*****************************************************");
			
			System.out.println(" 1. 고객 정보 확인학기 \t4. 바구니에 항목 추가하기");
			System.out.println(" 2. 장바구니 상품 목록보기 \t5. 장바구니의 항목 수량 줄이기");
			System.out.println(" 3. 장바구니 비우기 \t6. 장바구니의 항목 삭제하기");
			System.out.println(" 7. 영수증 표시하기 \t8. 종료");
			System.out.println("*****************************************************"); 
			
			System.out.println("메뉴 번호를 선택해주세요.");
			int n = input.nextInt();
//			System.out.println(n +"번을 선택했습니다..");
			
//			System.out.println("*****************************************************"); 
//			
//			
			
			if(n<1 || n>8) {
				System.out.println("1부터 8까지의 숫자를 입력하세요.");
			}
			else {
				switch(n) {
				case 1 :
					System.out.println("현재 고객 정보 : ");
					System.out.println(" 당신의 이름은 : " + userName + "\n 당신의 연락처는 : " + phoneNumber);
					break;
				case 2 :
					System.out.println("장바구니 상품 목록 보기 : ");
					break;
				case 3 :
					System.out.println("장바구니 비우기");
					break;
				case 4 :
					System.out.println("장바구니에 항목 추가하기 : ");
					break;
				case 5 :
					System.out.println("5. 장바구니의 항목 수량 줄이기");
					break;
				case 6 :
					System.out.println("6. 장바구니의 항목 삭제하기");
					break;
				case 7 :
					System.out.println("7. 영수증 표시하기");
					break;
				case 8 :
					System.out.println("8. 종료");
					quit = true;
					break;
							
				}
				
			}
//while 문 끝 
		}
		
		
	}

}
