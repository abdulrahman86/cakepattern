package services.impl

import dto.User
import services.AuthServiceComponent


trait DefaultUserAuthServiceComponent extends AuthServiceComponent{

  type AuthService = DefaultAuthService.type
  override val userAuthService = DefaultAuthService

  object DefaultAuthService extends AuthServiceLike{
    override def authenticateUser(user: User): Boolean = true
  }
}
