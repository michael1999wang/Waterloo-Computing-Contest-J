// The "VoteCount" class.
import java.awt.*;
import hsa.Console;

public class VoteCount
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int length = c.readInt ();
	String line = c.readString ();
	int aCount = 0, bCount = 0;
	char letter;

	c.println ();

	for (int i = 0 ; i < length ; i++)
	{
	    letter = line.charAt (i);
	    if (String.valueOf (letter).equalsIgnoreCase ("A"))
	    {
		aCount++;
	    }
	    else if (String.valueOf (letter).equalsIgnoreCase ("B"))
	    {
		bCount++;
	    }
	}

	if (aCount > bCount)
	{
	    c.println ("A");
	}
	else if (aCount == bCount)
	{
	    c.println ("Tie");
	}
	else if (aCount < bCount)
	{
	    c.println ("B");
	}

    } // main method
} // VoteCount class
