package com.jxjxgo.mysql.connection

import slick.jdbc.PostgresProfile

import scala.concurrent.Await
import scala.concurrent.duration.Duration
/**
  * Created by satendra on 16/3/16.
  */
trait DBImpl extends DBComponent {
  val profile = PostgresProfile

  import profile.api._

  val db: Database = DB.connectionPool
}

private[connection] object DB {
  import PostgresProfile.api._

  val connectionPool = Database.forConfig("db")
}