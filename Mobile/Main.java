import java.lang.*;

public class Main
{
    public static void main(String[] args)
    {
        Mobile m1 = new Mobile(8764798, "Black", "Oneplus");
        Processor p1 = new Processor(500, m1);

        p1.details();
    }
}