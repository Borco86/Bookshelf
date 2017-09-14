package borco86.com.github.bookshelf;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("books")
public class BookResource {

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Book> getBooks() {
        return null;
    }
    
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Book getBookByTitle(String bookTitle) {
    	return null;
    }
    
    @POST
    @Consumes({ MediaType.APPLICATION_ATOM_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_ATOM_XML, MediaType.APPLICATION_JSON })
    public Response postBook(Book newBook) {
    	return null;
    }
}
