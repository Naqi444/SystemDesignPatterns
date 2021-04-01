package facade.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 8:03 PM
 */
public class TweetService {

    public void establishConnection(){
        var oauth = new OAuth();
        var requestToken = oauth.requestToken("appKey", "secret");
        var accessToken = oauth.getAccessToken(requestToken);

        var twitterClient = new TwitterClient();
        var tweets = twitterClient.getRecentTweets(accessToken);
    }
}
