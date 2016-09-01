// The "SpeedFines" class.
import java.awt.*;
import hsa.Console;

public class SpeedFines
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	c.print ("Enter the speed limit: ");
	int speedLimit = c.readInt ();
	c.print ("Enter the record speed of the car: ");
	int speedCar = c.readInt ();
	int speedDifference = speedCar - speedLimit;

	if (speedLimit >= speedCar)
	{
	    c.println ("Congratulations, you are within the speed limit!");
	}
	else if (speedLimit < speedCar)
	{
	    c.print ("You are speeding and your fine is $");
	    if (speedDifference > 0 && speedDifference <= 20)
	    {
			c.println ("100");
	    }
	    else if (speedDifference > 20 && speedDifference <= 30)
	    {
			c.println ("270");
	    }
	    else if (speedDifference > 30)
	    {
	    c.println ("500");
	    }
	}

    } // main method
} // SpeedFines class
