package services


import dto.{Tweet, User}
import services.AuthServiceComponent

trait TweetServiceComponent {

  self: TweetServiceComponent.Dependencies =>

  type TweetService <: TweetServiceLike
  val tweetService: TweetService


  trait TweetServiceLike{

    final def tweet(user: User, tweet: Tweet): String = {
      if(userAuthService.authenticateUser(user)) {
        this.tweet(tweet)
      }
      else{
        "Could not tweet"
      }
    }

    def tweet(tweet: Tweet): String
  }
}

object TweetServiceComponent {
  type Dependencies = AuthServiceComponent
}
