import java.lang.*;

public class TabletMedicine extends Medicine 
{
	private int dosageCount;
	
	public TabletMedicine()
	{
		super ();
		System.out.println ("Empty for Tablet");
	}
	
	public TabletMedicine (int medicineId,double price,int dosageCount)
	{
		super (medicineId,price);
		this.dosageCount=dosageCount;
		System.out.println ("Para for Tablet");
		
	}
	
	public void setDosageCount (int dosageCount)
	{
		this.dosageCount=dosageCount;
	}
	
	public int getDosageCount()
	{
		return dosageCount;
	}
	
	public void details()
	{
		System.out.println(" Medicine ID: " +getMedicineId());
		System.out.println(" Price: " + getPrice());
		System.out.println("Dosage Count: " + dosageCount);
	}
}
		