// The "PigLatin" class.
import java.awt.*;
import hsa.Console;
import java.util.*;

public class PigLatin
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	String line = c.readLine ();
	String first, noFirst, currentWord, result = "";

	StringTokenizer st = new StringTokenizer (line);

	int count = st.countTokens ();

	String sentance[] = new String [count];

	for (int i = 0 ; i < count ; i++)
	{
	    currentWord = st.nextToken ();

	    first = currentWord.substring (0, 1);

	    noFirst = currentWord.substring (1, count);

	    if (!(first.equalsIgnoreCase ("A") || first.equalsIgnoreCase ("E") || first.equalsIgnoreCase ("I") || first.equalsIgnoreCase ("O") || first.equalsIgnoreCase ("U")))
	    {
		result = noFirst + first;
		result = result.concat ("ay");
	    }
	    sentance [i] = result;
	}

	c.println ();
	c.print ("The sentance translated into pig latin is:\n");

	for (int i = 0 ; i < count ; i++)
	{
	    c.print (sentance [i] + " ");
	}

    } // main method
} // PigLatin class


