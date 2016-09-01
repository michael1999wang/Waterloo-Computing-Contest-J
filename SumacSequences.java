// The "SumacSequences" class.
import java.awt.*;
import hsa.Console;

public class SumacSequences
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int terms[] = new int [100];
	terms [0] = c.readInt ();
	terms [1] = c.readInt ();

	int count = 3;

	for (int i = 2 ; i < 100 ; i++)
	{
	    terms [i] = terms [i - 2] - terms [i - 1];
	    if (terms [i] > terms [i - 1])
	    {
		break;
	    }
	    else
	    {
		count++;
	    }
	}
	c.println (count);

    } // main method
} // SumacSequences class
