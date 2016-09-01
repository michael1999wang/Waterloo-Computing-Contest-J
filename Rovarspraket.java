// The "Rovarspraket" class.
import java.awt.*;
import hsa.Console;

public class Rovarspraket
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	String consonants = "bcdfghjklmnpqrstvwxyz";
	String vowels = "aeiou";
	String current = "";
	String input = c.readString ();

	for (int i = 0 ; i < input.length () ; i++)
	{
	    for (int e = 0 ; e < consonants.length () ; e++)
	    {
		if (String.valueOf (input.charAt (i)).equalsIgnoreCase (String.valueOf (consonants.charAt (e))))
		{
		    current += String.valueOf (input.charAt (i));
		    if (String.valueOf (input.charAt (i)).equalsIgnoreCase ("z"))
		    {
			current += "z";
		    }
		    else
		    {
			current += String.valueOf (consonants.charAt (consonants.indexOf (input.charAt (i) + 1)));
		    }
		}
		if (e < vowels.length ())
		{
		    if (String.valueOf (input.charAt (i)).equalsIgnoreCase (String.valueOf (vowels.charAt (e))))
		    {
		    current += String.valueOf (input.charAt (i));
		    }
		}
	    }
	}

	c.println (current);

    } // main method
} // Rovarspraket class
