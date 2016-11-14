package app

import config.DefaultServiceConfig
import dto.{Tweet, User}

object MyApplication extends App with Application with DefaultServiceConfig{

  val user: User = User("test", "test")
  tweetService.tweet(user, Tweet("This is my first tweet"))
}
