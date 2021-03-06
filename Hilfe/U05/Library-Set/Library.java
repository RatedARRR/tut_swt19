//import HashSet or TreeSet
import java.util.Collection;
import java.util.Set;
import java.util.Map;

public class Library {
	private Set<Book> stock;
	
	public Library() {
		//instantiate stock as new HashSet or TreeSet
	}
	
	public boolean insertBook(Book newBook){
		//add newBook to stock
	}
	
	public Map<String, Set<Book>> listStockByAuthor(){
		//create new Map with the author names as keys and a set of books as the values
		//define new Set for search results (books of an author)
		//use an iterator to traverse the stock
		//add author:books pairs to the map 
		//if there are more than one book of an author add them to that set of books in the map
		//return the map
	}
	
	public Book searchForIsbn(String isbn) {
		//iterate over stock
		//return the book if found
		//else return null
	}
	
	public Collection<Book> searchForAuthor(String author){
		//create new HashSet
		//iterate over stock
		//check if a book has the search author
		//return all books with the search author
	}
}
