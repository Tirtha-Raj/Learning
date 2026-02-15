package study.LLD.udemy.oops.behavioural.iterator;

import java.util.Set;
import java.util.TreeSet;

//Suppose you have a List<Book> class and needs to traverse 
//		but someone changed the book implementation from List to Set or Map, 
//			now without changing the client traverse logic traverse the collection.
// Without Iterator pattern that can not be achieved 
public class WithoutIteratorPattern {

	public static void main(String[] args) {
		BookCollection bookCollection = new BookCollection();
		bookCollection.addBooks(new Book("Java"));
		bookCollection.addBooks(new Book("C"));
		bookCollection.addBooks(new Book("Python"));

		for (int i = 0; i < bookCollection.getBooks().size(); i++) {
//			System.out.println(bookCollection.getBooks().get(i)); // List to Set changes code breaks
		}
	}
}

class BookCollection {
//	private List<Book> books = new ArrayList<>();
//
//	public void addBooks(Book book) {
//		books.add(book);
//	}
//
//	public List<Book> getBooks() {
//		return books;
//	}

	private Set<Book> books = new TreeSet<>();

	public void addBooks(Book book) {
		books.add(book);
	}

	public Set<Book> getBooks() {
		return books;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return books.toString();
	}

}

class Book {
	private String book;

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public Book(String book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return book.toString();
	}
}