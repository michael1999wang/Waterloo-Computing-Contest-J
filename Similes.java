// The "Similes" class.
import java.awt.*;
import hsa.Console;

public class Similes
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int numberOfAdjectives = c.readInt ();
	int numberOfNouns = c.readInt ();

	String adjectives[] = new String [numberOfAdjectives];
	String nouns[] = new String [numberOfNouns];

	for (int i = 0 ; i < numberOfAdjectives ; i++)
	{
	    adjectives [i] = c.readString ();
	}

	for (int i = 0 ; i < numberOfNouns ; i++)
	{
	    nouns [i] = c.readString ();
	}

	for (int i = 0 ; i < numberOfAdjectives ; i++)
	{
	    for (int e = 0 ; e < numberOfNouns ; e++)
	    {
		c.print (adjectives [i]);
		c.print (" as ");
		c.println (nouns [e]);
	    }
	}

    } // main method
} // Similes class
