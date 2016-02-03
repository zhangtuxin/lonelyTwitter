package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by romansky on 1/12/16.
 */
public class NormalTweet extends Tweet implements Tweetable {
    /**
     * constructor
     * @param date takes the date
     * @param message takes the message
     *                construct them together
     */
    public NormalTweet(Date date, String message) {
        super(date, message);
    }

    /**
     *
     * @param message also a constructor . takes the message construct a tweet.
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     *
     * @return the date
     */
    public Date getDate() {
        return this.date;
    }

    /**
     *
     * @return the message in the tweet
     */
    public String getMessage() {
        return this.message;
    }

    /**\
     *
     * @return this is the normal tweet class. so it is not important
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
