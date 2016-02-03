package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by tuxin on 1/26/16.
 */

/**
 * ````````````
 */
public class TweetList {
    private ArrayList<Tweet> tweets= new ArrayList<Tweet>();

    /**
     * this is a class that makes a list of tweet
     * @param tweet this is a single object made from tweet class.
     *              add means add this object to this list
     */
    public void add(Tweet tweet){
        if (tweets.contains(tweet))
            throw new IllegalArgumentException("This tweet already exist");
        tweets.add(tweet);

    }

    /**
     *
     * @param tweet takes a tweet as a arguments
     * @return if this tweet is already in the list
     */
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
