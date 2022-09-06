/**
 * A program to carry on conversations with a human user.
 * This version: 
 * <ul><li>
 *    Uses advanced search for keywords 
 * </li></ul> 
 *    
 * @author Laurie White
 * @version April 2012
 */
public class Magpie3
{
	/**
	 * Get a default greeting
	 * 
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.length() == 0)
		{
			response = "Say something, please.";
		}
		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("dog") >= 0
                || statement.indexOf("cat") >= 0)
        {
                response = "Tell me more about your pets.";
        }
        else if (statement.indexOf("Mr.") >= 0)
        {
        response = "He sounds like a good teacher.";
    }
    else if (statement.indexOf("Ms.") >= 0)
    {
        response = "She sounds like a good teacher.";
    }
    else if (statement.indexOf("raindrop") >= 0)
    {
        response = "Droptop.";
    }
    else if (statement.indexOf("joke") >= 0)
    {
        response = "Sing! That's they key to it. You don't even have to be able to talk. Just sing and get famous. James Brown's been singing for 20 years.\nI don't know what the fuck James is talking about! Idon't understand shit James says!\nI met him once at Saturday Night Live, walked up to him and said \"James, i love your stuff\". And James said [mimics James Brown talk]. And whatever James is saying is some really heavy shit to James.Because it's really meaningful shit to James..\nBecause at the end of every sentence\nhe ends it off with:[mimics James Brown \'huh\' grunt]\nHe meant that shit that he just said boy! Everything just\"Huh!\"\nAnd you start putting the needle back \'What the fuck did I just miss?\"\nThat's a James Bown lyric. He wrote taht shit!\nHe's writing a song and:\n\"I need a word in here:Heaay!\"\n\"That's good, I like that!\"\n[Sings 'Superbad (Parts 1& 2) by James Brown']\n[Mimics James Brown responding to Band Members as shown in 'Talkin' Louad and Sayin' Nothing']\nBand be going:\n\"What the fuck is James Talking about?\"\nI don't know but we're getting paid, keep singing\'";
}
else if (statement.indexOf("rap") >= 0)
{
    response = "Thought I was done but that wasn't the case\ngot a new stack that I threw in your face\nGot a new girl and she so Mila Kunis\nInfinity pool and a statue taht's Buddhist\nGot bottles and bottles and bottles of Grino\nSaw I was rich, now they fucking with'Bino\nBrown leather bag, the vacation Messina\nThe boat in the harbor, I rule the Marina\n10K for the drinks, now they say I'm insane\n It's been a minute Hedi Slimmane\nI been black, lucrative. since Danity Kane\n Who came back for a minute, now everything changed\nHigh as a kite, lime in the light\nY'all nihhas might whine every night\n i ain't invite all these  people to my motherfuckin' house\n\"Get the fuck out of my house!\"";
}
        else 
        {
            response = getRandomResponse();
        }
		return response;
	}

	/**
	 * Search for one word in phrase. The search is not case
	 * sensitive. This method will check that the given goal
	 * is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no").
	 * 
	 * @param statement
	 *            the string to search
	 * @param goal
	 *            the string to search for
	 * @param startPos
	 *            the character of the string to begin the
	 *            search at
	 * @return the index of the first occurrence of goal in
	 *         statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal,
			int startPos)
	{
		String phrase = statement.trim();
		// The only change to incorporate the startPos is in
		// the line below
		int psn = phrase.toLowerCase().indexOf(
				goal.toLowerCase(), startPos);

		// Refinement--make sure the goal isn't part of a
		// word
		while (psn >= 0)
		{
			// Find the string of length 1 before and after
			// the word
			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn)
						.toLowerCase();
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(
						psn + goal.length(),
						psn + goal.length() + 1)
						.toLowerCase();
			}

			// If before and after aren't letters, we've
			// found the word
			if (((before.compareTo("a") < 0) || (before
					.compareTo("z") > 0)) // before is not a
											// letter
					&& ((after.compareTo("a") < 0) || (after
							.compareTo("z") > 0)))
			{
				return psn;
			}

			// The last position didn't work, so let's find
			// the next, if there is one.
			psn = phrase.indexOf(goal.toLowerCase(),
					psn + 1);

		}

		return -1;
	}

	/**
	 * Search for one word in phrase. The search is not case
	 * sensitive. This method will check that the given goal
	 * is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no"). The search
	 * begins at the beginning of the string.
	 * 
	 * @param statement
	 *            the string to search
	 * @param goal
	 *            the string to search for
	 * @return the index of the first occurrence of goal in
	 *         statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		return response;
	}

}
