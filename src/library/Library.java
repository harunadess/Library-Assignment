package library;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * This is the library class where the array list called library is set up. It contains methods for manipulating
 * the book object as well as methods for changing the attributes of the Library object.
 */
public class Library
{
	//Variables
	private String libraryName;
	private String libraryAddress;
	private String libraryPostCode;
	private String libraryPhoneNum;
	//Set up array list
	private ArrayList<Book> library = new ArrayList<Book>();
	
	/**
	 * This is the constructor for the library which passes the variables above 
	 * into the constructor.
	 * @param libraryName - the name of the library
	 * @param libraryAddress - the address of the library
	 * @param libraryPostCode - the postcode of the library
	 * @param libraryPhoneNum - the phone number of the library
	 * @param library - the library array list, of type Book
	 */
	//Constructor
	public Library(String libraryName, String libraryAddress, 
		String libraryPostCode, String libraryPhoneNum, ArrayList<Book> library)
	{
		this.libraryName = libraryName;
		this.libraryAddress = libraryAddress;
		this.libraryPostCode = libraryPostCode;
		this.libraryPhoneNum = libraryPhoneNum;
		this.library = library;
	}

	
	//Accessors
	
	/**
	 * Returns the name of the library
	 * @return libraryName - the name of the library
	 */
	public String getLibraryName() 
	{
		return libraryName;
	}
	
	/**
	 * Returns the address of the library
	 * @return libraryAddress - the address of the library
	 */
	public String getLibraryAddress() 
	{
		return this.libraryAddress;
	}
	
	/**
	 * Returns postcode of the library
	 * @return libraryPostCode - the postcode of the library
	 */
	public String getLibraryPostCode() 
	{
		return this.libraryPostCode;
	}
	
	/**
	 * Returns the phone number of the library
	 * @return libraryPhoneNum - the phone number of the library
	 */
	public String getLibraryPhoneNum() 
	{
		return this.libraryPhoneNum;
	}

	/**
	 * Returns the array list of the library
	 * @return library - the array list of books of the library
	 */
	public ArrayList<Book> getLibrary() 
	{
		return this.library;
	}
	
	
	//Mutators
	
	/**
	 * sets the name of the library to the string that is passed into the method
	 * @param libraryName - the name of the library
	 */
	public void setLibraryName(String libraryName) 
	{
		this.libraryName = libraryName;
	}

	/**
	 * sets the address of the library to the string that is passed into the method
	 * @param libraryAddress - the address of the library
	 */
	public void setLibraryAddress(String libraryAddress) 
	{
		this.libraryAddress = libraryAddress;
	}

	/**
	 * sets the postcode of the library to the string that is passed into the method
	 * @param libraryPostCode - the postcode of the library
	 */
	public void setLibraryPostCode(String libraryPostCode) 
	{
		this.libraryPostCode = libraryPostCode;
	}

	/**
	 * sets the phone number of the library to the string that is passed into the method
	 * @param libraryPhoneNum - the phone number of the library
	 */
	public void setLibraryPhoneNum(String libraryPhoneNum) 
	{
		this.libraryPhoneNum = libraryPhoneNum;
	}

	/**
	 * sets the array list to the array list of type Book that is passed inot the method
	 * @param library - the array list of books of the library
	 */
	public void setLibrary(ArrayList<Book> library) 
	{
		this.library = library;	
	}

	
	//Change Library Name
	
