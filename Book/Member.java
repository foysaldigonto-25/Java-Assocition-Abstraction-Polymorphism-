import java.lang.*;

public class Member implements OpMember
{
	private String name;
	private Book book[];
	
	public Member ()
	{
		System.out.println ("Empty for member");
	}
	
	public Member (String name,int size)
	{
        this.name=name;
        book =new Book[size];
        System.out.println("Para for member");
	}
    public void insertBook (Book b)
	{
       for (int i=0;i<book.length;i++)
	   {
           	if (book[i]==null)
			{
				book[i]=b;
				break;
			}
	   }
	}
	
	public void deleteBook (Book b)
	{
		for (int i=0;i<book.length;i++)
		{
			if (book[i]==b)
			{
				book[i]=null;
				break;
			}
		}
	}
	
	public void updateBook (Book b,double price)
	{
		for (int i=0;i<book.length;i++)
		{
			if (book[i]==b)
			{
				book[i].setPrice (price);
				break;
			}
		}
	}
	
	public void details ()
	{
		System.out.println("Name :" + name);
		for (int i=0;i<book.length;i++)
		{
			if (book[i]!=null)
			{
				book[i].details();
			}
			else 
			{
				System.out.println("Slot Empty");
			}
		}
	}
}