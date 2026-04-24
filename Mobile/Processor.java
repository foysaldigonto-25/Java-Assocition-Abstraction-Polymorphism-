import java.lang.*;

public class Processor
{
    private int threads;
    private Mobile mbl;

    public Processor (int threads, Mobile mbl)
    {
        this.threads = threads;
        this.mbl = mbl;
    }

    public void setThreads(int threads)
    {
        this.threads = threads;
    }

    public void setMbl(Mobile mbl)
    {
        this.mbl = mbl;
    }

    public int getThreads()
    {
        return threads;
    }

    public Mobile getMbl()
    {
        return mbl;
    }

    public void details()
    {
        System.out.println("Threads :" + threads);
        mbl.details();
    }
}