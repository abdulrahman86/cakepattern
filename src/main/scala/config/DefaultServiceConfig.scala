package config

import services.impl.{DefaultTweetServiceComponent, DefaultUserAuthServiceComponent}


trait DefaultServiceConfig extends ServiceConfig with DefaultTweetServiceComponent with DefaultUserAuthServiceComponent{

  override val tweetService: TweetService = DefaultTweetService
}
