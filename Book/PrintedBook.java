import java.lang.*;

public class PrintedBook extends Book
{
	private int edition;
	
	public PrintedBook ()
	{
		super ();
		System.out.println ("Empty for printed book");
	}
	
	public PrintedBook (int bookId,double price,int edition)
	{
		super (bookId,price);
		this.edition=edition;
		System.out.println ("Para for edition");
	}
	
	public void setEdition (int edition)
	{
		this.edition=edition;
	}
	
	public int getEdition ()
	{
		return edition;
	}
	
	public void details()
	{
		System.out.println(" Book ID :" + getBookId());
		System.out.println(" Price :" + getPrice());
		System.out.println(" Edition :" + edition);
	}
}
		
		

	