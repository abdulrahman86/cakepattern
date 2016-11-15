package config

import services.impl.{DefaultTransactionalComponent, DefaultTweetServiceComponent, DefaultUserAuthServiceComponent}


trait DefaultServiceConfig extends ServiceConfig with DefaultTweetServiceComponent with DefaultUserAuthServiceComponent with DefaultTransactionalComponent{

  override val tweetService: TweetService = DefaultTweetService
}
