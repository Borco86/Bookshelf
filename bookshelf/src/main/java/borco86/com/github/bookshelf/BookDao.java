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
	
	public BookDao() {
		bookList = new ArrayList<>();
		loadExampleBooks();
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
	}

}
