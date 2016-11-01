package library;
import java.util.ArrayList;

/**
 * This class is used to input some books into the library so when the program is run, the library
 * is already populated
 */
public class BookUtilities 
{
	//Generate Variables
	private static int[] bookID = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
	
	private static String[] title = {"Of Mice and Men", 
			"Lord of the Flies", "An Inspector Calls", 
			"A Christmas Carol", "Romeo and Jiliet", 
			"Dr Jekyll and Mr Hyde", "Jane Eyre", "The Hobbit", "The Great Gatsby", 
			"Macbeth", "1984 Nineteen Eighty-Four", "World War Z", "A Knight of the Seven Kingdoms", 
			"Harry Potter and the Philosopher's Stone", "Harry Potter and the Prisoner of Azkaban"};
	
	private static String[] author = {"John Steinbeck", "William Golding", 
			"J B Priestly", "Charles Dickens", "William Shakespeare", 
			"Robert Louis Stevenson", "Charlotte Brontë", "J R R Tolkien", 
			"F Scott Fitzgerald", "William Shakespeare", "George Orwell", 
			"Max Brooks", "George R R Martin", "J K Rowling", "J K Rowling"};
	
	private static String[] publisher = {"Penguin", "Faber & Faber", "Klett Verlag", 
			"CreateSpace", "Create Space", "Wordsworth", "Wordsworth", "Harper Collins Children's Books", 
			"Wordsworth", "Wordsworth", "Penguin", "Gerald Duckworth & Co", "Harper Collins", "Bloomsbury", "Bloomsbury"};
	
	private static String[] genre = {"Classic", "Classic", "Drama", "Classic Horror", "Drama", "Classic Horror", 
			"Classic", "Fantasy", "Classic", "Drama", "Sci-Fi", "Sci-Fi", "Fantasy", "Fantasy", "Fantasy"};
	
	private static int[] pages = {128, 240, 304, 64, 92, 204, 256, 368, 144, 400, 184, 742, 278, 265, 789};
	
	private static String[] isbn = {"978-0141023571", "978-0571191475", "978-0141185354", "978-1503212831", 
			"978-1514697856", "978-1853260612", "978-1853260209", "978-0007458424", "978-1853260414", "978-1853260353", 
			"978-0141187761", "978-0715637036", "978-0007507672", "978-1408855652", "978-1408855676"};
	
	private static int[] quantity = {50, 40, 20, 30, 10, 35, 25, 24, 80, 48, 32, 9, 36, 16, 0};
	
	private static int[] numOfLoans = {20, 12, 5, 45, 60, 42, 28, 68, 41, 72, 29, 3, 37, 84, 64};
	
	private static int[] numOnLoan = {2, 5, 7, 12, 8, 4, 3, 50, 24, 0, 11, 8, 25, 8, 13};

	
	//Method to populate library array with books
	
	/**
	 * Generates books based on the arrays above so that they can be inserted into the library array list
	 * in the tester.
	 * @return books - array list of generated books
	 */
	public static ArrayList<Book> generateBooks()
	{
		ArrayList<Book> books = new ArrayList<Book>();
		for(int i = 0; i < numOnLoan.length; i++)
		{
			books.add(new Book(bookID[i], title[i], author[i], publisher[i], 
					genre[i], pages[i], isbn[i], quantity[i], numOfLoans[i], numOnLoan[i]));
		}
		return books;
	}
}
