// The "SlotMachines" class.
import java.awt.*;
import hsa.Console;

public class SlotMachines
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	c.println ("How many quarters does Martha have in the jar?");
	int quarters = c.readInt ();
	c.println ("How many times has the first machine been played since paying out?");
	int first = c.readInt ();
	c.println ("How many times has the second machine been played since paying out?");
	int second = c.readInt ();
	c.println ("How many times has the third machine been played since paying out?");
	int third = c.readInt ();
	
    } // main method
} // SlotMachines class
