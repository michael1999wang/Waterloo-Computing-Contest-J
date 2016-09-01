// The "ISpeakTXTMSG" class.
import java.awt.*;
import hsa.Console;

public class ISpeakTXTMSG
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	c.print ("Enter phrase> ");
	String abbv = c.readString ();

	if (abbv.equalsIgnoreCase ("CU"))
	{
	    c.println ("See you");
	}
	else if (abbv.equalsIgnoreCase (":-)"))
	{
	    c.println ("I'm happy");
	}
	else if (abbv.equalsIgnoreCase (":-("))
	{
	    c.println ("I'm unhappy");
	}
	else if (abbv.equalsIgnoreCase (";-)"))
	{
	    c.println ("Wink");
	}
	else if (abbv.equalsIgnoreCase (":-P"))
	{
	    c.println ("Stick out my tongue");
	}
	else if (abbv.equalsIgnoreCase ("(˜.˜)"))
	{
	    c.println ("Sleepy");
	}
	else if (abbv.equalsIgnoreCase ("TA"))
	{
	    c.println ("Totally awesome");
	}
	else if (abbv.equalsIgnoreCase ("CCC"))
	{
	    c.println ("Canadian Computing Competition");
	}
	else if (abbv.equalsIgnoreCase ("CUZ"))
	{
	    c.println ("Because");
	}
	else if (abbv.equalsIgnoreCase ("TY"))
	{
	    c.println ("Thank-you");
	}
	else if (abbv.equalsIgnoreCase ("YW"))
	{
	    c.println ("You're welcome");
	}
	else if (abbv.equalsIgnoreCase ("TTYL"))
	{
	    c.println ("Talk to you later");
	}

    } // main method
} // ISpeakTXTMSG class
