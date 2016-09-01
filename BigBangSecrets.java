// The "BigBangSecrets" class.
import java.awt.*;
import hsa.Console;

public class BigBangSecrets
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	String alphabet = "ABCDEFGHJKLMNOPQRSTUVWXYZ";
	int shift = c.readInt ();
	String message = c.readString ();
	int length = message.length ();
	int position = 0;
	String result;

	for (int i = 0 ; i < 5 ; i++)
	{
	    alphabet += alphabet;
	}

	for (int i = 0 ; i < length ; i++)
	{
	    position = alphabet.indexOf (message.indexOf (i));
	    
	}

    } // main method
} // BigBangSecrets class
