// The "TermsOfOffice" class.
import java.awt.*;
import hsa.Console;

public class TermsOfOffice
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	c.println ("Enter the current year:");
	int current = c.readInt ();
	c.println ("Enter a future year:");
	int future = c.readInt ();

	int year = current;

	while (future > year)
	{
	    c.println ("All positions change in the year " + year);
	    year += 60;
	}

    } // main method
} // TermsOfOffice class
