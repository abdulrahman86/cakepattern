package services

import dto.User


trait AuthServiceComponent {

  type AuthService <: AuthServiceLike

  val userAuthService: AuthService

  trait AuthServiceLike{
    def authenticateUser(user: User): Boolean
  }
}
