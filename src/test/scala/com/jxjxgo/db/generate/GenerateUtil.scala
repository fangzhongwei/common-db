package com.jxjxgo.db.generate

/**
  * Created by fangzhongwei on 2016/10/24.
  */
object GenerateUtil extends App {
//  slick.codegen.SourceCodeGenerator.main(Array("slick.jdbc.PostgresProfile", "org.postgresql.Driver", "jdbc:postgresql://localhost/account", "account", "com.jxjxgo.account.repo", "postgres", "Fang1234"))
  slick.codegen.SourceCodeGenerator.main(Array("slick.jdbc.PostgresProfile", "org.postgresql.Driver", "jdbc:postgresql://localhost/sms", "sms", "com.jxjxgo.sms.repo", "postgres", "Fang1234"))
}
