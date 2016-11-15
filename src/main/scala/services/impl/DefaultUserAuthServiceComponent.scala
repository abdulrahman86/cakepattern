package services.impl

import dto.User
import services.{AuthServiceComponent, TransactionalComponent}


trait DefaultUserAuthServiceComponent extends AuthServiceComponent{

  self: DefaultUserAuthServiceComponent.Dependencies =>

  type AuthService = DefaultAuthService.type
  override val userAuthService = DefaultAuthService

  object DefaultAuthService extends AuthServiceLike{
    override def authenticateUser(user: User): Boolean = transactional(true)
  }
}

object DefaultUserAuthServiceComponent{
  type Dependencies = TransactionalComponent
}
