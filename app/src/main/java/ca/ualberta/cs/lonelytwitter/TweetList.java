package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by tuxin on 1/26/16.
 */
public class TweetList {
    private ArrayList<Tweet> tweets= new ArrayList<Tweet>();

    public void add(Tweet tweet){
        if (tweets.contains(tweet))
            throw new IllegalArgumentException("This tweet already exist");
        tweets.add(tweet);

    }
    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }
    public Tweet getTweet(int index){
        return tweets.get(index);
    }
    public ArrayList<Tweet> getTweets(){
        return tweets;
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);

    }
    public void removeTweet(Tweet tweet){
        tweets.remove(tweet);
    }

    public int getCount(){
        return tweets.size();
    }

}
