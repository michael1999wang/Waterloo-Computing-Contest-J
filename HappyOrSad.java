// The "HappyOrSad" class.
import java.awt.*;
import hsa.Console;
import java.io.*;

public class HappyOrSad
{
    static Console c;           // The output console

    public static void main (String[] args) throws IOException
    {
	c = new Console ();

	BufferedReader br = new BufferedReader (new FileReader ("D:\\School\\Grade 11\\Computer Science\\Strings\\emote.txt"));
	String line;
	int lastIndex = 0;
	int happyCount = 0;
	int sadCount;

	while (true)
	{
	    line = br.readLine ();
	    if (line == null)
	    {
		break;
	    }

	    while (lastIndex != -1)
	    {

		lastIndex = line.indexOf (":-)", lastIndex);

		if (lastIndex != -1)
		{
		    happyCount++;
		    lastIndex += ":-)".length ();
		}
		c.println (happyCount);
	    }

	    happyCount = line.indexOf (":-)");
	    sadCount = line.indexOf (":-(");

	    c.println (line);

	    if (happyCount > sadCount)
	    {
		c.println ("Happy");
	    }
	    else if (happyCount == sadCount)
	    {
		c.println ("Unsure");
	    }
	    else if (happyCount < sadCount)
	    {
		c.println ("Sad");
	    }
	    else if (happyCount == 0 && sadCount == 0)
	    {
		c.println ("None");
	    }
 
	}

    } // main method
} // HappyOrSad class
