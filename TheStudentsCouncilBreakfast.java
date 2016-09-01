// The "TheStudentsCouncilBreakfast" class.
import java.awt.*;
import hsa.Console;

public class TheStudentsCouncilBreakfast
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	c.println ("Cost of PINK tickets:");
	int pink = c.readInt ();
	c.println ("Cost of GREEN tickets:");
	int green = c.readInt ();
	c.println ("Cost of RED tickets:");
	int red = c.readInt ();
	c.println ("Cost of ORANGE tickets:");
	int orange = c.readInt ();
	c.println ("How much must be raised with ticket sales?");
	int raised = c.readInt ();

    } // main method
} // TheStudentsCouncilBreakfast class
