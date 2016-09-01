// The "PiDay" class.
import java.awt.*;
import hsa.Console;

public class PiDay
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int n = c.readInt ();
	int k = c.readInt ();
	int numbers[] = new int [k];
	int count = 0;

	c.println ();

	if (k == 1)
	{
	    count++;
	}

	if (n / k * k == n)
	{
	    count++;
	}

	for (int i = 0 ; i <= k ; i++)
	{
	    if (i == 0)
	    {
		numbers [i] = (i + 1);
	    }
	}

	c.println ();
	c.println (count);
	
    } // main method
} // PiDay class
