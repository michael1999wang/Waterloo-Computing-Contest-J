// The "AssigningPartners" class.
import java.awt.*;
import hsa.Console;
import java.io.*;
import java.util.*;

public class AssigningPartners
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int result = 0;

	int numberOfStudents = c.readInt ();
	String students1 = c.readLine ();
	String students2 = c.readLine ();

	String students1Array[] = new String [numberOfStudents];
	String students2Array[] = new String [numberOfStudents];

	StringTokenizer st1 = new StringTokenizer (students1);
	StringTokenizer st2 = new StringTokenizer (students2);

	for (int i = 0 ; i < numberOfStudents ; i++)
	{
	    students1Array [i] = st1.nextToken ();
	}

	for (int i = 0 ; i < numberOfStudents ; i++)
	{
	    students2Array [i] = st2.nextToken ();
	}

	for (int i = 0 ; i < numberOfStudents ; i++)
	{
	    if (students1Array [i].equalsIgnoreCase (students2Array [i]))
	    {
		c.println ("bad");
		break;
	    }
	    else
	    {
		if (i == 3)
		{
		    c.println ("good");
		}
	    }
	}

    } // main method
} // AssigningPartners class
