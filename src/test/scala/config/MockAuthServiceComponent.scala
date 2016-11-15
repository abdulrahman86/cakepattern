package config

import dto.User
import services.AuthServiceComponent
import org.specs2.mock.Mockito
import services.impl.DefaultUserAuthServiceComponent


trait MockAuthServiceComponent extends AuthServiceComponent with Mockito{

  override type AuthService = AuthServiceLike
  val userAuthService = mock[AuthServiceLike]

}
