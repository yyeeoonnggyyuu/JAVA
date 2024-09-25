

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import com.market.bookitem.Book;
import com.market.cart.Cart;
import com.market.member.Admin;
import com.market.member.User;
import com.market.exception.CartException;

public class Welcome12 {

	static final int NUM_BOOK = 100;
	static final int NUM_ITEM = 7;
	
	static Cart mCart = new Cart();
	static User mUser;

	public static void main(String[] args) {

		Book[] mBookList;
		int mTotalBook = 0; 

		Scanner input = new Scanner(System.in);


		System.out.println("당신의 이름을 입력하세요.");
		String userName =input.nextLine();

		System.out.println("연락처를 입력하세요");
		int userMobile = input.nextInt();

		mUser = new User(userName, userMobile);

		String greeting = "Welcome to Shooping Mall!";
		String tagline = "Welcome to Book Market!";

		boolean quit = false;


		while (!quit) {
			System.out.println("*****************************************************");
			System.out.println("\t"+greeting);
			System.out.println("\t"+tagline);
			System.out.println("*****************************************************");	

			menuIntroduction();
			try {
				System.out.println("메뉴 번호를 선택해주세요.");
				int n = input.nextInt();

				if(n<1 || n>9) {
					System.out.println("1부터 9까지의 숫자를 입력하세요.");
				}
				else {
					switch(n) {
					case 1 :
						menuGuestInfo(userName, userMobile);
						break;
					case 2 :
						menuCartItemList();
						break;
					case 3 :
						menuCartClear();
						break;
					case 4 :
						mTotalBook = totalFileToBookList();//전체 도서 갯수 인덱스 값을 받아서 mTotalBook 을 아래 뉴북에 배열로 저장 그럼 mBookList 의 책의 갯수가 나옴
						mBookList = new Book[mTotalBook];
						//						menuCartAddItem(mBook);  매개변수 변경
						menuCartAddItem(mBookList);
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
					case 9 :
						menuAdminLogin();
						break;
					}

				}
				//while 문 끝 
			}
			catch(CartException e) {
				System.out.println(e.getMessage());
				quit = true;
			}catch(Exception e){
				System.out.println("올바르지 않은 메뉴 선택으로 종료합니다.");
				quit =true;
			}


		}

	}


	//		----------------------menuIntroduction-----------------------------------------------------		

	public static void menuIntroduction() {

		System.out.println("*****************************************************");
		System.out.println(" 1. 고객 정보 확인학기 \t4. 바구니에 항목 추가하기");
		System.out.println(" 2. 장바구니 상품 목록보기 \t5. 장바구니의 항목 수량 줄이기");
		System.out.println(" 3. 장바구니 비우기 	\t6. 장바구니의 항목 삭제하기");
		System.out.println(" 7. 영수증 표시하기 	\t8. 종료");
		System.out.println(" 9. 관리자 로그인 	\t ");
		System.out.println("*****************************************************"); 
	}

	//	----------------------menuGuestInfo-----------------------------------------------------
	public static void menuGuestInfo(String name, int mobile) {
		System.out.println("현재 고객 정보 : ");
		//		System.out.println(" 당신의 이름은 : " + name + "\n 당신의 연락처는 : " + mobile);
		System.out.println("이름 " + mUser.getName() + " 연락처 " + mUser.getPhone());
	}

	public static void menuCartItemList() {
		if(mCart.mCartCount >= 0) {
			mCart.printCart();
		}
	}


	public static void menuCartClear() throws CartException{
		//		System.out.println("장바구니 비우기");
		if(mCart.mCartCount == 0)
			throw new CartException("장바구니에 항목이 없습니다.");
		//			System.out.println("장바구니에 항목이 없습니다.");
		else {
			System.out.println("장바구니의 모든 항목을 삭제하겠습니까? Y | N");
			Scanner input =new Scanner(System.in);
			String str = input.nextLine();

			if (str.toUpperCase().equals("Y")) {
				System.out.println("장바구니의 모든 항목을 삭제했습니다.");
				mCart.deleteBook();
			}
		}
	}

