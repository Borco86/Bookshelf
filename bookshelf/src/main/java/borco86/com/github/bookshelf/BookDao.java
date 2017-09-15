package borco86.com.github.bookshelf;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * This is Data Access Object class that mocks database access
 *
 */

public class BookDao {

	private List<Book> bookList;
	private Utils utils = new Utils();

	public BookDao() {
		bookList = new ArrayList<>();
		loadExampleBooks();
	}

	public List<Book> getBookList() {
		return this.bookList;
	}

	public Book getBookByTitle(String title) {
		String formattedTitle = utils.formatTitle(title);
		// TODO replace with java 8 streams maybe
		for (Book book : bookList) {
			if (utils.formatTitle(book.getTitle()).equals(formattedTitle)) {
				return book;
			} else if (utils.formatTitle(book.getTitle()).contains(formattedTitle)) {
				return book;
			}
		}
		return new Book();
	}

	public void postBook(Book book) {
		String title = book.getTitle();
		String author = book.getAuthor();

		String[] array = utils.limitStringsLength(title, author);
		String lmitedTitle = array[0];
		String limitedAuthor = array[1];

		book.setTitle(lmitedTitle);
		book.setAuthor(limitedAuthor);

		bookList.add(book);
		utils.sortList(bookList);
	}

	private void loadExampleBooks() {

		Book exampleBook = new Book();
		exampleBook.setTitle("A Game of Thrones");
		exampleBook.setAuthor("Gearge R. R. Martin");
		bookList.add(exampleBook);

		Book exampleBook2 = new Book();
		exampleBook2.setTitle("Foundation");
		exampleBook2.setAuthor("Isaac Asimov");
		bookList.add(exampleBook2);

		Book exampleBook3 = new Book();
		exampleBook3.setTitle("Hyperion");
		exampleBook3.setAuthor("Dan Simmons");
		bookList.add(exampleBook3);

		Book exampleBook4 = new Book();
		exampleBook4.setTitle("Chronicles of the Black Company");
		exampleBook4.setAuthor("Glen Cook");
		bookList.add(exampleBook4);

		Book exampleBook5 = new Book();
		exampleBook5.setTitle("The Conquering Sword of Conan");
		exampleBook5.setAuthor("Robert E. Howard");
		bookList.add(exampleBook5);
		utils.sortList(bookList);
	}

}
