// The "AmeriCanadian" class.
import java.awt.*;
import hsa.Console;

public class AmeriCanadian
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	String words = "", tempLine;

	c.println ("Enter words to be translated: ");

	while (!words.equalsIgnoreCase ("quit!"))
	{
	    words = c.readString ();

	    if (words.length () > 4)
	    {
		if (words.substring (words.length () - 2).equalsIgnoreCase ("or"))
		{
		    tempLine = words.substring (0, words.length() -2);
		    tempLine += "our";
		    c.println (tempLine);
		}
	    }
	    else
	    {
		c.println (words);
	    }
	}

	System.exit (0);

    } // main method
} // AmeriCanadian class


