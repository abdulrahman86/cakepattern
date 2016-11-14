package services.impl

import dto.Tweet
import services.{AuthServiceComponent, TweetServiceComponent}


trait DefaultTweetServiceComponent extends TweetServiceComponent with AuthServiceComponent{

  override type TweetService = DefaultTweetService.type

  object DefaultTweetService extends TweetServiceLike{
    override def tweet(tweet: Tweet): Unit = {
      println("Tweet: " + tweet)
    }
  }
}
