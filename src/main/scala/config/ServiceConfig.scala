package config

import services.{AuthServiceComponent, TweetServiceComponent}


trait ServiceConfig {

  self: ServiceConfig.Depedencies =>
}

object ServiceConfig{
  type Depedencies = AuthServiceComponent with TweetServiceComponent
}
