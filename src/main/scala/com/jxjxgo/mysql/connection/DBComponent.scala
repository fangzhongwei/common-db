package com.jxjxgo.mysql.connection

import slick.jdbc.JdbcProfile

trait DBComponent {

  val profile: JdbcProfile

  import profile.api._

  val db: Database
}
