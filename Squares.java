// The "Squares" class.
import java.awt.*;
import hsa.Console;

public class Squares
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	c.println ("Number of tiles?");
	int input = c.readInt ();
	double root = Math.sqrt (input);
	int side = (int) Math.floor (root);
	c.println ("The largest square has a side length " + side);
	
    } // main method
} // Squares class
