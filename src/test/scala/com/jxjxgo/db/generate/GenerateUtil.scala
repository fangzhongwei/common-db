package com.jxjxgo.db.generate

/**
  * Created by fangzhongwei on 2016/10/24.
  */
object GenerateUtil extends App{
  slick.codegen.SourceCodeGenerator.main(
      Array("slick.jdbc.PostgresProfile", "org.postgresql.Driver", "jdbc:postgresql://192.168.181.141/postgres", "postgres", "com.lawsofnature.postgres.repo", "postgres", "Fang1234")
  )
}
