// The "RSANumbers" class.
import java.awt.*;
import hsa.Console;

public class RSANumbers
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int numberOfDivisors = 0, divisors = 0;

	c.println ("Enter the lower limit of range");
	int lower = c.readInt ();
	c.println ("Enter the upper limit of range");
	int upper = c.readInt ();

	int difference = (upper - lower) + 1;

	int range[] = new int [difference];

	for (int i = 0 ; i < difference ; i++)
	{
	    range [i] = lower + i;
	}

	for (int i = 0 ; i < difference ; i++)
	{
	    for (int e = 1 ; e <= range [i] ; e++)
	    {
		if (range [i] % e == 0)
		{
		    numberOfDivisors++;
		}
	    }
	    if (numberOfDivisors == 4)
	    {
		divisors++;
	    }
	}

	c.println ("The number of RSA numbers between " + lower + " and " + upper + " is " + divisors);

    } // main method
} // RSANumbers class


