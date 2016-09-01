// The "Calendar2" class.
import java.awt.*;
import hsa.Console;

public class Calendar2
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	c.println ("Enter day:");
	int dayThatMonthBegins = c.readInt ();
	c.println ();
	c.println ("Enter the number of days in the month: ");
	int numberOfDays = c.readInt ();
	c.println ();

	c.print ("Sun ");
	c.print ("Mon ");
	c.print ("Tue ");
	c.print ("Wed ");
	c.print ("Thr ");
	c.print ("Fri ");
	c.println ("Sat ");

	for (int i = 0; i < (dayThatMonthBegins*4) - 1; i++)
	{
	c.print (" ");
	}
	
	for (int i = 1 ; i <= numberOfDays ; i++)
	{
	    c.print (i,4);
	}

    } // main method
} // Calendar2 class
