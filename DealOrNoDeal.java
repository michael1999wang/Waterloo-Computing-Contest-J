// The "DealOrNoDeal" class.
import java.awt.*;
import hsa.Console;

public class DealOrNoDeal
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int numberOfCases = c.readInt ();
	int cases[] = {100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000};
	int eliminated, total = 0;

	for (int i = 0 ; i < numberOfCases ; i++)
	{
	    eliminated = c.readInt ();
	    cases [eliminated - 1] = 0;
	}

	int offer = c.readInt ();

	for (int i = 0 ; i < 10 ; i++)
	{
	    total +=cases [i];
	}

	total = total / 10;

	c.println ();
	
	if (total > offer)
	{
	    c.println ("Deal");
	}
	else
	{
	    c.println ("No Deal");
	}

    } // main method
} // DealOrNoDeal class
