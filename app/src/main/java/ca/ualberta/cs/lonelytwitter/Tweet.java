package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by romansky on 1/12/16.
 */
public abstract class Tweet {
    protected Date date;
    protected String message;

    public abstract Boolean isImportant();

    /**
     * This is the super class. sub classes are normaltweet and important tweet.
     * @param date arguments
     * @param message
     */
    public Tweet(Date date, String message) {
        this.date = date;
        this.message = message;
    }

    /**
     * consturctor
     * @param message
     */
    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
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
     * @return the message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * set the tweet.message to message
     * @param message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    /**
     * set the date to the given date
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * combines the date and the message together
     * @return
     */
    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}
