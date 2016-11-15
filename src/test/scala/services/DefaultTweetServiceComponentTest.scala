package services

import config.MockAuthServiceComponent
import dto.{Tweet, User}
import services.impl.DefaultTweetServiceComponent
import org.specs2.mutable.Specification
import org.specs2.mock.Mockito
import org.specs2.specification.core.SpecStructure


object DefaultTweetServiceComponentTest extends Specification with Mockito{


  "Tweet" should {
    "happen" in {
          val tweetServiceComponent = new DefaultTweetServiceComponent with MockAuthServiceComponent {
            override val tweetService = DefaultTweetService
          }
          val user = new User("test", "test")
          tweetServiceComponent.userAuthService.authenticateUser(user) returns true

          (tweetServiceComponent.tweetService.tweet(user, Tweet("This is my first tweet"))) mustEqual ("This is my first tweet")
    }
  }
}
