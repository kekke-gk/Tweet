# HOW TO USE
  
Androidでツイートを行うサンプル.  
  
Test/app/src/main/java/com/example/kekke/test/Tweet.javaの  
setOAuthConsumerKey  
setOAuthConsumerSecret  
setOAuthAccessToken  
setOAuthAccessTokenSecret  
を書き換える.  
  
Tweet tweet = new Tweet(getApplicationContext(), "Hello, World!");  
tweet.forceLoad();  
のように呼び出す.