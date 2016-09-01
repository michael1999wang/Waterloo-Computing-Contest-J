// The "TriangleTimes" class.
import java.awt.*;
import hsa.Console;

public class TriangleTimes
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int side1 = c.readInt ();
	int side2 = c.readInt ();
	int side3 = c.readInt ();

	c.println ();

	if (side1 + side2 + side3 == 180)
	{
	    if (side1 == side2 && side2 == side3 && side1 == side3)
	    {
		c.println ("Equilateral");
	    }
	    else if (side1 == side2 || side2 == side3 || side1 == side2)
	    {
		c.println ("Isosceles");
	    }
	    else
	    {
		c.println ("Scalene");
	    }
	}
	else
	{
	    c.println ("Error");
	}

    } // main method
} // TriangleTimes class
