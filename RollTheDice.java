// The "RollTheDice" class.
import java.awt.*;
import hsa.Console;

public class RollTheDice
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	c.print ("Enter m: ");
	int m = c.readInt ();
	c.print ("Enter n: ");
	int n = c.readInt ();
	int count = 0, current;

	if (m < n)
	{
	    for (int i = 1 ; i <= m ; i++)
	    {
		current = 10 - i;
		if (current <= n)
		{
		    count++;
		}
	    }
	}
	else if (m > n)
	{
	    for (int i = 1 ; i <= n ; i++)
	    {
		current = 10 - i;
		if (current <= m)
		{
		    count++;
		}
	    }
	}

	c.println ();
	c.println ("There are " + count + " ways to get the sum 10");

    } // main method
} // RollTheDice class
