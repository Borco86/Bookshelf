package borco86.com.github.bookshelf;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("book")
public class BookResource {

	private static BookDao bookDao = new BookDao();

	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Book> getBooks() {
		return bookDao.getBookList();
	}

	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response getBookByTitle(@QueryParam("title") String title) {
		if (title != null) {
			return Response.status(200).entity(bookDao.getBookByTitle(title)).build();
		} else {
			return Response.status(400).entity("Bad request error: wrong parameters").build();
		}
	}

	@POST
	@Consumes({ MediaType.APPLICATION_ATOM_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_ATOM_XML, MediaType.APPLICATION_JSON })
	public Response postBook(Book newBook) {
		// TODO implement POST logic here
		return null;
	}
}
