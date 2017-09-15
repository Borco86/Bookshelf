package borco86.com.github.bookshelf;

import java.util.Collections;
import java.util.List;

/**
 * 
 * Class that provides utility methods
 *
 */

public class Utils {

	public void sortList(List<Book> unsortedList) {
		Collections.sort(unsortedList);
	}

	public String formatTitle(String title) {
		return title.replaceAll("\\s+", "").toLowerCase();
	}

	private String limitStringLength(String title) {
		String limitedTitle;
		if (title.length() <= 32) {
			limitedTitle = title;
		} else {
			limitedTitle = title.substring(0, 31);
		}
		return limitedTitle;
	}

	public String[] limitStringsLength(String title, String author) {
		String limitedTitle = limitStringLength(title);
		String limitedAuthor = limitStringLength(author);
		String[] array = { limitedTitle, limitedAuthor };
		return array;
	}

}
