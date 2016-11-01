package library;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is the tester class that holds the menu for the library system and sets up the 
 * library object.
 */
public class Library_Tester
{
	//Set up scanner for input
	static Scanner in = new Scanner(System.in);	
	
	/**
	 * These are the variables to set up the library object.
	 * @param library - this is the array list of books which has been initialised with the 
	 * generateBooks() method from BookUtilities.java
	 * @see BookUtilities.generateBooks() - this is a method which will loop through and add books
	 * to the library array list.
	 */
	//Variables for mcClay library object
	private static String libraryName = "The McClay";
	private static String libraryAddress = "College Park Ave, Belfast";
	private static String libraryPostCode = "BT7 1LQ";
	private static String libraryPhoneNum = "02890976135";
	private static ArrayList<Book> library = BookUtilities.generateBooks();
	
	//Set up library object
	
	/**
	 * @param libraryName - the name of the library
	 * @param libraryAddress - the address of the library
	 * @param libraryPostCode - the postcode of the library
	 * @param libraryPhoneNum - the phone number of the library 
	 * @param library - the array list of books in the library
	 */
	private static Library mcClay = new Library(libraryName, libraryAddress, libraryPostCode, libraryPhoneNum, library);	
	
	/**
	 * Calls the welcome menu.
	 * @see welcomeMenu() - opening menu where the user presses enter to access the 
	 * main menu
	 * @param args
	 */
	public static void main(String[] args) 
	{
		welcomeMenu();
	}
	
	//welcome menu - press enter to continue
	
	/**
	 * Welcome menu to library system, user can enter anything and press enter
	 * and they will be taken to the main menu
	 * @see mainMenu();
	 */
	public static void welcomeMenu()
	{
		System.out.println("---------------------------------------------------------------------"
				+ "\nWelcome to the library system, press enter to continue."
				+ "\n---------------------------------------------------------------------");
		String enter = in.nextLine();
		
		if(enter.equals(""))	//user presses enter
		{
			System.out.println(enter);
			mainMenu();
		}
		else
		{
			enter = "";		//user presses anything other than enter, sets readEnter to empty
			System.out.println(enter);
			mainMenu();
		}
		if(in.hasNextLine())
		{
			enter = in.nextLine();
		}
		else
		{
			enter = null;
		}
	}
	
	//Main menu of system
	
