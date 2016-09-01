// The "From1987To2013" class.
import java.awt.*;
import hsa.Console;

public class From1987To2013
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	String numberString;

	int startingYear = c.readInt ();

	int stringNumber = startingYear;

	while (true)
	{
	    numberString = String.valueOf (stringNumber);
	    stringNumber++;
	}

    } // main method
} // From1987To2013 class
