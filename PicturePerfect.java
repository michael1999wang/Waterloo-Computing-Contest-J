// The "PicturePerfect" class.
import java.awt.*;
import hsa.Console;

public class PicturePerfect
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int perimeter = 0, x = 0, y = 0;

	int numberOfPictures = c.readInt ();

	if (numberOfPictures % (int) (Math.round (Math.sqrt (numberOfPictures))) == 0)
	{
	    x = (int) (Math.round (Math.sqrt (numberOfPictures)));
	    y = x;
	    perimeter = x*4;
	    c.println ("Minimum perimeter is " + perimeter + " with dimensions " + x + " x " + y);
	}

    } // main method
} // PicturePerfect class