	public static void menuCartAddItem(Book[] booklist) {
		//		System.out.println("장바구니에 항목 추가하기 : ");

		BookList(booklist);

		mCart.printBookList(booklist);
		boolean quit = false;


		while(!quit) {
			System.out.print("장바구니에 추가할 도서의 ID를 입력하세요.");

			Scanner input = new Scanner(System.in);
			String str = input.nextLine();

			boolean flag = false;
			int numId = -1;

			for(int i =0 ; i < NUM_BOOK; i++) {
				if(str.equals(booklist[i].getBookId())) {

					numId = i;
					flag = true;
					break;
				}
			}

			if(flag) {
				System.out.println("장바구니에 추가하겠습니까? Y | N ");
				str = input.nextLine();

				if(str.toUpperCase().equals("Y")) {
					System.out.print(booklist[numId].getBookId() + " 도서가 장바구니에 추가 되었습니다.");

					if(!isCartInBook(booklist[numId].getBookId())) {
						mCart.insertBook(booklist[numId]);
					}
				}
				quit = true;
			} else
				System.out.println("다시 입력해 주세요.");
		}
	}
	public static void menuCartRemoveItemCount() {
		System.out.println("5. 장바구니의 항목 수량 줄이기");
	}
	public static void menuCartRemoveItem() throws CartException {
		//		System.out.println("6. 장바구니의 항목 삭제하기");
		//카운터가 없으면 장바구니 항목없음 출력
		//아니면 else
		if (mCart.mCartCount == 0)
			throw new CartException("장바구니에 항목이 없습니다");
		//			System.out.println("장바구니에 항목이 없습니다.");
		else {
			menuCartItemList();
			boolean quit = false;
			while(!quit) {
				System.out.println("장바구니에서 삭제할 도서의 ID를 입력하세요.");
				Scanner input = new Scanner(System.in);
				String str = input.nextLine();
				boolean flag = false;
				int numId = -1;

				for(int i=0 ; i<mCart.mCartCount ; i++) {
					if (str.equals(mCart.mCartItem[i].getBookID())) {
						numId = i;
						flag = true;
						break;
					}
				}

				if(flag) {
					System.out.println("장바구니의 항목을 삭제하겠습니까? Y | N");
					str = input.nextLine();
					if (str.toUpperCase().equals("Y")) {
						System.out.println(mCart.mCartItem[numId].getBookID() + "장바구니에서 도서가 삭제되었습니다.");
						mCart.removeCart(numId);
					}
					quit = true;
				}
				else System.out.println("다시 입력해 주세요.");
			}
		}
	}

	public static void menuCartBill() throws CartException{
		//		System.out.println("7. 영수증 표시하기");
		if (mCart.mCartCount == 0 ) 
			throw new CartException("장바구니에 항목이 없습니다.");
		//			System.out.println("장바구니에 항목이 없습니다.");

		else {
			System.out.println("배송받은 분은 고객 정보와 같습니까? Y | N");
			Scanner input = new Scanner(System.in);
			String str = input.nextLine();

			if(str.toUpperCase().equals("Y")) {
				System.out.println("배송지를 입력해주세요.");
				String address = input.nextLine();
				printBill(mUser.getName(), String.valueOf(mUser.getPhone()), address);
			}
			else {
				System.out.println("배송받을 고객명을 입력하세요");
				String name = input.nextLine();
				System.out.println("배송받을 고객의 연락처를 입력하세요");
				String phone = input.nextLine();
				System.out.println("배송받을 고객의 배송지를 입력해주세요");
				String address = input.nextLine();
				printBill(name, phone, address);
			}
		}
	}
	public static void printBill(String name, String phone, String address){

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String strDate = formatter.format(date);
		System.out.println();
		System.out.println("----------------배송받을 고객 정보 -----------------");
		System.out.println("고객명 : " + name + "	\t\t연락처 : " + phone);
		System.out.println(" 배송지 : " +address + "\t\t발송일 : "+ strDate);

		mCart.printCart();

		int sum = 0;
		for(int i = 0 ; i< mCart.mCartCount; i++)
			sum += mCart.mCartItem[i].getTotalPrice();

		System.out.println("\t\t\t주문 총금액 : "+ sum + "원\n");
		System.out.println("-----------------------------------------------");
		System.out.println();
	}

