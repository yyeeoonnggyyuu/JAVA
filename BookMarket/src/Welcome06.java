import java.util.Scanner;

public class Welcome06 {

	static final int NUM_BOOK = 3;//도서의 개수에 대한 상수 선언
	static final int NUM_ITEM = 7;// 도서정보의 개수에 대한 상수 선언
	
	public static void main(String[] args) {
		String[][] mBook = new String[NUM_BOOK][NUM_ITEM];
		
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
			
			menuIntroduction();
			
			System.out.println("메뉴 번호를 선택해주세요.");
			int n = input.nextInt();
			
			if(n<1 || n>8) {
				System.out.println("1부터 8까지의 숫자를 입력하세요.");
			}
			else {
				switch(n) {
				case 1 :
					menuGuestInfo(userName, phoneNumber);
					break;
				case 2 :
					menuCartItemList();
					break;
				case 3 :
					menuCartClear();
					break;
				case 4 :
					menuCartAddItem(mBook);
					break;
				case 5 :
					menuCartRemoveItemCount();
					break;
				case 6 :
					menuCartRemoveItem();
					break;
				case 7 :
					menuCartBill();
					break;
				case 8 :
					menuExit();
					quit = true;
					break;		
				}
			}
//while 문 끝 
		}
		
	}
		
//		----------------------menuIntroduction-----------------------------------------------------		

	public static void menuIntroduction() {

		System.out.println("*****************************************************");
		System.out.println(" 1. 고객 정보 확인학기 \t4. 바구니에 항목 추가하기");
		System.out.println(" 2. 장바구니 상품 목록보기 \t5. 장바구니의 항목 수량 줄이기");
		System.out.println(" 3. 장바구니 비우기 \t6. 장바구니의 항목 삭제하기");
		System.out.println(" 7. 영수증 표시하기 \t8. 종료");
		System.out.println("*****************************************************"); 
	}
	
//	----------------------menuGuestInfo-----------------------------------------------------
	public static void menuGuestInfo(String name, int mobile) {
		System.out.println("현재 고객 정보 : ");
		System.out.println(" 당신의 이름은 : " + name + "\n 당신의 연락처는 : " + mobile);
	}
	public static void menuCartItemList() {
		System.out.println("장바구니 상품 목록 보기 : ");
	}

	public static void menuCartClear() {
		System.out.println("장바구니 비우기");
	}
	
	public static void menuCartAddItem(String[][] book) {
//		System.out.println("장바구니에 항목 추가하기 : ");
		BookList(book);
		for(int i =0; i < NUM_BOOK; i++) {
			for(int j =0 ; j < NUM_ITEM ; j++) {
				System.out.print(book[i][j] +"|");	
			}
			System.out.println("");
			
			
			
		}
		boolean quit = false;
		
		
		while(!quit) {
			System.out.print("장바구니에 추가할 도서의 ID를 입력하세요.");
			
			Scanner input = new Scanner(System.in);
			String str = input.nextLine();
			
			boolean flag = false;
			int numId = -1;
			
			for(int i =0 ; i < NUM_BOOK; i++) {
				if(str.equals(book[i][0])) {
					numId = i;
					flag = true;
					break;
				}
			}
			
			if(flag) {
				System.out.println("장바구니에 추가하겠습니까? Y | N ");
				str = input.nextLine();
				
				if(str.toUpperCase().equals("Y")) {
					System.out.print(book[numId][0] + " 도서가 장바구니에 추가 되었습니다.");
				}
				quit = true;
			} else
				System.out.println("다시 입력해 주세요.");
		}
	}
	public static void menuCartRemoveItemCount() {
		System.out.println("5. 장바구니의 항목 수량 줄이기");
	}
	public static void menuCartRemoveItem() {
		System.out.println("6. 장바구니의 항목 삭제하기");
	}
	
	public static void menuCartBill() {
		System.out.println("7. 영수증 표시하기");
	}
	
	public static void menuExit() {
		System.out.println("8. 종료");
	}
//	----------------------menuCartAddItem-----------------------------------------------------
	
	public static void BookList(String[][] book) {
		book[0][0] = "ID:ISBN1234";
		book[0][1] = "쉽게 배우는 JSP 웹 프로그래밍";
		book[0][2] = "27000";
		book[0][3] = "송미영";
		book[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍";
		book[0][5] = "IT전문서";
		book[0][6] = "2018/10/08";
		
		book[1][0] = "ID:ISBN1235";
		book[1][1] = "안드로이드 프로그래밍";
		book[1][2] = "33000";
		book[1][3] = "우재남";
		book[1][4] = "실습 단계별 명쾌한 멘토링!";
		book[1][5] = "IT전문서";
		book[1][6] = "2022/01/22";
	
		book[2][0] = "ID:ISBN1236";
		book[2][1] = "스크래치";
		book[2][2] = "22000";
		book[2][3] = "고광일";
		book[2][4] = "컴퓨팅 사고력을 키우는 블록 코딩";
		book[2][5] = "컴퓨터 입문";
		book[2][6] = "2019/06/10";
	}
	
}
