// The "CellPhoneMessaging" class.
import java.awt.*;
import hsa.Console;
import java.util.*;

public class CellPhoneMessaging
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	String userInput = "", input = "", alphabet = "abcdefghijklmnopqrstuvwxyz", current;
	int strokes = 0, temp;

	while (!userInput.equalsIgnoreCase ("halt"))
	{
	    userInput = c.readString ();
	    input += userInput + " ";
	}

	StringTokenizer st = new StringTokenizer (input);

	int amountOfWords = st.countTokens () - 1;

	int time[] = new int [amountOfWords];

	for (int i = 0 ; i < amountOfWords ; i++)
	{
	    current = st.nextToken ();

	    for (int e = 0 ; e < current.length () ; e++)
	    {
		temp = alphabet.indexOf (current.charAt (i)) + 1;
		if (temp % 3 == 0)
		{
		    strokes += 3;
		}
		else if (temp % 2 == 0)
		{
		    strokes += 2;
		}
		else if (temp % 1 == 0)
		{
		    strokes += 1;
		}
	    }

	    time [i] += strokes;
	}

	for (int i = 0 ; i < amountOfWords ; i++)
	{
	    c.println (time [i]);
	}

    } // main method
} // CellPhoneMessaging class
