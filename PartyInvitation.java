// The "PartyInvitation" class.
import java.awt.*;
import hsa.Console;

public class PartyInvitation
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int line = c.readInt ();
	int people[] = new int [line];
	int rounds = c.readInt ();
	int remove[] = new int [rounds];

	for (int i = 0 ; i < line ; i++)
	{
	    people [i] = i + 1;
	}

	for (int i = 0 ; i < rounds ; i++)
	{
	    remove [i] = c.readInt ();
	}

	for (int i = 0 ; i < line ; i++)
	{
	    if ((people [i] / remove [i]) * remove [i] == people [i])
	    {
		people [i] = 0;
	    }
	}

    } // main method
} // PartyInvitation class
