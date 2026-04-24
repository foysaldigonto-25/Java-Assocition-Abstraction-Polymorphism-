import java.lang.*;

public abstract class Book implements OpBook
{
	private int bookId;
	private double price;
	private int copies;
	
	public Book ()
	{
		System.out.println("Empty for Book");
	}
	
	public Book (int bookId,double price)
	{
		this.bookId=bookId;
		this.price=price;
		System.out.println("Para for Book");
	}
	
	public void setBookId (int bookId)
	{
		this.bookId=bookId;
	}
	
	public int getBookId ()
	{
		return bookId;
	}
	
    public void setPrice (double price)
	{
		this.price=price;
	}
	
	public double getPrice ()
	{
		return price;
	}
	
	public void setCopies(int copies)
    {
        this.copies=copies;
    }

    public int getCopies()
    {
        return copies;
    }
	
	public void addCopy (int qty)
	{
		if (qty>0)
		{
			copies+=qty;
		}
	else { System.out.println("Check Quantity");}}
		
    public void removeCopy (int qty)
	{
	    if(qty>0 && copies>=qty)
	    {
			copies-=qty;
		}
	else { System.out.println("Check Quantity");}}
	
	public abstract void details();
	
}
		
			
		
    