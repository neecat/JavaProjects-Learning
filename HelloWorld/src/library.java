public class library {
	String address;
	int numbofbooks = 0;
	Book[] book = new Book[6];

	public void printAvailableBooks() {
		System.out.println("Library: "+this.address);
		if (numbofbooks == 0) {
			System.out.println("The library doesn't have any books.");
		} else {
			for(int x=0; x<numbofbooks; x++){
				System.out.println("Book:"+book[x].title);
				if(!book[x].isBorrowed())
				{
					System.out.println("Available");
				} else
				{
					System.out.println("Borrowed");
				}
			}
		}
	}
	public library(String add)
	{
		address=add;
	}
	// Borrow a book
	public void borrowBook(String booktitle) {
		// seek for the book in the library
		if (numbofbooks == 0) {
			System.out.println("The library doesn't have any books.");
		} else {
			for (int x = 0; x < numbofbooks; x++) {
				if (booktitle == book[x].title) {
					if (!book[x].isBorrowed()) {
						book[x].borrowed();
					} else {
						System.out.println(booktitle + " is already borrowed.");
					}
					break;
				}
			}
		}
	}

	// Return a book
	public void returnBook(String booktitle) {
		for (int x = 0; x < numbofbooks; x++)
		{
			if (booktitle == book[x].title)
			{
				if(book[x].isBorrowed())
				{
					book[x].returned();
					System.out.println(booktitle+" has been returned.");
					break;
				}else
				{
					System.out.println("This book was never borrowed.");
				}
			}
		}
	}

	public void addBook(String booktitle) {
		try{
		book[numbofbooks]=new Book(booktitle);
		} catch(NullPointerException e)
		{
			System.err.println("Null Pointer Exception: "+e.getMessage());
			
		}
		numbofbooks++;
	}

	public void printHours() {
		System.out
				.println("The library is open Monday through Friday, 9am to 4pm.");
	}
	public static void main (String[] args){
		library firstLibrary = new library ("10 Main St.");
		library secondLibrary = new library ("228 Liberty St.");
		
		firstLibrary.addBook("The Da Vinci Code");
		firstLibrary.addBook("Le Petit Prince");
		firstLibrary.addBook("A Tale of Two Cities");
		firstLibrary.addBook("The Lord of the Rings");
		firstLibrary.borrowBook("The Lord of the Rings"); 
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Books available in the second library:");
		secondLibrary.printAvailableBooks(); 
		System.out.println();// Return The Lords of the Rings to the first library 
		System.out.println("Returning The Lord of the Rings:"); 
		firstLibrary.returnBook("The Lord of the Rings"); 
		System.out.println(); 
		// Print the titles of available from the first library 
		System.out.println("Books available in the first library:"); 
		firstLibrary.printAvailableBooks(); 
	}

}
