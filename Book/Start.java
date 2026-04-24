import java.lang.*;

public class Start{
	public static void main(String[] args)
	{
		Book b1=new Ebook(101,15.99,2.5F);
		Book b2=new PrintedBook(202,45,3);
		
		PrintedBook p1 = new PrintedBook(303,102,3);
		
		b1.addCopy(10);
		b1.removeCopy(4);
		
		Member m1=new Member("Sasuke",4);
		
		m1.insertBook(b1);
		m1.insertBook(b2);
		m1.insertBook(p1);
		m1.updateBook(p1,999.99);
		
		m1.details();
	}
}