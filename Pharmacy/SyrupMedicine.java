import java.lang.*;

public class SyrupMedicine extends Medicine 
{
	private float volumeMl;
	
	public SyrupMedicine()
	{
		super ();
		System.out.println ("Empty for Syrup");
	}
	
	public SyrupMedicine (int medicineId,double price,float volumeMl)
	{
		super (medicineId,price);
		this.volumeMl=volumeMl;
		System.out.println ("Para for Syrup");
	}
	
	public void setVolumeMl (float volumeMl)
	{
		this.volumeMl=volumeMl;
	}
	
	public float getVolumeMl()
	{
		return volumeMl;
	}
	
	public void details()
	{
		System.out.println(" Medicine ID: " + getMedicineId());
		System.out.println(" Price: " + getPrice());
		System.out.println("  Volume (Ml): " + volumeMl);
	}
}
		