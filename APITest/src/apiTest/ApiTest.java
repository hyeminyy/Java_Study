package apiTest;

import java.lang.StackWalker.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Book {
	public Book(String title, String author, int publicationYear, String isbn) {
		this.title = title;
		this.author = author;
		this.publicationYear=publicationYear;
		this.isbn = isbn;
	}

// Book 클래스
	private String title;
	private String author;
	private int publicationYear;
	private String isbn;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "title = " + title + ", author = " + author + ", publicationYear = " + publicationYear + ", isbn = " + isbn
			;
	}
	
	
}

class Library {// Library 클래스
	static final int CAPACITY = 20;
	private Book[] books;
	private int top; // 도서 수
	
	public Library() {
		books = new Book[CAPACITY];
		top = 0;
	}

	public void printBooks(String msg) { //도서 출력
		System.out.println(msg + " 도서숫자 = " + top);
		for (int i = 0; i < top; i++) {
			System.out.println(books[i]);
		}
		System.out.println("------------------------------");
	}

	public void sortBooksByTitle() { // 오름차순
		//String의 compareTo() 사용
		Arrays.sort(books, 0, top, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));// 9.3.3 Arrays 클래스
	}

	public void sortBooksByISBN() { // 바코드 정렬
		Arrays.sort(books, 0, top, (b1, b2) -> b1.getTitle().compareTo(b2.getIsbn())); 
	}

	public Book searchBookByTitle(String title) {
		for (int i = 0; i < top; i++) {
			if(books[i].getTitle().equals(title)) {
				return books[i];
			}
		}
		return null;

	}

	public void addBook(Book book) {
		
		if(top <= CAPACITY) {
			books[top++] = book;
		}else {
			System.out.println("도서관의 책이 가득 찼습니다.");
		}
	}

}

public class ApiTest {

	public static void main(String[] args) {

		Library library = new Library();

		String st = "java";

		String st2 = "java";// string interning

		if (st.equals(st2)) {
			System.out.println("st == st2");
		}


// 5개의 Book 객체 초기화

// 5개의 책 객체 초기화

		Book book1 = new Book("자바", "강감찬", 1995, "12");
		Book book2 = new Book("파이썬", "이순신", 2008, "9");
		Book book3 = new Book("자바스크립트", "을지문덕", 2008, "8");
		Book book4 = new Book("자료구조", "연개소문", 1994, "45");
		Book book5 = new Book("리액트", "김춘추", 1999, "7");

// 책 추가

		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		library.addBook(book4);
		library.addBook(book5);

// 도서 목록 출력
		library.printBooks("\n제목정렬전");

// 도서 목록 정렬
		library.sortBooksByTitle();

// 정렬된 도서 목록 출력
		library.printBooks("\n제목정렬후");

// 특정 제목으로 도서 검색

		library.printBooks("\nISBN정렬전");

// 도서 목록 정렬

		library.sortBooksByISBN();

// 정렬된 도서 목록 출력

		library.printBooks("\nISBN정렬후");

// 특정 제목으로 도서 검색

		String searchTitle = "자바";

		Book foundBook = library.searchBookByTitle(searchTitle);

		if (foundBook == null) {
			System.out.println("\n자바 책이 없다");
		}else {
			System.out.println("\n도서명으로 검색한 도서 " + foundBook.toString());	
		}


	}

}