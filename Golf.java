// The "Golf" class.
import java.awt.*;
import hsa.Console;

public class Golf
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int distance = c.readInt ();
	int clubs = c.readInt ();

	int total = 0;

	for (int i = 0 ; i < clubs ; i++)
	{
	    total += c.readInt ();
	}

	if (total == distance)
	{
	    c.println ("Roberta wins in " + clubs + " strokes.");
	}
	else
	{
	    c.println ("Roberta acknowledges defeat.");
	}

    } // main method
} // Golf class
