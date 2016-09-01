// The "UnFriend" class.
import java.awt.*;
import hsa.Console;

public class UnFriend
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int networkPopulation = c.readInt ();
	int whoInvited[] = new int [networkPopulation];

	for (int i = 0 ; i < networkPopulation ; i++)
	{
	    whoInvited [i] = c.readInt ();
	}

    } // main method
} // UnFriend class