	/**
	 * Allows the user to change the name of the library to a String that they specify.
	 * @see yesNoMenu() - prints yes/no menu and validates user input (int) to 1 or 2
	 * @see stringValid() - ensures user input is a String
	 */
	public void changeLibraryName()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n---------------------------------------------------------------------"
				+ "\n\t\t\tEdit Library Name"
				+ "\n---------------------------------------------------------------------\n");
		String temp = libraryName;
		System.out.println("The current name of the library is " + libraryName 
				+ ".\nPlease enter a new name for the library.");
		String input = stringValid();
		setLibraryName(input);
		System.out.println("The library name has now been changed to " + libraryName);

		//Menu to allow user to repeat operation or to return to main menu
		int menuOption = yesNoMenu();
		
		if(menuOption == 1)
		{
			setLibraryName(temp);
			in.nextLine();
			changeLibraryName();
		}
		else if(menuOption == 2)
		{
			in.nextLine();
			Library_Tester.mainMenu();
		}
	}
	
	
	//Change Library Address
	
	/**
	 * Allows the user to change the address of the library to a String that they specify.
	 * @see yesNoMenu() - prints yes/no menu and validates user input (int) to 1 or 2
	 */
	public void changeLibraryAddress()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n---------------------------------------------------------------------"
				+ "\n\t\t\tEdit Library Address"
				+ "\n---------------------------------------------------------------------\n");
		String temp = libraryAddress;
		System.out.println("The current address of the library is " + libraryAddress 
				+ ".\nPlease enter a new address for the library.");
		String input = stringValid();
		setLibraryAddress(input);
		System.out.println("The library address has now been changed to " + libraryAddress);
		
		//Menu to allow user to repeat operation or to return to main menu
		int menuOption = yesNoMenu();
		
		if(menuOption == 1)
		{
			setLibraryAddress(temp);
			in.nextLine();
			changeLibraryAddress();
		}
		else if(menuOption == 2)
		{
			in.nextLine();
			Library_Tester.mainMenu();
		}
	}
	
	
	//Change Library Postcode
	
	/**
	 * Allows the user to change the postcode of the library to a String that they specify.
	 * @see yesNoMenu() - prints yes/no menu and validates user input (int) to 1 or 2
	 * @see stringValid() - ensures user input is a String
	 */
	public void changeLibraryPostCode()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n---------------------------------------------------------------------"
				+ "\n\t\t\tEdit Library Postcode"
				+ "\n---------------------------------------------------------------------\n");
		String temp = libraryPostCode;
		System.out.println("The current postcode of the library is " + libraryPostCode
				+ ".\nPlease enter a new postcode for the library.");
		String input = stringValid();
		setLibraryPostCode(input);
		System.out.println("The library postcode has now been changed to " + libraryPostCode);
		
		//Menu to allow user to repeat operation or to return to main menu
		int menuOption = yesNoMenu();
		
		if(menuOption == 1)
		{
			setLibraryPostCode(temp);
			in.nextLine();
			changeLibraryPostCode();
		}
		else if(menuOption == 2)
		{
			in.nextLine();
			Library_Tester.mainMenu();
		}
	}
	
	
	//Change Library Phone Number
	
	/**
	 * Allows the user to change the phone number of the library to a String that they specify.
	 * @see yesNoMenu() - prints yes/no menu and validates user input (int) to 1 or 2
	 * @see stringValid() - ensures user input is a String
	 */
	public void changeLibraryPhoneNum()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n---------------------------------------------------------------------"
				+ "\n\t\t\tEdit Library Phone Number"
				+ "\n---------------------------------------------------------------------\n");
		String temp = libraryPhoneNum;
		System.out.println("The current phone number of the library is " + libraryPhoneNum
				+ ".\nPlease enter a new phone number for the library.");
		String input = stringValid();
		setLibraryPhoneNum(input);
		System.out.println("The library phone number has now been changed to " + libraryPhoneNum);
		
		//Menu to allow user to repeat operation or to return to main menu
		int menuOption = yesNoMenu();
		
		if(menuOption == 1)
		{
			setLibraryPhoneNum(temp);
			in.nextLine();
			changeLibraryPhoneNum();
		}
		else if(menuOption == 2)
		{
			in.nextLine();
			Library_Tester.mainMenu();
		}
	}
	
	
	//Prints library details
	
	/**
	 * Prints the library details using the appropriate accessor methods for each variable.
	 * @see yesNoMenu() - prints yes/no menu and validates user input (int) to 1 or 2
	 * @see stringValid() - ensures user input is a String
	 */
	public void printLibraryDetails()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n---------------------------------------------------------------------"
				+ "\n\t\t\tView Library Details"
				+ "\n---------------------------------------------------------------------\n");
		System.out.println("Name: \t\t\t" + getLibraryName());
		System.out.println("Address: \t\t" + getLibraryAddress());
		System.out.println("Postcode: \t\t" + getLibraryPostCode());
		System.out.println("Phone number: \t\t" + getLibraryPhoneNum());
		
		System.out.println();
		
		//Menu to allow user to repeat operation or to return to main menu
		int menuOption = yesNoMenu();
		
		if(menuOption == 1)
		{
			printLibraryDetails();
		}
		else if(menuOption == 2)
		{
			in.nextLine();
			Library_Tester.mainMenu();
		}
	}
	
	
	//Validates input for yes/no menus
	
	/**
	 * This method ensures that input from the user is an integer and that the integer
	 * is equal to 1 or 2. Any other input will cause a prompt to print which tells the
	 * user to enter a valid menu option.
	 * @return menuOption - the menu option the user has entered
	 */
	public int yesNoMenu()
	{
		System.out.println("Would you like to do that again?");
		System.out.println("1. Yes"
				+ "\n2. No");
		int menuOption = -1;
		do
		{
			System.out.println("Please enter a valid menu option");
			while(!in.hasNextInt())
			{
				System.out.println("Please enter a valid menu option");
				in.next();
			}
			menuOption = in.nextInt();
		} while(menuOption < 1 || menuOption > 2);	
		return menuOption;
	}

	
	//Temporary Variables for Book object
	private int tempBookID;
	private String tempBookTitle;
	private String tempBookAuthor;
	private String tempBookPublisher;
	private String tempBookGenre;
	private int tempBookPages;
	private String tempBookIsbn;
	private int tempBookQuantity;
	private int tempNumOnLoan = 0;
	private int tempNumOfLoans = 0;
	
	
	//Accessors
	
	/**
	 * Returns the book ID, to be passed into the temporary Book object 
	 * so it can be used to populate the library array list.
	 * @return tempBookID - the ID of the book
	 */
	public int getTempBookID() 
	{
		return tempBookID;
	}

	/**
	 * Returns the book title, to be passed into the temporary Book object 
	 * so it can be used to populate the library array list.
	 * @return tempBookTitle - the title of the book
	 */
	public String getTempBookTitle() 
	{
		return tempBookTitle;
	}

	/**
	 * Returns the book author, to be passed into the temporary Book object 
	 * so it can be used to populate the library array list.
	 * @return tempBookAuthor - the author of the book
	 */
	public String getTempBookAuthor() 
	{
		return tempBookAuthor;
	}

	/**
	 * Returns the book publisher, to be passed into the temporary Book object 
	 * so it can be used to populate the library array list.
	 * @return tempBookPublisher - the publisher of the book
	 */
	public String getTempBookPublisher() 
	{
		return tempBookPublisher;
	}

	/**
	 * Returns the book genre, to be passed into the temporary Book object 
	 * so it can be used to populate the library array list.
	 * @return tempBookGenre - the genre of the book
	 */
	public String getTempBookGenre() 
	{
		return tempBookGenre;
	}

	/**
	 * Returns the number of book pages, to be passed into the temporary Book object 
	 * so it can be used to populate the library array list.
	 * @return tempBookPages - the number of pages of the book
	 */
	public int getTempBookPages() 
	{
		return tempBookPages;
	}

	/**
	 * Returns the book ISBN, to be passed into the temporary Book object 
	 * so it can be used to populate the library array list.
	 * @return tempBookIsbn - the ISBN of the book
	 */
	public String getTempBookIsbn() 
	{
		return tempBookIsbn;
	}

	/**
	 * Returns the book quantity, to be passed into the temporary Book object 
	 * so it can be used to populate the library array list.
	 * @return tempBookQuantity - the quantity of the book held in the library
	 */
	public int getTempBookQuantity() 
	{
		return tempBookQuantity;
	}

	/**
	 * Returns the number of books on loan, to be passed into the temporary Book object 
	 * so it can be used to populate the library array list.
	 * @return tempNumOnLoan - the number of the book currently on loan
	 */
	public int getTempNumOnLoan() 
	{
		return tempNumOnLoan;
	}

	/**
	 * Returns the number loans a book has, to be passed into the temporary Book object 
	 * so it can be used to populate the library array list.
	 * @return tempNumOfLoans - the number of loans of the book
	 */
	public int getTempNumOfLoans() 
	{
		return tempNumOfLoans;
	}

	
	//Mutators
	
	/**
	 * sets the book ID to the integer that is passed into the method.
	 * @param tempBookID - the ID of the book
	 */
	public void setTempBookID(int tempBookID) 
	{
		this.tempBookID = tempBookID;
	}

	/**
	 * sets the book title to the String that is passed into the method.
	 * @param tempBookTitle - the title of the book
	 */
	public void setTempBookTitle(String tempBookTitle) 
	{
		this.tempBookTitle = tempBookTitle;
	}

	/**
	 * sets the book author to the String that is passed into the method.
	 * @param tempBookAuthor - the author of the book
	 */
	public void setTempBookAuthor(String tempBookAuthor) 
	{
		this.tempBookAuthor = tempBookAuthor;
	}

	/**
	 * sets the book publisher to the String that is passed into the method.
	 * @param tempBookPublisher - the publisher of the book
	 */
	public void setTempBookPublisher(String tempBookPublisher) 
	{
		this.tempBookPublisher = tempBookPublisher;
	}

	/**
	 * sets the book genre to the String that is passed into the method.
	 * @param tempBookGenre - the genre of the book
	 */
	public void setTempBookGenre(String tempBookGenre) 
	{
		this.tempBookGenre = tempBookGenre;
	}

	/**
	 * sets the number of pages of the book to the integer that is passed into the method.
	 * @param tempBookPages - the number of pages of the book
	 */
	public void setTempBookPages(int tempBookPages) 
	{
		this.tempBookPages = tempBookPages;
	}

	/**
	 * sets the book ISBN of the book to the String that is passed into the method.
	 * @param tempBookIsbn - the ISBN of the book
	 */
	public void setTempBookIsbn(String tempBookIsbn) 
	{
		this.tempBookIsbn = tempBookIsbn;
	}

	/**
	 * sets the quantity held of the book to the integer that is passed into the method.
	 * @param tempBookQuantity - the quantity of the book held in the library
	 */
	public void setTempBookQuantity(int tempBookQuantity) 
	{
		this.tempBookQuantity = tempBookQuantity;
	}

	/**
	 * sets the number of books on loan to the integer that is passed into the method.
	 * @param tempNumOnLoan - the number of the book currently on loan
	 */
	public void setTempNumOnLoan(int tempNumOnLoan) 
	{
		this.tempNumOnLoan = tempNumOnLoan;
	}

	/**
	 * sets the number of loans of the book to the integer that is passed into the method.
	 * @param tempNumOfLoans - the number of loans of the book
	 */
	public void setTempNumOfLoans(int tempNumOfLoans) 
	{
		this.tempNumOfLoans = tempNumOfLoans;
	}


	//Set up scanner
	Scanner in = new Scanner(System.in);
	
	
	//Methods
	
	//Adds a book to the library based on user input.
	
	/**
	 * Allows user to add a new book to the library by taking input from the user and setting
	 * the input equal to the corresponding temporary variable. The variable is then passed
	 * into a temporary book object to be added to the library array list.
	 * @see yesNoMenu() - prints yes/no menu and validates user input (int) to 1 or 2
	 * @see numValid() - validates user input to ensure it is a positive integer
	 * @see stringValid() - ensures user input is a String
	 * @see isbnValid() - ensures user input is a String of the correct format - regex of 3 digits, 1 hyphen, 10 digits
	 * @param tempBookID - the ID of the book - validated so it is unique
	 * @param tempBookTitle - the title of the book - validated so it is unique
	 * @param tempBookAuthor - the author of the book
	 * @param tempBookPublisher - the publisher of the book
	 * @param tempBookGenre - the genre of the book
	 * @param tempBookPages - the number of pages of the book
	 * @param tempBookIsbn - the ISBN of the book - validated so it is unique
	 * @param tempBookQuantity - the quantity of the book held in the library
	 * @param tempNumOnLoan - the number of the book currently on loan
	 * @param tempNumOfLoans - the number of loans of the book
	 * @param temp - temporary book object used for adding a book into the library array list
	 */
	public void addBook()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n---------------------------------------------------------------------"
				+ "\n\t\t\t\tAdd a book"
				+ "\n---------------------------------------------------------------------");
		System.out.println("\nPlease enter the ID of the book");
		setTempBookID(numValid());
		for(int i = 0; i < library.size(); i++)
		{
			while(tempBookID == this.library.get(i).getBookID())	//loops until user input does not match any ID in library array list
			{
				System.out.println("A book aleady has that ID. Please try again");
				setTempBookID(numValid());
			}
		}
		in.nextLine(); //needed for scanner to pick up next line
		
		System.out.println("Please enter the title of the book");
		setTempBookTitle(stringValid());
		for(int i = 0; i < this.library.size(); i++)
		{
			while(this.library.get(i).getTitle().equalsIgnoreCase(tempBookTitle))	//loops until user input does not match any title in library array list
			{
				System.out.println("A book already has that title. Please try again.");
				setTempBookTitle(stringValid());
			}
		}
		
		System.out.println("Please enter the author of the book");
		setTempBookAuthor(stringValid());
		
		System.out.println("Please enter the publisher of the book");
		setTempBookPublisher(stringValid());
		
		System.out.println("Please enter the genre of the book");
		setTempBookGenre(stringValid());
		
		System.out.println("Please enter the number of pages of the book");
		setTempBookPages(numValid());
		
		System.out.println("Please enter the ISBN of the book");
		setTempBookIsbn(isbnValid());
		
		if(tempBookIsbn.length() != 14)
		{
			while(tempBookIsbn.length() != 14)	//loop until user input is of correct length
			{
				System.out.println("An ISBN must be 13 digits long with one hyphen after the first 3 digits.");
				isbnValid();	//ensures ISBN is of correct format (3 digits, 1 hyphen, 10 digits)
			}
		}
		
		for(int i = 0; i < this.library.size(); i++)
		{
			while(this.library.get(i).getIsbn().equalsIgnoreCase(tempBookIsbn))
			{
				System.out.println("A book already has that ISBN. Please try again.");
				setTempBookIsbn(isbnValid());
			}
		}
		
		System.out.println("Please enter the quantity of this book to be held in the library.");
		setTempBookQuantity(numValid());

		//Temporary book object to put values into library array list
		Book temp = new Book(getTempBookID(), getTempBookTitle(), getTempBookAuthor(), getTempBookPublisher(), 
				getTempBookGenre(), getTempBookPages(), getTempBookIsbn(), getTempBookQuantity(), getTempNumOnLoan(), 
				getTempNumOfLoans()); 
		this.library.add(temp);
		
		for(int i = 0; i < this.library.size(); i++)
		{
			if(this.library.get(i).getBookID() == tempBookID)
			{
				System.out.println("The book " + this.library.get(i).getTitle() 
						+ " by " + this.library.get(i).getAuthor() 
						+ " has been added to the library.");
			}
		}
		
		//Menu to allow user to repeat operation or to return to main menu
		int menuOption = yesNoMenu();
		
		if(menuOption == 1)
		{
			addBook();
		}
		else if(menuOption == 2)
		{
			in.nextLine();
			Library_Tester.mainMenu();
		}
	}
	
	
	//Finds book that matches user entered bookID then removes it from library array list.
	
	/**
	 * This method allows the user to remove a book from the library array list from the list of books
	 * currently available in the library
	 * @see printCurrentTitles() - prints titles and IDs of books in the library.
	 * @see yesNoValid() - prints yes/no menu and validates user input (int) to 1 or 2
	 * @see numValid() - validates user input to ensure it is a positive integer
	 * @see stringValid() - ensures user input is a String
	 */
	public void deleteBook()
	{
		//Input
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n---------------------------------------------------------------------"
				+ "\n\t\t\t\tDelete a book"
				+ "\n---------------------------------------------------------------------");
		printCurrentTitles();
		System.out.println("\nPlease enter the ID of the book you wish to delete.");
		
		//Checks to see if input matches a menu option
		int tempBookID = numValid();
		int arrayIndex = 0;
		for(int i = 0; i < this.library.size(); i++)
		{
			while(!idIsValid(tempBookID))	//loops until valid input if user input does not match any ID in library array list
			{
				System.out.println("Please enter a valid book ID.");
				tempBookID = numValid();
			}
			
			if(tempBookID == library.get(i).getBookID())	//if ID is valid, sets arrayIndex to i			
			{
				arrayIndex = i;
			}
		}
		
		library.remove(arrayIndex);
		System.out.println("The book has been removed from the library system.");
		
		//Menu to allow user to repeat operation or to return to main menu
		int menuOption = yesNoMenu();
		
		if(menuOption == 1)
		{
			deleteBook();
		}
		else if(menuOption == 2)
		{
			in.nextLine();
			Library_Tester.mainMenu();
		}
	}
	
	
	//Finds book with user entered bookID in the library array list and calls editInfo() method so user 
	//can edit book info.
	
	/**
	 * Allows user to select a book to edit the information of.
	 * @see printCurrentTitles() - prints titles and IDs of books in the library.
	 * @see numValid() - validates user input to ensure it is a positive integer
	 * @see idIsValid(int) - enusres the ID of the book the user has entered is present in the library array list
	 * @see editInfo(int) - passes the user specified ID of the book from editBook() 
	 * to this method so the user can access a sub menu of what attribute of the book they wish to change
	 * @param tempBookID - the ID of the book - is checked to see if it is valid
	 */
	public void editBook()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n---------------------------------------------------------------------"
				+ "\n\t\t\t\tEdit a book"
				+ "\n---------------------------------------------------------------------");
		printCurrentTitles();
		System.out.println("\nPlease enter the ID of the book you wish to edit");
		//Variable to store user input
		int tempBookID = numValid();
		
		for(int i = 0; i < this.library.size(); i++)
		{
			while(!idIsValid(tempBookID)) //loops until valid input if user input does not match any ID in library array list
			{
				System.out.println("That book ID does not exist. Please enter another.");
				tempBookID = numValid();
			}
		}
		
		if(idIsValid(tempBookID)) //calls method if ID is valid
		{
			editInfo(tempBookID);
		}
	}
	
	
	//Sub menu for editBook() - allows user to choose which variable of the book they would like to edit and 
	//sets it accordingly.
	
	/**
	 * Sub menu of editBook(). User can select an attribute of the book they wish to change. The attribute is then
	 * suitably validated and set to user input.
	 * @param editBookID - the ID of the book the user wishes to edit, passed in from the editBook() method.
	 * @param input - stores user input to it can be evaluated to one of the corresponding menu options.
	 * @see editMenuValid() - validates user input to enusre it is an integer between 1 and 8.
	 * @see numValid() - validates user input to ensure it is a positive integer
	 * @see stringValid() - ensures user input is a String
	 * @see isbnValid() - ensures user input is a String of the correct format - regex of 3 digits, 1 hyphen, 10 digits
	 * @see idIsValid(int) - enusres the ID of the book the user has entered is present in the library array list
	 * @see stringValid() - ensures user input is a String
	 */
	public void editInfo(int editBookID)
	{
		//Check & set bookID
		printSingleBook(editBookID);
		System.out.println("What would you like to change?"
				+ "\n1. Book ID"
				+ "\n2. Title"
				+ "\n3. Author"
				+ "\n4. Publisher"
				+ "\n5. Genre"
				+ "\n6. Pages"
				+ "\n7. ISBN"
				+ "\n8. Quantity held");
		
		int input = editMenuValid();
		//Changing bookID
		if(input == 1)
		{
			if(idIsValid(editBookID)) //check to see if ID matches an entry in library array list
			{
				System.out.println("The current book ID is " 
						+ this.library.get(idValid(editBookID)).getBookID() 
						+ ". Please enter a new ID for the book");
				int inputBookID = numValid();
				
				while(idIsValid(inputBookID))	//loops while user input matches any ID in library array list
				{
					System.out.println("That ID already exists. Please enter another.");
					in.nextLine();
					inputBookID = numValid();
				}
				//if user input does not match any ID in library array list
				this.library.get(idValid(editBookID)).setBookID(inputBookID);
				System.out.println("The book's ID has been updated.");
			}
		}
		
		//Changing bookTitle
		else if(input == 2)
		{
			for(int i = 0; i < this.library.size(); i++)
			{
				String inputTitle = "";
				if(idIsValid(editBookID))
				{
					System.out.println("The current book title is " 
							+ this.library.get(idValid(editBookID)).getTitle() 
							+ ". Please enter a new title for the book");
					inputTitle = stringValid();
					//if user input does not equal any title currently in the library array
					if(!(inputTitle.equalsIgnoreCase(this.library.get(idValid(editBookID)).getTitle())))
					{
						inputTitle = stringValid();
						this.library.get(idValid(editBookID)).setTitle(inputTitle);
						System.out.println("The book's title has been updated.");
						break;
					}
					else if(inputTitle.equals(this.library.get(idValid(editBookID)).getTitle()))
					{
						System.out.println("That title already exists. Please enter another.");
						inputTitle = stringValid();
					}
				}
			}
		}			
		
		//Changing bookAuthor
		else if(input == 3)
		{
			for(int i = 0; i < this.library.size(); i++)
			{
				System.out.println("The current author for the book is " 
						+ this.library.get(idValid(editBookID)).getAuthor()
						+ ". Please enter a new author for the book.");
				String inputAuthor = stringValid();
					
				if(!(inputAuthor.equalsIgnoreCase(this.library.get(idValid(editBookID)).getAuthor())))
				{
					inputAuthor = stringValid();
					this.library.get(idValid(editBookID)).setAuthor(inputAuthor);
					System.out.println("The book's author has been updated.");
					break;
				}
			}
		}
			
		//Changing bookPublisher
		else if(input == 4)
		{
			for(int i = 0; i < this.library.size(); i++)
			{
				System.out.println("The current publisher for the book is " 
						+ this.library.get(idValid(editBookID)).getPublisher()
						+ ". Please enter a new publisher for the book.");
				String inputPublisher = stringValid();
					
				if(!(inputPublisher.equalsIgnoreCase(this.library.get(idValid(editBookID)).getPublisher())))
				{
					inputPublisher = stringValid();
					this.library.get(idValid(editBookID)).setPublisher(inputPublisher);
					System.out.println("The book's publisher has been updated.");
					break;
				}
			}
		}
			
		//Changing bookGenre
		else if(input == 5)
		{
			for(int i = 0; i < this.library.size(); i++)
			{
				System.out.println("The current genre for the book is " 
						+ this.library.get(idValid(editBookID)).getGenre()
						+ ". Please enter a new genre for the book.");
				String inputGenre = stringValid();
					
				if(!(inputGenre.equalsIgnoreCase(this.library.get(idValid(editBookID)).getGenre())))
				{
					inputGenre = stringValid();
					this.library.get(idValid(editBookID)).setGenre(inputGenre);
					System.out.println("The book's genre has been updated.");
					break;
				}
			}
		}
			
		//Changing bookPages
		else if(input == 6)
		{
			if(idIsValid(editBookID))
			{
				System.out.println("The current number of pages for this book is " 
						+ this.library.get(idValid(editBookID)).getPages() 
						+ ". Please enter a new pages for the book");
				int inputPages = numValid();
				
				if(this.library.get(idValid(editBookID)).getPages() != inputPages)
				{
					this.library.get(idValid(editBookID)).setPages(inputPages);
					System.out.println("The book's pages has been updated.");
				}
			}
		}
			
		//Changing ISBN
		else if(input == 7)
		{
			for(int i = 0; i < this.library.size(); i++)
			{
				System.out.println("The current ISBN for this book is " 
						+ this.library.get(idValid(editBookID)).getIsbn() 
						+ ". Please enter a new ISBN for the book");
				String inputIsbn = stringValid();
				//checks to see if user input matches any ISBN currently in the library array list	
				if(!(inputIsbn.equalsIgnoreCase(library.get(idValid(editBookID)).getIsbn())))
				{
					inputIsbn = stringValid();
					this.library.get(idValid(editBookID)).setIsbn(inputIsbn);
					System.out.println("The book's ISBN has been updated.");
					break;
				}
				else if(inputIsbn.equals(this.library.get(idValid(editBookID)).getIsbn()))
				{
					System.out.println("That ISBN already exists. Please enter another.");
					inputIsbn = stringValid();
				}
			}
		}
			
		//Changing bookQuantity
		else if(input == 8)
		{
			if(idIsValid(editBookID))
			{
				System.out.println("The current quantity of this book is " 
						+ this.library.get(idValid(editBookID)).getQuantity() 
						+ ". Please enter a new quantity for the book");
				int inputQuantity = numValid();
				
				if(this.library.get(idValid(editBookID)).getQuantity() != inputQuantity)
				{
					this.library.get(idValid(editBookID)).setPages(inputQuantity);
					System.out.println("The book's quantity has been updated.");
				}
			}
		}
		
		//Menu to allow user to repeat operation or to return to main menu
		int menuOption = yesNoMenu();
		
		if(menuOption == 1)
		{
			editBook();
		}
		else if(menuOption == 2)
		{
			in.nextLine();
			Library_Tester.mainMenu();
		}
	}
	
	
	//Ensures integer input is an integer and is greater than zero (0).
	
	/**
	 * Checks user input to ensure that it is an integer and is greater than zero
	 * @return inputValue - integer used for user input
	 */
	public int numValid()
	{
		int inputValue = -1;

		do
		{
			while(!in.hasNextInt())	//loops while user input is not an integer
			{
				System.out.println("That is not a valid integer, please try again.");
				in.next();
			}
			inputValue = in.nextInt();
		} while(inputValue < 0);	//loops while user input is negative
	return inputValue;
	}

	
	
	//Ensures valid string input
	
	/**
	 * Checks user input to ensure a String is entered.
	 * @return inputValue - string used for user input
	 */
	public String stringValid()
	{
		String inputValue;
		
		while(!in.hasNext())
		{
			System.out.println("That is not a valid text entry. Please try again.");
			in.next();
		}
		inputValue = in.nextLine();
		return inputValue;
	}
	
	
	//A bookID entered by the user is passed into the method and finds its array index in the library array.
	
	/**
	 * Passes user input of a book ID into the method. If it is valid, the method
	 * finds the array index corresponding to the book with that ID
	 * @param tempBookID - the unique ID of the book
	 * @return arrayIndex - the position of the book corresponding to the book in the library array index
	 */
	public int idValid(int tempBookID)
	{
		boolean validID = false;
		int arrayIndex = -1;
		
		for(int i = 0; i < this.library.size(); i++)
		{
			if(this.library.get(i).getBookID() == tempBookID)	//checks to see if user input matches ID entry in library array list
			{
				validID = true;
				arrayIndex = i;
			}
		}
		return arrayIndex;
	}
	
	
	//Passes in a bookID from the user to ensure that the bookID is valid.
	
	/**
	 * Passes user input of a book ID into the method. If that ID is valid, the method returns true;
	 * otherwise the method returns false.
	 * @param tempBookID - the unique ID of the book
	 * @return validID - boolean value specifying if ID was valid or not.
	 */
	public boolean idIsValid(int tempBookID)
	{
		boolean validID = false;
		
		for(int i = 0; i < this.library.size(); i++)
		{
			if(this.library.get(i).getBookID() == tempBookID)	//checks to see if user input matches ID entry in the library array list
			{
				validID = true;
			}
		}
		return validID;
	}
	
	
	//Checks to ensure ISBN is in the correct format.
	//3 numerical digits followed by 1 dash(-) followed by 10 more numerical digits.
	
	/**
	 * Ensures that user input for ISBN of a book is valid by matching String input to a
	 * regex pattern (3 digits, 1 hyphen(-), 10 digits)
	 * @return userIsbn - validated user ISBN of book
	 */
	public String isbnValid()
	{
		String regex = "\\d{3}\\-{1}\\d{10}";
		boolean validIsbn = false;
		String userIsbn = "";
		
		if(!validIsbn)
		{
			do
			{
				if(!userIsbn.matches(regex))	//if user input does not match regex pattern
				{
					validIsbn = false;
				}
				else
				{
					validIsbn = true;
				}
				while(!validIsbn)	//loops while ISBN does not match regex pattern
				{
					userIsbn = in.next();
					if(!userIsbn.matches(regex))
					{
						System.out.println("Please enter a valid ISBN");
						in.nextLine();
					}
					else
					{
						validIsbn = true;
						tempBookIsbn = userIsbn;	
					}
				}
			} while(!validIsbn);
		}
		return userIsbn;
	}
	
	
	//This method validates input to ensure that the option matches one of the available option
	//(between 1 & 8).
	
	/**
	 * Ensures that user input for the edit menu is valid by ensuring that is is an integer
	 * between 1 and 8.
	 * @return inputValue - validated user input integer corresponding to one of the menu options
	 */
	public int editMenuValid()
	{
		int inputValue = -1;
		do
		{
			System.out.println("Please enter a valid menu option.");
			while(!in.hasNextInt())	//loops user while input is not an integer
			{
				System.out.println("That is not a valid integer, please try again.");
				in.next();
			}
			inputValue = in.nextInt();
		} while(inputValue < 1 || inputValue > 8);	//loops while user input is not between 1 and 8
	return inputValue;
	}

	
	//Prints all books in the library
	
	/**
	 * Method that prints all books that are currently in the library array list along with all of their 
	 * variables.
	 */
	public void printBooks()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n---------------------------------------------------------------------"
				+ "\n\t\t\t\tCurrent Library"
				+ "\n---------------------------------------------------------------------\n");
		//for loop to print all books in library array list
		for(int i = 0; i < library.size(); i++)
		{
			System.out.println("Book ID: \t" + this.library.get(i).getBookID()
					+ "\nTitle: \t\t" + this.library.get(i).getTitle() 
					+ "\nAuthor: \t" + this.library.get(i).getAuthor()
					+ "\nPublisher: \t" + this.library.get(i).getPublisher() 
					+ "\nGenre: \t\t" + this.library.get(i).getGenre()
					+ "\nNumber of \nPages: \t\t" + this.library.get(i).getPages() 
					+ "\nISBN: \t\t" + this.library.get(i).getIsbn()
					+ "\nQuantity held: \t" + this.library.get(i).getQuantity() 
					+ "\nNumber on \nloan: \t\t" + this.library.get(i).getNumOnLoan() 
					+ "\nNumber of \nloans: \t\t" + this.library.get(i).getNumOfLoans()
					+ "\n-----------------------------------------------\n");
		}
		
		//Menu to allow user to repeat operation or to return to main menu
		int menuOption = yesNoMenu();
		
		if(menuOption == 1)
		{
			printBooks();
		}
		else if(menuOption == 2)
		{
			in.nextLine();
			Library_Tester.mainMenu();
		}
	}
	
	
	//Prints the information relating to a single book by taking in
	//the bookID from a user.
	
	/**
	 * @see printBooks() - prints all variables for all books in the library array list.
	 * Similar method to printBooks() however, it only prints the variables for one book in the array list
	 * @param singleBookID - user input book ID
	 */
	public void printSingleBook(int singleBookID)
	{
		System.out.println("\n"
				+ "\n---------------------------------------------------------------------"
				+ "\n\t\t\tBook Information"
				+ "\n---------------------------------------------------------------------\n");
		//for loop to print out details of book if it matches user input book ID
		for(int i = 0; i < this.library.size(); i++)
		{
			if(this.library.get(i).getBookID() == singleBookID)
			{
				System.out.println("Book ID: \t" + this.library.get(i).getBookID() 
						+ "\nTitle: \t\t" + this.library.get(i).getTitle() 
						+ "\nAuthor: \t" + this.library.get(i).getAuthor()
						+ "\nPublisher: \t" + this.library.get(i).getPublisher() 
						+ "\nGenre: \t\t" + this.library.get(i).getGenre()
						+ "\nNumber of \nPages: \t\t" + this.library.get(i).getPages() 
						+ "\nISBN: \t\t" + this.library.get(i).getIsbn()
						+ "\nQuantity held: \t" + this.library.get(i).getQuantity() 
						+ "\nNumber on \nloan: \t\t" + this.library.get(i).getNumOnLoan()  
						+ "\nNumber of \nloans: \t\t" + this.library.get(i).getNumOfLoans() 
						+ "\n-----------------------------------------------\n");
			}
		}
	}
	
	
	//Show current titles
	
	/**
	 * Method that prints out the IDs and the titles of books currently in the library
	 * @see getBookID() - returns the ID of the book
	 * @see getTitle() - returns the title of the book
	 */
	public void printCurrentTitles()
	{
		System.out.println("\n---------------------------------------------------------------------"
				+ "\nThese are the current titles in the library"
				+ "\n---------------------------------------------------------------------");
		
		for(int i = 0; i < library.size(); i++)
		{
			System.out.println(library.get(i).getBookID() 
					+ ". " 
					+ library.get(i).getTitle());
		}
	}
	
	
	//Print Single Book Information
	
	/**
	 * Method that gives the user a list of current books in the library and 
	 * asks them for the ID of the book they wish to see the information of.
	 * If user input corresponds to a book the method calls printSingleBook(int)
	 * @see printCurrentTitles() - prints out the IDs and the titles of books currently in the library
	 * @see numValid() - validates that user input is a positive integer
	 * @see printSingleBook(int) - prints all details of the book that the integer passed into it matches
	 */
	public void printSingleBookInfo()
	{
		System.out.println("\n\n\n\n\n\n"
				+ "\n---------------------------------------------------------------------"
				+ "\n\t\t\tView a single book"
				+ "\n---------------------------------------------------------------------");
		printCurrentTitles();		
		System.out.println("\n\nPlease enter the ID of the book you wish to see the information of.");
		int input = numValid();
		
		while(!idIsValid(input))
		{
			System.out.println("That is not a valid ID. Please enter a valid ID");
			input = numValid();
		}
			
		for(int j = 0; j < library.size(); j++)
		{	
			if(input == library.get(j).getBookID())
			{
				printSingleBook(input);
			}
		}
		
		//Menu to allow user to repeat operation or to return to main menu
		int menuOption = yesNoMenu();
		
		if(menuOption == 1)
		{
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			printSingleBookInfo();
		}
		if(menuOption == 2)
		{
			in.nextLine();
			Library_Tester.mainMenu();
		}
	}
	
	
	//Loan book
	
	/**
	 * User selects a book by ID and if the book is available to loan (number on loan is less than
	 * quantity held) the book is loaned. When the book is loaned, the number on loan increments
	 * and the quantity held is decremented
	 * @see numValid() - validates that user input is a positive integer
	 * @see idIsValid(int) - checks to see if user input is a valid book ID in library array list
	 * @see printCurrentTitles() - prints out the IDs and the titles of books currently in the library
	 */
	public void loanBook()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n---------------------------------------------------------------------"
				+ "\n\t\t\t\tLoan a book"
				+ "\n---------------------------------------------------------------------");
		printCurrentTitles();
		System.out.println("\nPlease enter the ID of the book you wish to loan");
		int input = numValid();
		
		while(!idIsValid(input))
		{
			System.out.println("That is not a valid ID. Please enter a valid ID");
			input = numValid();
		}
		
		for(int i = 0; i < this.library.size(); i++)
		{
			if(input == this.library.get(i).getBookID())
			{
				if(this.library.get(i).getQuantity() > 0)
				{
					this.library.get(i).setNumOnLoan(this.library.get(i).getNumOnLoan()+1);
					this.library.get(i).setQuantity(this.library.get(i).getQuantity()-1);
					System.out.println(this.library.get(i).getTitle() + " is now on loan.");
				}
				else if(this.library.get(i).getQuantity() < 1)
				{
					System.out.println("All copies of " + this.library.get(i).getTitle() 
							+ " are currently on loan.");
				}
			}
		}
		
		//Menu to allow user to repeat operation or to return to main menu
		int menuOption = yesNoMenu();
		
		if(menuOption == 1)
		{
			loanBook();
		}
		else if(menuOption == 2)
		{
			in.nextLine();
			Library_Tester.mainMenu();
		}
	}
	
	
	//Return book
	
	/**
	 * User selects a book by ID to return. When returned the number on loan (if greater than
	 * zero) will be returned, otherwise the user is informed that no copies of that book were on loan.
	 * When the book is returned, the number on loan decrements and the quantity held is incremented.
	 * @see numValid() - validates that user input is a positive integer
	 * @see idIsValid(int) - checks to see if user input is a valid book ID in library array list
	 * @see printCurrentTitles() - prints out the IDs and the titles of books currently in the library
	 */
	public void returnBook()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n---------------------------------------------------------------------"
				+ "\n\t\t\t\tReturn a book"
				+ "\n---------------------------------------------------------------------");
		printCurrentTitles();
		System.out.println("\nPlease enter the ID of the book you wish to return");
		int input = numValid();
		
		while(!idIsValid(input))
		{
			System.out.println("That is not a valid ID. Please enter a valid ID");
			input = numValid();
		}
		
		for(int i = 0; i < this.library.size(); i++)
		{
			if(input == this.library.get(i).getBookID())
			{
				if(this.library.get(i).getNumOnLoan() > 0)
				{
					this.library.get(i).setNumOnLoan(this.library.get(i).getNumOnLoan()-1);
					System.out.println(this.library.get(i).getTitle() + " has been returned.");
					this.library.get(i).setQuantity(this.library.get(i).getQuantity()+1);
					this.library.get(i).setNumOfLoans(this.library.get(i).getNumOfLoans()+1);
				}
				else
				{
					System.out.println("No copies of " + this.library.get(i).getTitle() 
							+ " are currently out on loan.");
				}
			}	
		}
		
		//Menu to allow user to repeat operation or to return to main menu
		int menuOption = yesNoMenu();
		
		if(menuOption == 1)
		{
			returnBook();
		}
		else if(menuOption == 2)
		{
			in.nextLine();
			Library_Tester.mainMenu();
		}
	}

	
	//Search books by author
	
	/**
	 * Allows a user to search for all of the books by a certain author. The method creates an array
	 * of array indexes of books where the user input author matches an author in the library array list. 
	 * These array indexes are used to print out the details of each book. If the number of array indexes is 
	 * zero (in other words, there are no books by that author) the user will get a message saying there are 
	 * no books by that author).
	 * @see stringValid() - ensures a string is input from the user
	 * @param arrayIndexes - an array of array indexes of books in the library array list where the user input
	 * matches an author in the library array list
	 * @see searchAuthorAgain() - allows the user to search by author again or to return to the main menu
	 */
	public void searchAuthor()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n---------------------------------------------------------------------"
				+ "\n\t\t\tSearch by author"
				+ "\n---------------------------------------------------------------------");
		System.out.println("\nTo search for all books by an author, type their name below");
		String input = stringValid();
		System.out.println("All books by: " + input);
		int[] arrayIndexes = new int[library.size()];
		int n = 0;
		for(int i = 0; i < library.size(); i++)
		{
			if(input.equalsIgnoreCase(library.get(i).getAuthor()))
			{
				arrayIndexes[n] = i;
				n++;
			}
		}
		
		for(int j = 0; j < n; j++)
		{
			printSingleBook(library.get(arrayIndexes[j]).getBookID());
		}
		
		if(n < 1)
		{
			System.out.println("There are no books by that author.");
		}
		searchAuthorAgain();
	}
	
	/**
	 * Allows the user to search again by inputting 1 or to return to the main menu by selecting 2.
	 * @see numValid() - ensures user input is a positive integer
	 */
	public void searchAuthorAgain()
	{
		System.out.println("Would you like to search again?");
		System.out.println("1. Yes"
				+ "\n2. No");
		int menuOption = numValid();
		
		while(menuOption < 1 || menuOption > 2)
		{
			System.out.println("Please enter a valid menu option");
			menuOption = numValid();
		}
		
		if(menuOption == 1)
		{
			in.nextLine();
			searchAuthor();
		}
		else if(menuOption == 2)
		{
			in.nextLine();
			Library_Tester.mainMenu();
		}
	}
	
	
	//Search books by genre
	
	/**
	 * Allows a user to search for all of the books in a certain genre. The method creates an array
	 * of array indexes of books where the user input genre matches a genre in the library array list. 
	 * These array indexes are used to print out the details of each book. If the number of array indexes is 
	 * zero (in other words, there are no books in that genre) the user will get a message saying there are 
	 * no books in that genre).
	 * @see stringValid() - ensures a string is input from the user
	 * @param arrayIndexes - an array of array indexes of books in the library array list where the user input
	 * matches an author in the library array list
	 * @see searchGenreAgain() - allows the user to search by genre again or to return to the main menu
	 */
	public void searchGenre()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n---------------------------------------------------------------------"
				+ "\n\t\t\tSearch by genre"
				+ "\n---------------------------------------------------------------------");
		System.out.println("\nTo search for all books in a genre, type genre below");
		String input = stringValid();
		System.out.println("All books in: " + input);
		int[] arrayIndexes = new int[library.size()];
		int n = 0;
		for(int i = 0; i < library.size(); i++)
		{
			if(input.equalsIgnoreCase(library.get(i).getGenre()))
			{
				arrayIndexes[n] = i;
				n++;
			}
		}
		
		for(int j = 0; j < n; j++)
		{
			printSingleBook(library.get(arrayIndexes[j]).getBookID());
		}
		
		if(n < 1)
		{
			System.out.println("There are no books in that genre.");
		}
		searchGenreAgain();
	}
	
	/**
	 * Allows the user to search again by inputting 1 or to return to the main menu by selecting 2.
	 * @see numValid() - ensures user input is a positive integer
	 */
	public void searchGenreAgain()
	{
		System.out.println("Would you like to search again?");
		System.out.println("1. Yes"
				+ "\n2. No");
		int menuOption = numValid();

		while(menuOption < 1 || menuOption > 2)
		{
			System.out.println("Please enter a valid menu option");
			menuOption = numValid();
		}
		
		if(menuOption == 1)
		{
			in.nextLine();
			searchGenre();
		}
		else if(menuOption == 2)
		{
			in.nextLine();
			Library_Tester.mainMenu();
		}
	}
	
	
	//Return books with pages below specified amount
	
	/**
	 * Allows a user to search for all of the books by an upper limit of pages. The method creates an array
	 * of array indexes of books where the pages of the book is less than user input, in the library array list. 
	 * These array indexes are used to print out the details of each book. If the number of array indexes is 
	 * zero (in other words, there are no books below that limit) the user will get a message saying there are 
	 * no books shorter than that).
	 * @see stringValid() - ensures a string is input from the user
	 * @param arrayIndexes - an array of array indexes of books in the library array list where the number of pages
	 * of the books is less than the user input max limit
	 * @see searchPagesAgain() - allows the user to search by number of pages again or to return to the main menu
	 */
	public void searchPages()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n---------------------------------------------------------------------"
				+ "\n\t\t\tSearch by book length"
				+ "\n---------------------------------------------------------------------");
		System.out.println("\nPlease enter the maximum length of book you would like");
		int input = numValid();
		System.out.println("All books with length equal to or below " + input + " pages");
		int[] arrayIndexes = new int[library.size()];
		int n = 0;
		
		for(int i = 0; i < library.size(); i++)
		{
			if(input >= library.get(i).getPages())
			{
				arrayIndexes[n] = i;
				n++;
			}
		}
		
		for(int j = 0; j < n; j++)
		{
			printSingleBook(library.get(arrayIndexes[j]).getBookID());
		}
		
		if(n < 1)
		{
			System.out.println("There are no books shorter than that length.");
		}
		searchPagesAgain();
	}
	
	/**
	 * Allows the user to search again by inputting 1 or to return to the main menu by selecting 2.
	 * @see numValid() - ensures user input is a positive integer
	 */
	public void searchPagesAgain()
	{
		System.out.println("Would you like to search again?");
		System.out.println("1. Yes"
				+ "\n2. No");
		int menuOption = numValid();
		
		switch(menuOption)
		{
		case 1: in.nextLine(); searchPages(); break;
		case 2: Library_Tester.mainMenu(); break;
		default: System.out.println("Please enter a valid menu option.");
		menuOption = numValid(); break;
		}
	}
	
	
	//Sort by author
	
	/**
	 * Creates an array list of authors currently in the library. It then orders the authors in alphabetical
	 * order and removes duplicate entries. It then prints out all of the books in the library,
	 * grouped by author and sorted in alphabetical order
	 * @param authors - an array list of authors currently in the library array list
	 * @param n - used as a count variable to loop through the authors array list
	 */
	public void sortAuthor()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n---------------------------------------------------------------------"
				+ "\n\t\t\tSort by Author"
				+ "\n---------------------------------------------------------------------");
		ArrayList<String> authors = new ArrayList<String>();
		
		for(int i = 0; i < library.size(); i++)
		{
			authors.add(library.get(i).getAuthor());
		}
		
		Collections.sort(authors, String.CASE_INSENSITIVE_ORDER);
		int n = 0;
		
		while(n < authors.size()-1)
		{
			if(authors.get(n).equalsIgnoreCase(authors.get(n+1)))
			{
				authors.remove(n);
			}
			else
			{
				n++;
			}
		}
		
		for(int j = 0; j < authors.size(); j++)
		{
			System.out.println("\n\n\n\n\nBooks by " + authors.get(j));
			
			for(int k = 0; k < library.size(); k++)
			{
				if(authors.get(j).equalsIgnoreCase(library.get(k).getAuthor()))
				{
					printSingleBook(library.get(k).getBookID());
				}
			}
		}
		
		//Menu to allow user to repeat operation or to return to main menu
		int menuOption = yesNoMenu();
		
		if(menuOption == 1)
		{
			sortAuthor();
		}
		else if(menuOption == 2)
		{
			Library_Tester.mainMenu();
		}
	}
	
	
	//Sort by genre
	
	/**
	 * Creates an array list of genres currently in the library. It then orders the genres in alphabetical
	 * order and removes duplicate entries. It then prints out all of the books in the library,
	 * grouped by genre and sorted in alphabetical order
	 * @param genres - an array list of genres currently in the library array list
	 * @param n - used as a count variable to loop through the genres array list
	 */
	public void sortGenre()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n---------------------------------------------------------------------"
				+ "\n\t\t\tSort by Genre"
				+ "\n---------------------------------------------------------------------");
		ArrayList<String> genres = new ArrayList<String>();
		
		for(int i = 0; i < library.size(); i++)
		{
			genres.add(library.get(i).getGenre());
		}
		
		Collections.sort(genres, String.CASE_INSENSITIVE_ORDER);
		int n = 0;
		
		while(n < genres.size()-1)
		{
			if(genres.get(n).equalsIgnoreCase(genres.get(n+1)))
			{
				genres.remove(n);
			}
			else
			{
				n++;
			}
		}
		
		for(int j = 0; j < genres.size(); j++)
		{
			System.out.println("\n\n\n\n\nBooks in the " + genres.get(j) + " genre");
			
			for(int k = 0; k < library.size(); k++)
			{
				if(genres.get(j).equalsIgnoreCase(library.get(k).getGenre()))
				{
					printSingleBook(library.get(k).getBookID());
				}
			}
		}
		
		//Menu to allow user to repeat operation or to return to main menu
		int menuOption = yesNoMenu();
		
		if(menuOption == 1)
		{
			sortGenre();
		}
		else if(menuOption == 2)
		{
			Library_Tester.mainMenu();
		}
	}
}