package com.market.cart;

import java.util.ArrayList;
import com.market.bookitem.Book;

public class Cart implements CartInterface {
	public ArrayList<CartItem> mCartItem = new ArrayList<CartItem>();
	
//	static final int NUM_BOOK =3;
//	public CartItem[] mCartItem = new CartItem[NUM_BOOK]; 
	// 장바구니의 도서갯수만큼 배열로 만들어서 저장하겠다.
	public static int mCartCount = 0;
	
	public Cart() {}
	
	@Override
	//추상메서드를 하나하나 모든걸 만들어 줘야함 (안만들시 에러발생)
	public void printBookList(ArrayList<Book> booklist) {
		for (int i = 0; i< booklist.size(); i++) {
			Book bookitem = booklist.get(i);
			System.out.print(bookitem.getBookId ()+ " | ");
			System.out.print(bookitem.getName ()+ " | ");
			System.out.print(bookitem.getUnitPrice ()+ " | ");
			System.out.print(bookitem.getAuthor ()+ " | ");
			System.out.print(bookitem.getDescription ()+ " | ");
			System.out.print(bookitem.getCategory ()+ " | ");
			System.out.print(bookitem.getReleaseDate ()+ " | ");
			System.out.println("");
		}
	}
	@Override
	public void insertBook(Book book) {  
//		mCartItem[mCartCount++] = new CartItem(book);
		CartItem bookitem = new CartItem(book);
		mCartItem.add(bookitem); //add 추가해줘
		mCartCount = mCartItem.size(); // size 전체 갯수 구하기
	}
	
	@Override
	public void deleteBook() {
//		mCartItem = new CartItem[NUM_BOOK];
		mCartItem.clear();
		mCartCount = 0; // 인덱스 값을 초기화 시켜서 
	}
	
	//프린트카트는 현재 내가 가지고 있는거를 전체 출력하는 것
	public void printCart() { 
		System.out.println("장바구니 상품 목록");
		System.out.println("------------------------------------");
		System.out.println("	도서ID\t|	 수량\t|	합계\t|");
		for(int i =0 ; i< mCartCount; i++) {
			System.out.print("    "+ mCartItem.get(i).getBookID() + "\t| ");
			System.out.print("    "+ mCartItem.get(i).getQuantity() + " \t| ");
			System.out.print("    "+ mCartItem.get(i).getTotalPrice() + " \t| ");
			System.out.println("");
		}
		System.out.println("------------------------------------");
	}
	
	@Override
	public boolean isCartInBook(String bookId) {
		boolean flag = false;
		for (int i=0; i < mCartItem.size(); i++) {
			if(bookId.equals(mCartItem.get(i).getBookID())) {
				mCartItem.get(i).setQuantity(mCartItem.get(i).getQuantity()+1);
				flag= true;
			}
		}
		return false;
	}

	

	@Override
	public void removeCart(int numId) {
			
		mCartItem.remove(numId);
		mCartCount = mCartItem.size();
			
	}


}
