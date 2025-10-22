package exam1020;

public class BookExample {

	public static void main(String[] args) {
		Book[] books = new Book[3];
		
		books[0] = new Book("Java", "김자바", "123-4567-8910", 30000);
		books[1] = new Book("앱솔루트", "코멘트", "123-4567-8911", 40000);
		books[2] = new Book("경소마고", "대소마고", "123-4567-8912", 50000);
		
		for(int i=0; i<books.length; i++) {
			// System.out.println("책 : " + (i+1));
			System.out.println(books[i].getTitle());
			System.out.println(books[i].getAuthor());
			System.out.println(books[i].getPrice());
			System.out.println(books[i].getIsbn());
		}
			//		for(Book book : books) { // for Each
			//			System.out.println(book.getTitle());
			//			System.out.println(book.getAuthor());
			//			System.out.println(book.getPrice());
			//			System.out.println(book.getIsbn());
			//		}
	}

}