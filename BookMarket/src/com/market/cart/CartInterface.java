package com.market.cart;

import java.util.ArrayList;
import com.market.bookitem.Book;

public interface CartInterface {
//	추상메서드 생성
	//기능들을 먼저 만든다 (기능 = 메서드)
//	기능들의 매서드를 만든다
	void printBookList(ArrayList<Book> p);
	boolean isCartInBook(String id);
	void insertBook(Book p);
	void removeCart (int numId);
	void deleteBook();
}
