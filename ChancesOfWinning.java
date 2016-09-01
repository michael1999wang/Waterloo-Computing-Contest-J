// The "ChancesOfWinning" class.
import java.awt.*;
import hsa.Console;
import java.util.*;

public class ChancesOfWinning
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int favoriteTeam = c.readInt ();
	int numberOfGames = c.readInt ();
	int scores[] [] = new int [4] [numberOfGames];
	String scoreString[] = new String [numberOfGames];
	String currentToken = "";

	StringTokenizer st;

	for (int i = 0 ; i < numberOfGames ; i++)
	{
	    scoreString [i] = c.readString ();
	}

	for (int i = 0 ; i < numberOfGames ; i++)
	{
	    st = new StringTokenizer (scoreString [i]);
	    for (int e = 0 ; e < 4 ; e++)
	    {
		currentToken = st.nextToken ();
		scores [e] [i] = Integer.parseInt (currentToken);
	    }
	}

    } // main method
} // ChancesOfWinning class
