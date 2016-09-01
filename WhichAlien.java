// The "WhichAlien" class.
import java.awt.*;
import hsa.Console;

public class WhichAlien
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	c.println ("How many antennas?");
	int antennas = c.readInt ();
	c.println ("How many eyes?");
	int eyes = c.readInt ();

	if (antennas > 3 && eyes < 5)
	{
	    c.println ("TroyMartian");
	}

	if (antennas < 7 && eyes > 1)
	{
	    c.println ("VladSaturnian");
	}

	if (antennas < 3 && eyes < 4)
	{
	    c.println ("GraemeMercurian");
	}

    } // main method
} // WhichAlien class


