package services


trait TransactionalComponent {

  def transactional[T](block: =>T): T
}
