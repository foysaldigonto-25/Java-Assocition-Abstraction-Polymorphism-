import java.lang.*;

public class Mobile
{
    private int ime;
    private String colour;
    private String model;

    public Mobile (int ime, String colour, String model)
    {
        this.ime = ime;
        this.colour = colour;
        this.model = model;
    }

    public void setId(int ime)
    {
        this.ime = ime;
    }

    public void setColour(String colour)
    {
        this.colour = colour;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getIme()
    {
        return ime;
    }

    public String getColour()
    {
        return colour;
    }

    public String getModel()
    {
        return model;
    }

    public void details()
    {
        System.out.println("IME :" + ime);
        System.out.println("Colour :" + colour);
        System.out.println("Model :" + model);
    }
}