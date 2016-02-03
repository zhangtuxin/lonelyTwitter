package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by romansky on 1/12/16.
 */
public class ImportantTweet extends Tweet implements Tweetable {
    /**
     * This method show if a tweet is Impotant
     * @return true if it is important. false otherwise
     */
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    /**Actually it is inherient from parent.
     * A simple construtor
     * @param date takes the date
     * @param message takes the message
     *                construct a tweet(important)
     */

    public ImportantTweet(Date date, String message) {
        super(date, message);
    }

    /**
     * construtor
     * @param message takes a message
     */

    public ImportantTweet(String message) {
        super(message);
    }

    /**
     *
     * @return returns the date
     */
    public Date getDate() {
        return this.date;
    }

    /**
     *
     * @return "!imPORTANT + the message" combined them together
     */
    public String getMessage() {
        return "!IMPORTANT! " + this.message;
    }
}
