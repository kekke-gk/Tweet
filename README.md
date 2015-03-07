1. アプリを登録
https://apps.twitter.com/ から"Create New App"をクリック.  
Name, Description, Websiteを適当に記入する.  
このアカウントのみで利用するならCallbackURLは必要ない.  
**注意** *アカウントに電話番号を登録しておかないとアプリを登録できなくなった*  
登録したらPermissionsタブから"Read only"以外を選択する.  
Keys and Access Tokensタブから自分のAccessTokenを生成する.  
 - Consumer Key
 - Consumer Secret
 - Access Token
 - Access Token Secret
をメモしておく.
  
2. Tweet.javaを書き換える
Test/app/src/main/java/com/example/kekke/test/Tweet.javaの
 - setOAuthConsumerKey
 - setOAuthConsumerSecret
 - setOAuthAccessToken
 - setOAuthAccessTokenSecret
を,1でメモしておいたものでそれぞれ書き換える.  


3. 呼び出す
Tweet tweet = new Tweet(getApplicationContext(), "Hello, World!");  
tweet.forceLoad();  
のように呼び出す.