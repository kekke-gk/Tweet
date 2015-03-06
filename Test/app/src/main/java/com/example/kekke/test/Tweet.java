package com.example.kekke.test;

import android.content.AsyncTaskLoader;
import android.content.Context;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * Created by kekke on 15/03/06.
 */
public class Tweet extends AsyncTaskLoader<Void>{
    private String tweetText;

    public Tweet(Context context, String tweetText){
        super(context);
        this.tweetText = tweetText;
    }

    @Override
    public Void loadInBackground(){

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("0PUgmBFO0BYnzoH7DhWO0XT0q")
                .setOAuthConsumerSecret("5GJRc6kZZdG1Ea9U8JUpCo75E53BzWsVvWsg4RyugQRPtPBcI9")
                .setOAuthAccessToken("3064528423-JOY7ewAfOlxDgogPYgfmBwVyUlXh0AD9KkLuPVX")
                .setOAuthAccessTokenSecret("8QwrXjAYxBm93ZnO7rf9E92s5RVTHXQnBQfSyeV1NnGwa");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        try{
            twitter.updateStatus(tweetText);
        }catch (TwitterException e){
        }
        return null;
    }
}
