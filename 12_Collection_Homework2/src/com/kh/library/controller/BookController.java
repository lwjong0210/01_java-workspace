package com.kh.library.controller;

import java.util.ArrayList;

import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

//BookManager 인터페이스 구현
public class BookController implements BookManager {
	
	public ArrayList<Book> list = new ArrayList<>();

	@Override
	public void addBook(Book nBook) {

		list.add(nBook);
		
	}

	@Override
	public ArrayList<Book> getAllBook() {
		return list;
	}

	@Override
	public Book searchBookBybNo(String bNo) {
		
		Book b = null; 
		
		for(Book sb : list) {
			if(sb.getbNo().equals(bNo)) {
				b = sb;
			}
		}
		
		return b;
		
//		for(int i = 0; i < list.size(); i++) {
//			if(list.get(i).getbNo().equals(bNo)) {
//				b = list.get(i);
//			}
//		}
//		return b;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		
		ArrayList<Book> TitleList = new ArrayList<>();
		
		for(Book b : list) {
			if(b.getTitle().contains(title)) {
				TitleList.add(b);
			}
		}
		
//		
//		for(int i = 0; i < list.size(); i++) {
//			if(list.get(i).getTitle().contains(title)) {
//				TitleList.add(list.get(i));
//			}
//		}
		return TitleList;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		
		ArrayList<Book> bookList = new ArrayList<>();
		
		for(Book b : list) {
			if(b instanceof Magazine == false){	// Book == true 는 안된다. 왜냐 ? Magazine이 Book에게 상속받고 있기 때문에 Magazine 도 true라고 나온다.
				bookList.add(b);
			}
		}
		return bookList;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		ArrayList<Book> magazineList = new ArrayList<Book>();
		
		for(Book b : list) {
			if(b instanceof Magazine) {
				magazineList.add(b);
			}
		}
		return magazineList;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		
		ArrayList<Book> yearList = new ArrayList<>();
		/*
		for(int i = 0; i < onlySearchMagazine().size(); i++) {
			if(	((Magazine)(onlySearchMagazine().get(i))).getYear() == year) {
				yearList.add(onlySearchMagazine().get(i));
			}
		}
		*/
		
		
		for(Book b : onlySearchMagazine()) {
			if(((Magazine)(b)).getYear() == year) {
				yearList.add(b);
			}
		}
		
		return yearList;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		
		ArrayList<Book> publishList = new ArrayList<>();
		
		for(Book b : list) {
			if(b.getPublisher().contains(publisher)) {
				publishList.add(b);
			}
		}
		return publishList;
		
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		
		ArrayList<Book> priceList = new ArrayList<>();
		
		for(Book b : list) {
			
			if(b.getPrice() < price) {
				priceList.add(b);
			}
			
		}
		return priceList;

	}

	@Override
	public int getTotalPrice() {
		int sum = 0;
		
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i).getPrice();
		}
		return sum;
	}

	@Override
	public int getAvgPrice() {
		
		return getTotalPrice() / list.size();
	}
	

}
