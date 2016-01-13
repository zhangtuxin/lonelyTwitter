/**
 * Created by tuxin on 1/12/16.
 */
package ca.ualberta.cs.lonelytwitter;
import java.util.Date;

import ca.ualberta.cs.lonelytwitter.TweetTooLongException;

public class Tweet {
    private Date date;
    private String message;
    protected Boolean isImportant;

    public  abstract Boolean;
    public void setIsImportant(Boolean isImportant) {
        this.isImportant = isImportant;
    }

    public Boolean getIsImportant() {
        return isImportant;
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public Tweet(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() >140){
            throw new TweetTooLongException() ;
        }
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
