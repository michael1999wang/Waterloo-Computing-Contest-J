// The "SheepAndCoyotes" class.
import java.awt.*;
import hsa.Console;

public class SheepAndCoyotes
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int numberOfSheep = c.readInt ();

	double x[] = new double [numberOfSheep];
	double y[] = new double [numberOfSheep];
	double distance[] = new double [numberOfSheep];
	int currentSmallest = 1000;

	for (int i = 0 ; i < numberOfSheep ; i++)
	{
	    x [i] = c.readDouble ();
	    y [i] = c.readDouble ();
	    distance [i] = Math.sqrt (x [i] * x [i] + y [i] * y [i]);
	}

	for (int i = 0 ; i < numberOfSheep ; i++)
	{
	    if (distance [i] < currentSmallest)
	    {
		currentSmallest = i;
	    }
	}
	
	c.println ();
	c.print ("The sheep at (");
	c.print (x [currentSmallest],0,2);
	c.print (", ");
	c.print (y [currentSmallest], 0 , 2);
	c.println (") might be eaten.");

    } // main method
} // SheepAndCoyotes class