	/**
	 * Main menu of the library system. The user can access the book or library sub menu,
	 * view the library details or the details of all books in the library or exit the system
	 * from here
	 * @param menuOption - user input validated to be an integer between 1 and 5 inclusive
	 * mainLibraryMenuValid() - validates user input to an integer between 1 and 5 inclusive
	 */
	public static void mainMenu()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n---------------------------------------------------------------------"
				+ "\n\t\t\tMain Menu"
				+ "\n---------------------------------------------------------------------\n"
				+ "\n1. View the details of all books in the library"	//printBooks() - print all book details
				+ "\n2. View options for books"							//bookMenu() - book sub menu
				+ "\n3. View the details of the library"				//printLibraryDetails() - print library details
				+ "\n4. View options for the library"					//libraryMenu() - library sub menu
				+ "\n5. Exit the system.");								//allows user to exit system (terminates program)
		
		int menuOption = mainLibraryMenuValid();
		
		if(menuOption == 1)
		{
			mcClay.printBooks();
		}
		else if(menuOption == 2)
		{
			bookMenu();
		}
		else if(menuOption == 3)
		{
			mcClay.printLibraryDetails();
		}
		else if(menuOption == 4)
		{
			libraryMenu();
		}
		else if(menuOption == 5)
		{
			System.out.println("\n"
					+ "Are you sure you want to exit?"
					+ "\n1. Yes"
					+ "\n2. No");
			int userInput = mcClay.numValid();			//validates user input to be positive integer
			
			while(userInput < 1 || userInput > 2)		//validates input to be either 1 or 2
			{
				System.out.println("That is not a valid menu option.");
				userInput = mcClay.numValid();
			}
			if(userInput == 1)
			{
				System.exit(0);
			}
			else if(userInput == 2)
			{
				mainMenu(); 	//brings user back to main menu
			}
		}
		
	}
	
	//Validation for main and library menus
	
	/**
	 * Validates user input so the only valid input from the user will be an integer between 1 and 5 inclusive
	 * @param input - holds user input
	 * @return input - returns input so it can be used as a menu option in the main menu and library menu
	 */
	public static int mainLibraryMenuValid()
	{
		int input = -1;
		do
		{
			System.out.println("\nPlease select one of the options to continue");
			while(!in.hasNextInt())
			{
				System.out.println("That is not a valid menu option. Please try again.");
				in.next();
			}
			input = in.nextInt();
		} while(input < 1 || input > 5);
	return input;
	}
	
	//Book sub menu
	
	/**
	 * Allows user to perform many different actions involving books in the library array list
	 * @param menuOption - user input validated to be an integer between 1 and 11 inclusive
	 * @see bookMenuValid() - validates user input to enusre it is an integer between 1 and 11 inclusive
	 */
	public static void bookMenu()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n---------------------------------------------------------------------"
				+ "\n\t\t\tBook Menu"
				+ "\n---------------------------------------------------------------------\n"
				+ "\n1. Add a book"									//addBook() - user can add a book to the library
				+ "\n2. Edit a book"								//editBook() - user can edit an existing book
				+ "\n3. Delete a book"								//deleteBook() - user can delete a book from the library
				+ "\n4. Loan a book"								//loanBook() - user can loan a book from the library
				+ "\n5. Return a book"								//returnBook() - user can return a book to the library
				+ "\n6. Search for books by author"					//searchAuthor() - user can search for all books by an author
				+ "\n7. Search for books by genre"					//searchGenre() - user can search for all books in a genre
				+ "\n8. Search for books by number of pages"		//searchPages() - user can search for books with length below a number of pages
				+ "\n9. Sort books by author"						//sortAuthor() - prints a list of books by author in alphabetical order
				+ "\n10. Sort books by genre"						//sortGenre() - prints a list of books by genre in alphabetical order
				+ "\n11. Return to the main menu");					//mainMenu() - takes user back to main menu
		
		int menuOption = bookMenuValid();
		
		if(menuOption == 1)
		{
			mcClay.addBook();
		}
		else if(menuOption == 2)
		{
			mcClay.editBook();
		}
		else if(menuOption == 3)
		{
			mcClay.deleteBook();
		}
		else if(menuOption == 4)
		{
			mcClay.loanBook();
		}
		else if(menuOption == 5)
		{
			mcClay.returnBook();
		}
		else if(menuOption == 6)
		{
			in.nextLine();
			mcClay.searchAuthor();
		}
		else if(menuOption == 7)
		{
			in.nextLine();
			mcClay.searchGenre();
		}
		else if(menuOption == 8)
		{
			in.nextLine();
			mcClay.searchPages();
		}
		else if(menuOption == 9)
		{
			mcClay.sortAuthor();
		}
		else if(menuOption == 10)
		{
			mcClay.sortGenre();
		}
		else if(menuOption == 11)
		{
			mainMenu();
		}
	}
	
	//Validation for book sub menu
	
	/**
	 * Validates user input so the only valid input from the user will be an integer between 1 and 11 inclusive
	 * @param input - holds user input
	 * @return input - returns input so it can be used as a menu option in the main menu and library menu
	 */
	public static int bookMenuValid()
	{
		int input = -1;
		do
		{
			System.out.println("\nPlease select one of the options to continue");
			while(!in.hasNextInt())
			{
				System.out.println("That is not a valid menu option. Please try again.");
				in.next();
			}
			input = in.nextInt();
		} while(input < 1 || input > 11);
	return input;
	}
	
	//Library sub menu
	
	/**
	 * Allows user to perform many different actions involving the variables for the library
	 * @param menuOption - user input validated to be an integer between 1 and 5 inclusive
	 * @see mainLibraryMenuValid() - validates user input to enusre it is an integer between 1 and 5 inclusive
	 */
	public static void libraryMenu()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n---------------------------------------------------------------------"
				+ "\n\t\t\tLibrary Menu"
				+ "\n---------------------------------------------------------------------\n"
				+ "\n1. Change the name of the library"
				+ "\n2. Change the address of the library"
				+ "\n3. Change the postcode of the library"
				+ "\n4. Change the phone number of the library"
				+ "\n5. Return to the main menu");
		
		int menuOption = mainLibraryMenuValid();
		
		if(menuOption == 1)
		{
			mcClay.changeLibraryName();
		}
		else if(menuOption == 2)
		{
			mcClay.changeLibraryAddress();
		}
		else if(menuOption == 3)
		{
			mcClay.changeLibraryPostCode();
		}
		else if(menuOption == 4)
		{
			mcClay.changeLibraryPhoneNum();
		}
		else if(menuOption == 5)
		{
			mainMenu();
		}
	}
}