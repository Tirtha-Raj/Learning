package study.LLD.udemy.oops.behavioural.iterator;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class WithIteratorPatternMethod {
	public static void main(String[] args) {

		BookCollectionV2 bookCollectionv2 = new BookCollectionV2();
		bookCollectionv2.addBooks(new BookV2("Java"));
		bookCollectionv2.addBooks(new BookV2("C"));
		bookCollectionv2.addBooks(new BookV2("Python"));

		java.util.Iterator<BookV2> itaratorv2 = bookCollectionv2.createBookIterator();
		while (itaratorv2.hasNext()) {
			System.out.println("Books name custom iterator: " + itaratorv2.next());
		}

		BookCollectionV3 bookCollectionv3 = new BookCollectionV3();
		bookCollectionv3.addBooks(new BookV2("Java"));
		bookCollectionv3.addBooks(new BookV2("C"));
		bookCollectionv3.addBooks(new BookV2("Python"));
		java.util.Iterator<BookV2> itaratorv3 = bookCollectionv3.iterator();
		while (itaratorv3.hasNext()) {
			System.out.println("Books name java iterator: " + itaratorv3.next());
		}
	}
}

//Using Java Iterator
class BookCollectionV3 implements Iterable<BookV2> {
//	private List<BookV2> books = new ArrayList<>();
//
//	public void addBooks(BookV2 book) {
//		books.add(book);
//	}
//
//	public List<BookV2> getBooks() {
//		return books;
//	}

	private Set<BookV2> books = new TreeSet<>();

	public void addBooks(BookV2 book) {
		books.add(book);
	}

	public Set<BookV2> getBooks() {
		return books;
	}

	@Override
	public java.util.Iterator<BookV2> iterator() {
		return books.iterator();
	}

}

//Using custom iterator
interface Iterator<T> {
	boolean hasNext();

	T next();
}

//Using custom iterator
class BookCollectionV2 {
//	private List<BookV2> books = new ArrayList<>();
//
//	public void addBooks(BookV2 book) {
//		books.add(book);
//	}
//
//	public List<BookV2> getBooks() {
//		return books;
//	}

	private Set<BookV2> books = new TreeSet<>();

	public void addBooks(BookV2 book) {
		books.add(book);
	}

	public Set<BookV2> getBooks() {
		return books;
	}

	@Override
	public String toString() {
		return books.toString();
	}

	public BookIterator createBookIterator() {
		return new BookIterator(this.books);
	}

	// using custom iterator
	private class BookIterator implements java.util.Iterator<BookV2> {

//		private List<BookV2> books;
//		private Set<BookV2> books;
		private java.util.Iterator<BookV2> iterator;

//		public BookIterator(List<BookV2> books) {
//			this.books = books;
//		}
		public BookIterator(Set<BookV2> books) {
			this.iterator = books.iterator();
		}

		@Override
		public boolean hasNext() {
			return iterator.hasNext();
		}

		@Override
		public BookV2 next() {
			return iterator.next();
		}

	}

}

class BookV2 implements Comparable<BookV2> {
	private String book;

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public BookV2(String book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return book.toString();
	}

	@Override
	public int compareTo(BookV2 o) {
		return this.book.compareTo(o.getBook());
	}
}