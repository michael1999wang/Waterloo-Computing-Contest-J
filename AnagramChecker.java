// The "AnagramChecker" class.
import java.awt.*;
import hsa.Console;

public class AnagramChecker
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	c.print ("Enter first phrase> ");
	String firstPhrase = c.readLine ();
	c.print ("Enter second phrase> ");
	String secondPhrase = c.readLine ();

	int firstPhraseLength = firstPhrase.length ();
	int secondPhraseLength = secondPhrase.length ();
	String currentLetter;

	int firstPhraseArray[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int secondPhraseArray[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	String alphabet[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

	for (int i = 0 ; i < firstPhraseLength ; i++)
	{
	    currentLetter = Character.toString (firstPhrase.charAt (i));
	    for (int e = 0 ; e < 26 ; e++)
	    {
		if (currentLetter.equalsIgnoreCase (alphabet [e]))
		{
		    firstPhraseArray [e]++;
		}
	    }
	}

	for (int i = 0 ; i < secondPhraseLength ; i++)
	{
	    currentLetter = Character.toString (secondPhrase.charAt (i));
	    for (int e = 0 ; e < 26 ; e++)
	    {
		if (currentLetter.equalsIgnoreCase (alphabet [e]))
		{
		    secondPhraseArray [e]++;
		}
	    }
	}

	for (int i = 0 ; i < 26 ; i++)
	{
	    if (firstPhraseArray [i] != secondPhraseArray [i])
	    {
		c.println ("Is not an anagram");
		break;
	    }
	    else
	    {
		if (i == 25)
		{
		    c.println ("Is an anagram");
		}
	    }
	}

    } // main method
} // AnagramChecker class
