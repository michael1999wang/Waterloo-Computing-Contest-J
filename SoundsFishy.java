// The "SoundsFishy" class.
import java.awt.*;
import hsa.Console;

public class SoundsFishy
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int readings[] = new int [4];

	for (int i = 0 ; i < 4 ; i++)
	{
	    readings [i] = c.readInt ();
	}

	c.println ();

	if (readings [0] == readings [1] && readings [1] == readings [2] && readings [2] == readings [3])
	{
	    c.println ("Fish at constant depth");
	}

	else if (readings [0] < readings [1] && readings [1] < readings [2] && readings [2] < readings [3])
	{
	    c.println ("Fish Rising");
	}

	else if (readings [0] > readings [1] && readings [1] > readings [2] && readings [2] > readings [3])
	{
	    c.println ("Fish Diving");
	}
	
	else
	{
	c.println ("No fish");
	}

    } // main method
} // SoundsFishy class
