// The "Censor" class.
import java.awt.*;
import hsa.Console;
import java.io.*;
import java.util.*;

public class Censor
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	StringTokenizer st;

	int numberOfWords;
	String currentWord, newLine = "";

	int numberOfLines = c.readInt ();
	String lines[] = new String [numberOfLines];

	for (int i = 0 ; i < numberOfLines ; i++)
	{
	    lines [i] = c.readLine ();
	}

	c.println ();

	for (int i = 0 ; i < numberOfLines ; i++)
	{
	    st = new StringTokenizer (lines [i]);
	    numberOfWords = st.countTokens ();
	    for (int e = 0 ; e < numberOfWords ; e++)
	    {
		currentWord = st.nextToken ();
		if (currentWord.length () == 4)
		{
		    newLine += "****";
		    newLine += " ";
		}
		else
		{
		    newLine += currentWord;
		    newLine += " ";
		}
	    }
	    c.println (newLine);
	    newLine = "";
	}

    } // main method
} // Censor class
