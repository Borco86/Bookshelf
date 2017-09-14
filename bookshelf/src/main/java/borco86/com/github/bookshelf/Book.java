package borco86.com.github.bookshelf;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * This is a Plain Old Java Object (POJO) class
 *
 */

@XmlRootElement
public class Book implements Comparable<Book>{

	private String title;
	private String author;
	
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
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	@Override
	public int compareTo(Book otherBook) {
		return this.title.compareTo(otherBook.getTitle());
	}
	
	
	
	
	
}
