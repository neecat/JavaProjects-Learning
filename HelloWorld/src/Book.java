
public class Book {
	String title;
	boolean borrowed;
	
	public Book(String bookTitle){
	title=bookTitle;
	}
	
	public void borrowed(){
		//mark book borrowed
		borrowed=true;
	}
	public void returned(){
		//mark book returned
		borrowed=false;
	}
	public boolean isBorrowed(){
		//boolean
		return borrowed;
	}
	public String getTitle(){
	 //string	
		return title;
	}
	public static void main(String[] arguments)
	{
		Book example= new Book("Fifty Shades of Gray");
		System.out.println("Book Title: "+example.getTitle());
		System.out.println("Borrowed?: "+example.isBorrowed());
		example.borrowed();
		System.out.println("Borrowed?: "+example.isBorrowed());
		example.returned();
		System.out.println("Borrowed?: "+example.isBorrowed());
	}
	
}
