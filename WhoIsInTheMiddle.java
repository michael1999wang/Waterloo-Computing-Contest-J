// The "WhoIsInTheMiddle" class.
import java.awt.*;
import hsa.Console;

public class WhoIsInTheMiddle
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int weight1 = c.readInt ();
	int weight2 = c.readInt ();
	int weight3 = c.readInt ();
	
	c.println ();
	
	if (weight1 > weight2 && weight2 > weight3 && weight1 > weight3)
	{
	    c.println (weight2);
	}
	else if (weight1 < weight2 && weight2 > weight3 && weight1 > weight3)
	{
	    c.println (weight1);
	}
	else if (weight1 < weight2 && weight2 < weight3 && weight1 > weight3)
	{
	    c.println (weight2);
	}
	else if (weight1 < weight2 && weight2 < weight3 && weight1 < weight3)
	{
	    c.println (weight2);
	}
	else if (weight1 < weight2 && weight2 > weight3 && weight1 < weight3)
	{
	    c.println (weight3);
	}
	else if (weight1 > weight2 && weight2 < weight3 && weight1 > weight3)
	{
	    c.println (weight3);
	}

    } // main method
} // WhoIsInTheMiddle class
