// The "TheNewCCC" class.
import java.awt.*;
import hsa.Console;

public class TheNewCCC
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int total = 0;

	c.println ("Welcome to Chip's Fast Food Emporium");
	c.print ("Please enter a burger choice: ");
	int burger = c.readInt ();
	c.print ("Please enter a side order choice: ");
	int sideOrder = c.readInt ();
	c.print ("Please enter a drink choice: ");
	int drink = c.readInt ();
	c.print ("Please enter a dessert choice: ");
	int dessert = c.readInt ();
	c.println ();

	if (burger == 1)
	{
	    total += 461;
	}

	else if (burger == 2)
	{
	    total += 431;
	}

	else if (burger == 3)
	{
	    total += 420;
	}

	if (sideOrder == 1)
	{
	    total += 100;
	}

	else if (sideOrder == 2)
	{
	    total += 57;
	}

	else if (sideOrder == 3)
	{
	    total += 70;
	}

	if (drink == 1)
	{
	    total += 130;
	}

	else if (drink == 2)
	{
	    total += 160;
	}

	else if (drink == 3)
	{
	    total += 118;
	}

	if (dessert == 1)
	{
	    total += 167;
	}

	else if (dessert == 2)
	{
	    total += 266;
	}

	else if (dessert == 3)
	{
	    total += 75;
	}
	
	c.println ("Your total Calorie count is " + total + ".");

    } // main method
} // TheNewCCC class
