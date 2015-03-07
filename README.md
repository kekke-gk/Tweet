1. Twitter4Jをライブラリに追加  
http://twitter4j.org/ja/index.html からtwitter4j-4.0.2.zipをダウンロード.  
zipを展開したら,lib/twitter4j-core-4.0.2.jar をライブラリに追加.

2. アプリを登録  
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
  
3. Tweet.javaを書き換える  
Test/app/src/main/java/com/example/kekke/test/Tweet.javaの
 - setOAuthConsumerKey
 - setOAuthConsumerSecret
 - setOAuthAccessToken
 - setOAuthAccessTokenSecret  
を,1でメモしておいたものでそれぞれ書き換える.  


4. 呼び出す  
Tweet tweet = new Tweet(getApplicationContext(), "Hello, World!");  
tweet.forceLoad();  
のように呼び出す.