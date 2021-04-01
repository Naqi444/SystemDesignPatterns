package facade.Exercise;

public class Demo {
  public static void show() {
    var tweetService = new TweetService();
    tweetService.establishConnection();
  }
}
