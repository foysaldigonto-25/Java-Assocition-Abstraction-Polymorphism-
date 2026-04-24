import java.lang.*;

public class Ebook extends Book
{
	private float fileSize;
	
	public Ebook ()
	{
		super ();
		System.out.println ("Empty for Ebook");
	}
	
	public Ebook (int bookId,double price,float fileSize)
	{
		super (bookId,price);
		this.fileSize=fileSize;
		System.out.println ("Para for Ebook");
	}
	
	public void setFileSize (float fileSize)
	{
		this.fileSize=fileSize;
	}
	
	public float getFileSize ()
	{
		return fileSize;
	}
	
	public void details()
	{
		System.out.println(" Book ID :" + getBookId());
		System.out.println(" Price :" + getPrice());
		System.out.println(" File Size :" + fileSize);
	}
}
		
		

	