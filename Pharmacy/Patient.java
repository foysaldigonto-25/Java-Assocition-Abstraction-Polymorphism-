import java.lang.*;

public class Patient{

  private String name;
  private Medicine med [];
  
  public Patient()
  {
     System.out.println("Empty for Patient");
  }
  
  public Patient (String name,int size)
  {
	  this.name = name;
	  med=new Medicine [size];
	  System.out.println("Para for patient");
  }
  
  public void setName (String name)
  {
	  this.name = name;
  }
  public String getName ()
  {
	  return name;
  }
  
  public void insertMedicine (Medicine m)
  {
	  for (int i=0;i<med.length;i++)
	  {
		  if (med[i]==null)
		  {
			  med[i]=m;
			  break;
		  }
	  }
  }
  
  public void deleteMedicine (Medicine m)
  {
	  for (int i=0;i<med.length;i++)
	  {
		  if (med[i]==m)
		  {
			  med[i]=null;
			  break;
		  }
	  }
  }
  
  public void details()
  {
	  for (int i=0;i<med.length;i++)
	  {
		  if (med[i]!=null)
		  {
			  med[i].details();
		  }
		  else
		  {
			  System.out.println ("Index Null");
		  }
	  }
  }
}
	  
	  
  
  