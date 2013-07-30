
public class library {
	String address;
	int numbofbooks=0;
	Book[] book;
	void printAvailableBooks()
	{
		if(numbofbooks==0)
		{
			System.out.println("The library doesn't have any books.");
		} else{
			//Look through the library's index
		}
	}
	void borrowBook(String booktitle)
	{
		//seek for the book in the library
	}
	void addBook(String booktitle)
	{
		book[numbofbooks]=new Book(booktitle);
		numbofbooks++;
	}
	void printHours()
	{
		System.out.println("The library is open Monday through Friday, 9am to 4pm.");
	}
	
	
}
