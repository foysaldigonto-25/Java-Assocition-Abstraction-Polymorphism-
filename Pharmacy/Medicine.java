import java.lang.*;

public  abstract class Medicine
{
	private int medicineId;
	private double price;
	
	public Medicine ()
	{
		System.out.println ("Empty for Medicine");
	}
	
	public Medicine (int medicineId,double price)
	{
		this.medicineId=medicineId;
		this.price=price;
		System.out.println("Para for Medicine");
	}
	
	public void setMedicineId (int medicineId)
	{
		this.medicineId=medicineId;
	}
	
	public void setPrice (double price)
	{
		this.price = price;
	}
	
	public int getMedicineId ()
	{
		return medicineId;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public abstract void details ();
	
}

	