
public class Cart implements CartInterface {
	
	static final int NUM_BOOK =3;
	CartItem[] mCartItem = new CartItem[NUM_BOOK]; 
	// 장바구니의 도서갯수만큼 배열로 만들어서 저장하겠다.
	static int mCartCount = 0;
	
	public Cart() {}
	
	@Override
	//추상메서드를 하나하나 모든걸 만들어 줘야함 (안만들시 에러발생)
	public void printBookList(Book[] booklist) {
		for (int i = 0; i< booklist.length; i++) {
			System.out.println(booklist[i].getBookId ()+ " | ");
			System.out.println(booklist[i].getName ()+ " | ");
			System.out.println(booklist[i].getUnitPrice ()+ " | ");
			System.out.println(booklist[i].getAuthor ()+ " | ");
			System.out.println(booklist[i].getDescription ()+ " | ");
			System.out.println(booklist[i].getCategory ()+ " | ");
			System.out.println(booklist[i].getReleaseDate ()+ " | ");
			System.out.println("");
		}
	}
	@Override
	public void insertBook(Book book) {
		mCartItem[mCartCount++] = new CartItem(book);		
	}
	
	@Override
	public void deleteBook() {
		mCartItem = new CartItem[NUM_BOOK];
		mCartCount = 0; // 인덱스 값을 초기화 시켜서 
	}
	
	//프린트카트는 현재 내가 가지고 있는거를 전체 출력하는 것
	public void printCart() { 
		System.out.println("장바구니 상품 목록");
		System.out.println("------------------------------------");
		System.out.println("	도서ID\t|		수량\t|	합계");
		for(int i =0 ; i< mCartCount; i++) {
			System.out.print("    "+ mCartItem[i].getBookID() + "\t| ");
			System.out.print("    "+ mCartItem[i].getQuantity() + "\t| ");
			System.out.print("    "+ mCartItem[i].getTotalPrice() + "\t| ");
			System.out.println("");
		}
		System.out.println("------------------------------------");
	}
	
	@Override
	public boolean isCartInBook(String bookId) {
		boolean flag = false;
		for (int i=0; i < mCartCount; i++) {
			//mCartCount 에 수량이 있는만큼 for문을 돌리고
			if(bookId == mCartItem[i].getBookID()) {
				//지금 고른 getBookId가 bookId 에 있으면 
				mCartItem[i].setQuantity(mCartItem[i].getQuantity()+1);
				//기존의 mCartItem[i].setQuantity 카운터를 +1해줘라 
				flag= true;
			}
		}
		return false;
	}

	

	@Override
	public void removeCart(int numId) {
		CartItem[] cartItem = new CartItem[NUM_BOOK];
		int num = 0;
		for( int i =0 ; i< mCartCount; i++)
			if(numId != i)
				cartItem[num++] = mCartItem[i];
				
		mCartCount = num;
		mCartItem = cartItem;
			
	}


}
