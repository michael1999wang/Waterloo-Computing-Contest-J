// The "TimeOnTask" class.
import java.awt.*;
import hsa.Console;

public class TimeOnTask
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int time = c.readInt ();
	int numberOfChores = c.readInt ();
	int choreTime[] = new int [numberOfChores + 1];
	int choreOrder[] = new int [numberOfChores];
	int timeSoFar = 0, amountOfChores = 0, currentSmallest = 1000;


	for (int i = 0 ; i < numberOfChores ; i++)
	{
	    choreTime [i] = c.readInt ();
	}

	c.println ();

	int temp;
	for (int i = 0 ; i < numberOfChores ; i++)
	{
	    if (choreTime [i] > choreTime [i + 1])
	    {
		temp = choreTime [i];
		choreTime [i] = choreTime [i + 1];
		choreTime [i + 1] = temp;
		i = -1;
	    }
	}

    } // main method
} // TimeOnTask class
