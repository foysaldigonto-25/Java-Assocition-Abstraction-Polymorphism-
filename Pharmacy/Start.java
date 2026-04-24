import java.lang.*;

public class Start
{
    public static void main (String[] args)
      {
		  Medicine m1= new TabletMedicine(101,15.50,3);
		  Medicine m2= new SyrupMedicine (202,45,10.5F);
		  
		  TabletMedicine t1 = new TabletMedicine(303,22,2);
		  SyrupMedicine s1 = new SyrupMedicine(657,62.83,100.25F);
		  
		  Patient p1= new Patient ("Maisha",5);
		  
		  p1.insertMedicine(m1);
		  p1.insertMedicine(m2);
		  p1.insertMedicine(t1);
		  p1.insertMedicine(s1);
		  
		  p1.details();
	  }
}
	
	