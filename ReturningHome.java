// The "ReturningHome" class.
import java.awt.*;
import hsa.Console;

public class ReturningHome
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	String direction [] = new String [5];
	String street [] = new String [5];
	
	for (int i = 0; i < 5; i++)
	{
	direction [i] = c.readString ();
	street [i] = c.readString ();
	if (street [i].equalsIgnoreCase ("school"))
	{
	break;
	}
	}
	
    } // main method
} // ReturningHome class
