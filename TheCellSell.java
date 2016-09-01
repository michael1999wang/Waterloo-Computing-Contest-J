// The "TheCellSell" class.
import java.awt.*;
import hsa.Console;

public class TheCellSell
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	double totalA = 0, totalB = 0;

	c.println ("Number of daytime minutes?");
	int daytime = c.readInt ();
	c.println ("Number of evening minutes?");
	int evening = c.readInt ();
	c.println ("Number of weekend minutes?");
	int weekend = c.readInt ();

	//Plan A
	if (daytime > 100)
	{
	    totalA += (daytime - 100) * 0.25;
	}
	totalA += evening * 0.15;
	totalA += weekend * 0.20;

	//Plan B
	if (daytime > 250)
	{
	    totalB += (daytime - 250) * 0.25;
	}
	totalB += evening * 0.35;
	totalB += weekend * 0.25;

	c.print ("Plan A costs ");
	c.println (totalA, 0, 2);
	c.print ("Plan B costs ");
	c.println (totalB, 0, 2);

	if (totalA < totalB)
	{
	    c.println ("Plan A is cheapest.");
	}

	else if (totalA > totalB)
	{
	    c.println ("Plan B is cheapest.");
	}

	else if (totalA == totalB)
	{
	    c.println ("Plan A and B are the same price.");
	}

    } // main method
} // TheCellSell class
