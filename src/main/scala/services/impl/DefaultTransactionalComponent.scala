package services.impl

import services.TransactionalComponent

trait DefaultTransactionalComponent extends TransactionalComponent {

  def transactional[T](block: =>T): T = {
    block
  }
}
