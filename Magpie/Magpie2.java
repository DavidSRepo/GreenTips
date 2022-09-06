/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting   
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
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
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
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
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
        else if (whichResponse == 4)
        {
            response = "Cool story bro!";
        }
        else if (whichResponse == 5)
        {
            response = "Haha that's funny.";
        }

        return response;
    }
}
