package ex_Test;

import java.lang.StackWalker.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class OverflowException extends RuntimeException{ //overflow 예외 클래스
	public OverflowException(String message) {
		super(message);
	}
}

class UnderflowException extends RuntimeException{
	public UnderflowException(String message) {
		super(message);
	}
}

class test1{
	
}

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
	static final int CAPACITY = 10;
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
		Arrays.sort(books, 0, top, (b1, b2) -> b1.getIsbn().compareTo(b2.getIsbn())); 
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
		
//		if(top < CAPACITY) {
//			books[top++] = book;
//			System.out.println(book.getTitle()+"책이 추가되었습니다.");
//		}else {
//				throw new OverflowException("*****도서관의 책이 가득 찼습니다.*****");
//
//		}
		
		
		if( top >= CAPACITY) {
			throw new OverflowException("\n"+"    ╭ ◜◝ ͡ ◜◝ ͡  ◜◝ ͡ ◜◝ ͡  ◜◝ ╮\r\n"
					+ "      도서관에 책이 가득해요!\r\n"
					+ "      더 이상 추가가 안돼요!\r\n"
					+ "  ╰ ◟◞ ͜  ◟ ͜   ◟◞ ͜  ◟ ͜   ◟◞ ╯\r\n"
					+ "                      O\r\n"
					+ "                    °\r\n"
					+ "");
 		}else {
			books[top++] = book;
			System.out.println(book.getTitle() + "책이 추가되었습니다.");
			System.out.println("---------------------------------------");
		}
		
	}
	
	
	//public void removeBook(Book book) {
//		if(top <= 0) {
//			throw new UnderflowException("삭제할 책이 없습니다.");
//		}else {
//			Book removedBook = books[--top];
//			books[top] = null;
//			throw new UnderflowException(removedBook.getTitle()+"삭제 했습니다.");
//		}
		public void removeBook(Book book) {
	        if (top <= 0) {
	            throw new UnderflowException("┌─────┐\r\n"
	            		+ "│  책 없어  │\r\n"
	            		+ "└∩────∩┘\r\n"
	            		+ "   ヽ(`・ω・´)ノ\r\n"
	            		+ "");
	        } else {
	            int indexToRemove = -1;
	            for (int i = 0; i < top; i++) {
	                if (books[i].equals(book)) {
	                    indexToRemove = i;
	                    break;
	                }
	            }

	            if (indexToRemove == -1) {
	            	System.out.println(" .　∧∧　■\r\n"
	            			+ "　(＾ω＾)／　리스트에 책이 없어요~\r\n"
	            			+ "　＜　　/\r\n"
	            			+ "　　∪∪\r\n"
	            			+ "");

	                return;
	            }

	            // 책을 제거하고 뒤의 책들을 한 칸씩 이동
	            for (int i = indexToRemove; i < top - 1; i++) {
	                books[i] = books[i + 1];
	            }
	            books[--top] = null; 
	            System.out.println(book.getTitle() + " 책이 삭제되었습니다.");
	            System.out.println("---------------------------------------");
	        }
	    
	}

}

public class ExTest01 {

	public static void main(String[] args) {
		
//		try {
//			String s = new String("java");
//			System.out.println(s.length());
//			s = null;
//			System.out.println(s.length());
//			int []arr = new int[2];
//			arr[2] = 10;
//		} catch (ArrayIndexOutOfBoundsException e) {
//			 System.out.println("배열 색인 예외 발생");
//			 System.out.println(e.getMessage());
//		}catch (NullPointerException e1) {
//			System.out.println("널 포인터 예외 발생");
//			 System.out.println(e1.getMessage());
//		}catch (Exception e) {
//			System.out.println("예외 발생");
//		}finally {
//			System.out.println("모든 것이 OK");
//		}
		


		
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
		Book book5 = new Book("R", "김춘추", 1999, "7");
		Book book6 = new Book("C언어", "김춘추", 1999, "1");
		Book book7 = new Book("C++언어", "김춘추", 1999, "4");
		Book book8 = new Book("Vue", "김춘추", 1999, "15");
		Book book9 = new Book("Next.js", "김춘추", 1999, "16");
		Book book10 = new Book("Spring", "김춘추", 1999, "17");
		Book book11 = new Book("Spring boot", "김춘추", 1999, "11");
		Book book12 = new Book("AWS", "김춘추", 1999, "13");

// 책 추가

		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		library.addBook(book4);
		library.addBook(book5);
		library.addBook(book6);
		library.addBook(book7);
		library.addBook(book8);
		library.addBook(book9);
		library.addBook(book10);
		try {
			library.addBook(book11);
		}catch(OverflowException e){
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		//책 삭제
		try {
			library.removeBook(book11);
		}catch(UnderflowException e){
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		library.removeBook(book9);
		library.removeBook(book1);
		library.removeBook(book2);
		library.removeBook(book10);
		library.removeBook(book5);

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