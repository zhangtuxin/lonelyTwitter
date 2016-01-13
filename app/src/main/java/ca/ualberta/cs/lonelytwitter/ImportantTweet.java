package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by tuxin on 1/12/16.
 */
public class ImportantTweet extends Tweet implements Tweetable {
    public ImportantTweet(String message, Date date) {
        super(message, date);
        this.setIsimportant(Boolean.TRUE);
    }

    public ImportantTweet(String message) {
        super(message);
        this.setIsImportant(Boolean.TRUE);
    }
}
