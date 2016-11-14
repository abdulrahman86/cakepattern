package app

import config.ServiceConfig

trait Application{

  self: Application.Dependencies =>
}

object Application{
  type Dependencies = ServiceConfig
}
