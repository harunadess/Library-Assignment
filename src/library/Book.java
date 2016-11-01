package library;
/**
 * This is the book class which is used to create the Book object template
 * along with accessors and mutators for each variable.
 */
public class Book 
{
	//Variables
	private int bookID;
	private String title;
	private String author;
	private String publisher;
	private String genre;
	private int pages;
	private String isbn;
	private int quantity;
	private int numOfLoans = 0;
	private int numOnLoan = 0;
	
	/**
	 * This is the constructor for the Book object which passes the variables above
	 * into the constructor
	 * @param bookID - the unique ID of the book
	 * @param title - the unique title of the book
	 * @param author - the author of the book
	 * @param publisher - the publisher of the book
	 * @param genre - the genre of the book
	 * @param pages - the number of pages the book has
	 * @param isbn - the unique ISBN the book has
	 * @param quantity - the quantity of the book to be held in the library
	 * @param numOnLoan - the number of that book currently on loan from the library - initialised to zero
	 * for new books
	 * @param numofLoans - the number of loans the book has had  - initialised to zero for new books.
	 */
	//Constructor
	public Book(int bookID, String title, String author, String publisher, String genre, 
			int pages, String isbn, int quantity, int numOnLoan, int numofLoans) 
	{
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.genre = genre;
		this.pages = pages;
		this.isbn = isbn;
		this.quantity = quantity;
		this.numOnLoan = numOnLoan;
		this.numOfLoans = numofLoans;
	}


	//Accessors
	
	/**
	 * Returns ID of the book
	 * @return bookID - the ID of the book
	 */
	public int getBookID() 
	{
		return this.bookID; 		
	}
	
	/**
	 * Returns title of the book
	 * @return title - the title of the book
	 */
	public String getTitle()
	{
		return this.title;			
	}
	
	/**
	 * Returns author of the book
	 * @return author - the author of the book
	 */
	public String getAuthor()
	{
		return this.author;			
	}
	
	/**
	 * Returns publisher of the book
	 * @return publisher - the publisher of the book
	 */
	public String getPublisher()
	{
		return this.publisher;
	}
	
	/**
	 * Returns genre of the book
	 * @return genre - the genre of the book
	 */
	public String getGenre()
	{
		return this.genre;
	}
	
	/**
	 * Returns number of pages of the book
	 * @return pages - the number of pages of the book
	 */
	public int getPages()
	{
		return this.pages;
	}
	
	/**
	 * Returns ISBN of the book
	 * @return isbn - the ISBN of the book
	 */
	public String getIsbn()
	{
		return this.isbn;
	}
	
	/**
	 * Returns the quantity of that book held in the library
	 * @return quantity - the quantity of the book held in the library
	 */
	public int getQuantity()
	{
		return this.quantity;
	}
	
	/**
	 * Returns the number of loans that book has
	 * @return numOfLoans - the number of loans of the book
	 */
	public int getNumOfLoans() 
	{
		return this.numOfLoans;
	}
	
	
	/**
	 * Returns the number of that book currently on loan
	 * @return numOnLoan - the number of the book currently on loan
	 */
	public int getNumOnLoan()
	{
		return this.numOnLoan;
	}
	
	//Mutators
	
	/**
	 * sets the ID of the book to the string is passed into the method
	 * @param bookID - the ID of the book
	 */
	public void setBookID(int bookID) 
	{
		this.bookID = bookID;
	}
	
	/**
	 * sets the title of the book to the string is passed into the method
	 * @param title - the title of the book
	 */
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	/**
	 * sets the author of the book to the string is passed into the method
	 * @param author - the author of the book
	 */
	public void setAuthor(String author) 
	{
		this.author = author;
	}
	
	/**
	 * sets the publisher of the book to the string is passed into the method
	 * @param publisher - the publisher of the book
	 */
	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}
	
	/**
	 * sets the genre of the book to the string that is passed into the method
	 * @param genre - the genre of the book
	 */
	public void setGenre(String genre)
	{
		this.genre = genre;
	}
	
	/**
	 * sets the number of pages of the book to the integer that is passed into the method
	 * @param pages - the number of pages of the book
	 */
	public void setPages(int pages)
	{
		this.pages = pages;
	}
	
	/**
	 * sets the ISBN of the book to the string that is passed into the method
	 * @param isbn - the ISBN of the book
	 */
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}
	
	/**
	 * sets the quantity of the book to the integer that is passed into the method
	 * @param quantity - the quantity of the book held in the library
	 */
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	
	/**
	 * sets the number of loans of the book to the integer that is passed into the method
	 * @param numOfLoans - the number of loans of the book
	 */
	public void setNumOfLoans(int numOfLoans) 
	{
		this.numOfLoans = numOfLoans;
	}
	
	/**
	 * sets the number of books on loan to the integer that is passed into the method
	 * @param numOnLoan - the number of the book currently on loan.
	 */
	public void setNumOnLoan(int numOnLoan)
	{
		this.numOnLoan = numOnLoan;
	}
}