	public static void menuExit() {
		System.out.println("8. 종료");
	}

	public static void menuAdminLogin() {
		System.out.println("관리자 정보를 입력하세요");

		Scanner input = new Scanner(System.in);
		System.out.print("아이디 : ");
		String adminId = input.next();

		System.out.print("비밀번호 : ");
		String adminPW = input.next();

		Admin admin = new Admin(mUser.getName(), mUser.getPhone());

		if ( adminId.equals(admin.getId()) && adminPW.equals(admin.getPassword())) {
			String[] writeBook =new String[7];
			System.out.println("도서 정보를 추가하겠습니까? Y | N");
			String str = input.next();

			if (str.toUpperCase().equals("Y")){
				Date date = new Date();
				SimpleDateFormat formatter = new SimpleDateFormat("yyMMddhhmmss");
				String strDate = formatter.format(date);
				writeBook[0] = "ISBN" + strDate;
				System.out.println("도서ID : " + writeBook[0]);
				String st1 = input.nextLine();
				System.out.print("도서명 : ");
				writeBook[1] = input.nextLine();
				System.out.print("가격 : ");
				writeBook[2] = input.nextLine();
				System.out.print("저자 : ");
				writeBook[3] = input.nextLine();
				System.out.print("설명 : ");
				writeBook[4] = input.nextLine();
				System.out.print("분야 : ");
				writeBook[5] = input.nextLine();
				System.out.print("출판일 : ");
				writeBook[6] = input.nextLine();

				try {
					FileWriter fw = new FileWriter("book.txt", true); // true 기존파일에 쓰기위해서 

					for (int i = 0; i<7; i++)
						fw.write(writeBook[i]+"\n");//추가한 인덱스 0번부터 6번까지를 
					fw.close();
					System.out.println("새 도서 정보가 저장되었습니다.");	
				} catch(Exception e) {
					System.out.println(e);
				}
			}

			else {
				System.out.println("이름 " + admin.getName() + " 연락처 " + admin.getPhone());
				System.out.println("아이디 " + admin.getId() + " 비밀번호 " + admin.getPassword());
			}
		} 
		else
			System.out.println("관리자 정보가 일치하지 않습니다.");
	}



	//	------------------어디에 들어가는거ㅑㅇ ,,???------------------
	public static int totalFileToBookList() {
		try {
			FileReader fr = new FileReader("book.txt");
			BufferedReader reader = new BufferedReader(fr);

			String str;
			int num = 0;
			while ((str = reader.readLine()) != null) {
				if (str.contains("ISBN")) { //readLine 한줄씩 읽을 때 ISBN 있을 때마다 num을 +1해라
					++num;
				}
			}

			reader.close();
			fr.close();
			return num;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	public static void setFileToBookList(Book[] booklist) {
		try {
			FileReader fr = new FileReader("book.txt");
			BufferedReader reader = new BufferedReader(fr);

			String str2;
			String[] readBook = new String[7];
			int count = 0;

			while ((str2 = reader.readLine()) != null) {
				if (str2.contains("ISBN")) {
					readBook[0] = str2;
					readBook[1] = reader.readLine();
					readBook[2] = reader.readLine();
					readBook[3] = reader.readLine();
					readBook[4] = reader.readLine();
					readBook[5] = reader.readLine();
					readBook[6] = reader.readLine();

					booklist[count++] = new Book(readBook[0], readBook[1], 
							Integer.parseInt(readBook[2]), readBook[3], 
							readBook[4], readBook[5], readBook[6]);
				}
			}

			reader.close();
			fr.close();    
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void BookList(Book[] booklist) {
		setFileToBookList(booklist);
	}

	public static boolean isCartInBook(String bookId) {

		return mCart.isCartInBook(bookId);
	}

}
