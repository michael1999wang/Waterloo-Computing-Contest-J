// The "SnakesAndLadders" class.
import java.awt.*;
import hsa.Console;

public class SnakesAndLadders
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int sum, square = 0;

	while (square != 100)
	{
	    c.println ("Enter the sum of dice:");
	    sum = c.readInt ();
	    square += sum;
	    c.println ("You are now on square " + square);
	    c.println ();
	}
	c.println ("You Win!");

    } // main method
} // SnakesAndLadders class
