package services


import dto.{Tweet, User}
import services.AuthServiceComponent

trait TweetServiceComponent {

  self: TweetServiceComponent.Dependencies =>

  type TweetService <: TweetServiceLike
  val tweetService: TweetService


  trait TweetServiceLike{

    final def tweet(user: User, tweet: Tweet): Unit = {
      if(userAuthService.authenticateUser(user)) this.tweet(tweet)
    }

    def tweet(tweet: Tweet): Unit
  }
}

object TweetServiceComponent {
  type Dependencies = AuthServiceComponent
}
