// The "DoubleDice" class.
import java.awt.*;
import hsa.Console;

public class DoubleDice
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int rolls = c.readInt ();
	int rollA, rollD, pointA = 100, pointD = 100;

	for (int i = 0 ; i < rolls ; i++)
	{
	    rollA = (int) ((Math.random () * 6) + 1);
	    rollD = (int) ((Math.random () * 6) + 1);
	    c.println (rollA + " " + rollD);
	    if (rollA > rollD)
	    {
		pointD -= rollA;
	    }
	    else if (rollA < rollD)
	    {
		pointA -= rollD;
	    }
	}
    c.println ();
    c.println (pointA);
    c.println (pointD);

    } // main method
} // DoubleDice class
